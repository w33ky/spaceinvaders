package de.w33ky;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class MyLevel {
	MyRenderer myRenderer;
	
	public MyLevel(MyRenderer renderer) {
		this.myRenderer = renderer;
	}
	
	public void run_level() {
		MyGameStatistics game = new MyGameStatistics();
		
		ArrayList<ArrayList<MyAnimatedSprite>> monsters = new ArrayList<ArrayList<MyAnimatedSprite>>();		
		ArrayList<MyPicture> monster1_pics = new ArrayList<MyPicture>();
		monster1_pics.add(PicturePool.monster1());
		monster1_pics.add(PicturePool.monster12());
		
		for (int n = 0; n < 5; n++) {
			monsters.add(new ArrayList<MyAnimatedSprite>());
			for (int i = 0; i < 10; i++) {
				monsters.get(n).add(new MyAnimatedSprite(monster1_pics, i*15, 280-n*15));
			}
		}
		
		MyAnimatedSprite spaceship = new MyAnimatedSprite(PicturePool.spaceship1(), 100, 20);
		spaceship.add_picture(PicturePool.spaceship2());
		
		MySprite bg = new MySprite(PicturePool.bg_noise(myRenderer.get_res_width(), myRenderer.get_res_height()), 0, 0);
		MyNumberSprite fps_counter = new MyNumberSprite(0, 181, 2);
		MySprite tscore = new MySprite(PicturePool.score(), 2, 2);
		MySprite tfps = new MySprite(PicturePool.fps(), 165, 2);
		MyNumberSprite nscore = new MyNumberSprite(0, 26, 2);
		
		REvBackground revbg = new REvBackground(100, bg);
		REvMoveMonsters revmvm = new REvMoveMonsters(100, monsters);
		REvMonsterAnimation revma = new REvMonsterAnimation(500, monsters);
		REvSpaceshipAnimation revspa = new REvSpaceshipAnimation(150, spaceship);
		REvKeyAction revmsp = new REvKeyAction(15, spaceship, game);
		REvStatiscticsAnimation revstat = new REvStatiscticsAnimation(100, game, fps_counter, nscore);

		while(game.run && !Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			revbg.check();
			myRenderer.render_sprite(bg);
			
			revma.check();
			revmvm.check();
			for (int n = 0; n < monsters.size(); n++) {
				for (int i = 0; i < monsters.get(n).size(); i++) {
					myRenderer.render_sprite(monsters.get(n).get(i));
				}
			}
			
			revspa.check();
			revmsp.check();
			myRenderer.render_sprite(spaceship);
			
			game.calculate_fps();
			revstat.check();
			myRenderer.render_sprite(tscore);
			myRenderer.render_sprite(nscore);
			myRenderer.render_sprite(tfps);
			myRenderer.render_sprite(fps_counter);
			
			myRenderer.update();
		}
	}
}

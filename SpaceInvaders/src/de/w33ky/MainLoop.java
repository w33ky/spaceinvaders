package de.w33ky;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class MainLoop {
	public static void main(String[] argv) throws LWJGLException {
		MyRenderer myRenderer = new MyRenderer(200, 300, 2);
		MyLevel level = new MyLevel(myRenderer);
		boolean menu_run = true;
		int menu_select = 1;
		int run_level = 0;
		
		MySprite bg = new MySprite(PicturePool.bg_noise(myRenderer.get_res_width(), myRenderer.get_res_height()), 0, 0);
		
		MyTextSprite tspaceinvaders = new MyTextSprite("spaceinvaders", 20, 275);
		MyTextSprite tstart = new MyTextSprite("start game", 20, 260);
		MyTextSprite thighscore = new MyTextSprite("highscore", 20, 252);
		MyTextSprite tclose = new MyTextSprite("close", 20, 244);
		
		REvBackground revbg = new REvBackground(100, bg);
		
		while(menu_run && !Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			revbg.check();
			myRenderer.render_sprite(bg);
			
			tstart.pos_x = 20;
			thighscore.pos_x = 20;
			tclose.pos_x = 20;
			
			if (menu_select == 1) {
				tstart.pos_x = 25;
			}
			
			if (menu_select == 2) {
				thighscore.pos_x = 25;
			}
			
			if (menu_select == 3) {
				tclose.pos_x = 25;
			}
			
			myRenderer.render_sprite(tspaceinvaders);
			myRenderer.render_sprite(tstart);
			myRenderer.render_sprite(thighscore);
			myRenderer.render_sprite(tclose);
			
			myRenderer.update();
			
			while (Keyboard.next()) {
				if (Keyboard.getEventKeyState()) {
					if (Keyboard.getEventKey() == Keyboard.KEY_UP) {
						if (menu_select > 1)
							menu_select--;
					}
					if (Keyboard.getEventKey() == Keyboard.KEY_DOWN) {
						if (menu_select < 3)
							menu_select++;
					}
					if (Keyboard.getEventKey() == Keyboard.KEY_RETURN) {
						if (menu_select == 1) {
							run_level = 1;
						}
						if (menu_select == 3) {
							menu_run = false;
						}
					}
				}
			}
			
			if (run_level != 0) {
				level.run_level();
			}
			
			run_level = 0;
		}
		
		myRenderer.destroy();
	}
}

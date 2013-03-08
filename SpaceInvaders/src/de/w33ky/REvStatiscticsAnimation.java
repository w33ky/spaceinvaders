package de.w33ky;

public class REvStatiscticsAnimation extends MyRepeatedEvent {
	private MyNumberSprite fps_counter;
	private MyGameStatistics game;
	private MyNumberSprite nscore;
	
	public REvStatiscticsAnimation(long each_ms, MyGameStatistics game, MyNumberSprite fps_counter,  MyNumberSprite nscore) {
		super(each_ms);
		this.fps_counter = fps_counter;
		this.game = game;
		this.nscore = nscore;
	}

	@Override
	void doEvent() {
		fps_counter.set_number(game.get_fps());
		nscore.set_number(game.score);
	}

}

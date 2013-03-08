package de.w33ky;

import org.lwjgl.input.Keyboard;

public class REvKeyAction extends MyRepeatedEvent {
	private MyAnimatedSprite spaceship;
	private MyGameStatistics game;
	private int direction;
	
	public REvKeyAction(long each_ms, MyAnimatedSprite spaceship, MyGameStatistics game) {
		super(each_ms);
		this.spaceship = spaceship;
		this.game = game;
		direction =  0;
	}
	
	private boolean move_left(int steps) {
		if (spaceship.pos_x > 0) {
			spaceship.pos_x -= steps;
			return true;
		}
		return false;
	}
	
	private boolean move_right(int steps) {
		if (spaceship.pos_x < 191) {
			spaceship.pos_x += steps;
			return true;
		}
		return false;
	}

	@Override
	void doEvent() {
		while (Keyboard.next()) {
			if (Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
					direction = 1;
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
					direction = 2;
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
					game.run = false;
				}
			}
			if (!Keyboard.getEventKeyState()) {
				if (Keyboard.getEventKey() == Keyboard.KEY_LEFT) {
					direction = 0;
				}
				if (Keyboard.getEventKey() == Keyboard.KEY_RIGHT) {
					direction = 0;
				}
			}
		}
		
		if (direction == 1) {
			move_left(1);
		}
		
		if (direction == 2) {
			move_right(1);
		}
	}

}

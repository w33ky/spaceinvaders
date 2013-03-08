package de.w33ky;

public class REvSpaceshipAnimation extends MyRepeatedEvent {
	private MyAnimatedSprite spaceship;
	
	public REvSpaceshipAnimation(long each_ms, MyAnimatedSprite spaceship) {
		super(each_ms);
		this.spaceship = spaceship;
	}
	
	@Override
	void doEvent() {
		spaceship.next();
	}
}

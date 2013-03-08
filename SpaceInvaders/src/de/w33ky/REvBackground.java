package de.w33ky;

public class REvBackground extends MyRepeatedEvent{
	MySprite sprite;
	public REvBackground(long each_ms, MySprite sprite) {
		super(each_ms);
		this.sprite = sprite;
	}
	
	@Override
	void doEvent() {
		sprite.picture = PicturePool.bg_noise(sprite.get_width(), sprite.get_height());
	}

}

package de.w33ky;

public class MySprite {
	public MyPicture picture;
	
	public int pos_x, pos_y;
	
	public MySprite(MyPicture picture, int pos_x, int pos_y) {
		this.picture = picture;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
	}
	
	public int get_width() {
		return picture.get_width();
	}
	
	public int get_height() {
		return picture.get_height();
	}
	
	public int get_value(int x, int y) {
		return picture.get_value(x, y);
	}
}

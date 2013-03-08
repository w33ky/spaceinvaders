package de.w33ky;

import java.util.ArrayList;

public class MyAnimatedSprite extends MySprite {
	public ArrayList<MyPicture> pictures;
	int n;
	
	public MyAnimatedSprite(ArrayList<MyPicture> pictures, int pos_x, int pos_y) {
		super(pictures.get(0), pos_x, pos_y);
		this.pictures = pictures;
		n = 0;
	}
	
	public MyAnimatedSprite(MyPicture picture, int pos_x, int pos_y) {
		super(picture, pos_x, pos_y);
		pictures = new ArrayList<MyPicture>();
		pictures.add(picture);
		n = 0;
	}
	
	public void add_picture(MyPicture picture) {
		pictures.add(picture);
	}
	
	public void next() {
		if (n < (pictures.size() - 1)) {
			n++;
		}
		else {
			n = 0;
		}
		picture = pictures.get(n);
	}
}

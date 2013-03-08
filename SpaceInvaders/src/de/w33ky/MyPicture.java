package de.w33ky;

public class MyPicture {
	public int[][] picture;
	
	public MyPicture(int[][] picture) {
		this.picture = picture;
	}
	
	public int get_width() {
		return picture.length;
	}
	
	public int get_height() {
		return picture[0].length;
	}
	
	public int get_value(int x, int y) {
		return picture[x][y];
	}
	
	public boolean add_picture(MyPicture npicture, int pos_x, int pos_y) {
		if (npicture.get_width()  +pos_x > this.get_width() || npicture.get_height() + pos_y > this.get_height()) {
			return false;
		}
		else {
			for(int x = 0; x < npicture.get_width(); x++) {
				for(int y = 0; y < npicture.get_height(); y++) {
					picture[x+pos_x][y+pos_y] = npicture.picture[x][y];
				}
			}
		}
		return true;
	}
}

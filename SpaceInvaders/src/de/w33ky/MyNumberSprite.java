package de.w33ky;

import java.util.ArrayList;

public class MyNumberSprite extends MySprite {
	public MyNumberSprite(int n, int pos_x, int pos_y) {
		super(null, pos_x, pos_y);
		this.set_number(n);
	}
	
	public void set_number(int n) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while(n > 0) {
			int rest = n%10;
			digits.add(rest);
			n = n - rest;
			n = n/10;
		}
		
		MyPicture pic;
		
		if(digits.size() > 0) {
			pic = new MyPicture(new int[4*digits.size()][5]);
			for(int i = digits.size() - 1; i >= 0; i--) {
				switch(digits.get(i)) {
					case 0:
						pic.add_picture(PicturePool.no0(), 4*(digits.size()-1-i), 0);
						break;
					case 1:
						pic.add_picture(PicturePool.no1(), 4*(digits.size()-1-i), 0);
						break;
					case 2:
						pic.add_picture(PicturePool.no2(), 4*(digits.size()-1-i), 0);
						break;
					case 3:
						pic.add_picture(PicturePool.no3(), 4*(digits.size()-1-i), 0);
						break;
					case 4:
						pic.add_picture(PicturePool.no4(), 4*(digits.size()-1-i), 0);
						break;
					case 5:
						pic.add_picture(PicturePool.no5(), 4*(digits.size()-1-i), 0);
						break;
					case 6:
						pic.add_picture(PicturePool.no6(), 4*(digits.size()-1-i), 0);
						break;
					case 7:
						pic.add_picture(PicturePool.no7(), 4*(digits.size()-1-i), 0);
						break;
					case 8:
						pic.add_picture(PicturePool.no8(), 4*(digits.size()-1-i), 0);
						break;
					case 9:
						pic.add_picture(PicturePool.no9(), 4*(digits.size()-1-i), 0);
						break;
				}
			}
		}
		else {
			pic = PicturePool.no0();
		}
		picture = pic;
	}
}

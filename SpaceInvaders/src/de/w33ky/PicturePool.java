package de.w33ky;

public class PicturePool {
	public static int[][] convert(int[][] pic) {
		return make_sw(flip(pic));
	}
	
	public static int[][] flip(int[][] pic) {
		int[][] ipic = new int[pic[0].length][pic.length];
		for (int x = 0; x < pic.length; x++) {
			for (int y = 0; y < pic[0].length; y++) {
				ipic[y][x] = pic[pic.length-x-1][y];
			}
		}
		return ipic;
	}
	
	public static int[][] make_sw(int[][] pic) {
		int[][] swpic = new int[pic.length][pic[0].length];
		for (int x = 0; x < pic.length; x++) {
			for (int y = 0; y < pic[0].length; y++){
				if (pic[x][y] > 0) {
					swpic[x][y] = 255;
				}
				else {
					swpic[x][y] = -1;
				}
			}
		}
		return swpic;
	}
	
	public static MyPicture monster1() {
		int[][] ret = {
			{0,0,1,0,0,0,0,0,1,0,0},
			{0,0,0,1,0,0,0,1,0,0,0},
			{0,0,1,1,1,1,1,1,1,0,0},
			{0,1,1,0,1,1,1,0,1,1,0},
			{1,1,1,1,1,1,1,1,1,1,1},
			{1,0,1,1,1,1,1,1,1,0,1},
			{1,0,1,0,0,0,0,0,1,0,1},
			{0,0,0,1,1,0,1,1,0,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture monster12() {
		int[][] ret = {
			{0,0,1,0,0,0,0,0,1,0,0},
			{0,0,0,1,0,0,0,1,0,0,0},
			{1,0,1,1,1,1,1,1,1,0,1},
			{1,1,1,0,1,1,1,0,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1,1,0,0},
			{0,0,1,0,0,0,0,0,1,0,0},
			{0,0,0,1,1,0,1,1,0,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture spaceship1() {
		int[][] ret = {
			{0,0,0,0,1,0,0,0,0},
			{0,0,0,0,1,0,0,0,0},
			{0,0,0,1,1,1,0,0,0},
			{0,0,0,1,1,1,0,0,0},
			{0,0,1,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,1,0},
			{1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1},
			{1,0,0,1,1,1,0,0,1},
			{0,0,0,1,1,1,0,0,0},
			{0,0,1,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture spaceship2() {
		int[][] ret = {
			{0,0,0,0,1,0,0,0,0},
			{0,0,0,0,1,0,0,0,0},
			{0,0,0,1,1,1,0,0,0},
			{0,0,0,1,1,1,0,0,0},
			{0,0,1,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,1,0},
			{1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1},
			{1,0,0,1,1,1,0,0,1},
			{0,0,0,1,1,1,0,0,0},
			{0,0,1,1,1,1,1,0,0},
			{0,1,1,1,1,1,1,1,0},
			{0,1,0,1,0,1,0,1,0},
			{0,0,0,0,1,0,0,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no0() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no1() {
		int[][] ret = {
			{0,0,1},
			{0,0,1},
			{0,0,1},
			{0,0,1},
			{0,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no2() {
		int[][] ret = {
			{1,1,1},
			{0,0,1},
			{1,1,1},
			{1,0,0},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no3() {
		int[][] ret = {
			{1,1,1},
			{0,0,1},
			{1,1,1},
			{0,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no4() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{1,1,1},
			{0,0,1},
			{0,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no5() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,1,1},
			{0,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no6() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,1,1},
			{1,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no7() {
		int[][] ret = {
			{1,1,1},
			{0,0,1},
			{0,0,1},
			{0,0,1},
			{0,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no8() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,1,1},
			{1,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture no9() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,1,1},
			{0,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture score() {
		int[][] ret = {
			{1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,0},
			{1,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1},
			{1,1,1,0,1,0,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0},
			{0,0,1,0,1,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1},
			{1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture fps() {
		int[][] ret = {
			{1,1,1,0,1,1,1,0,1,1,1,0,0},
			{1,0,0,0,1,0,1,0,1,0,0,0,1},
			{1,1,1,0,1,1,1,0,1,1,1,0,0},
			{1,0,0,0,1,0,0,0,0,0,1,0,1},
			{1,0,0,0,1,0,0,0,1,1,1,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture block() {
		int[][] ret = {
			{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charA() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,1,1},
			{1,0,1},
			{1,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charB() {
		int[][] ret = {
			{1,1,0},
			{1,0,1},
			{1,1,0},
			{1,0,1},
			{1,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charC() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,0,0},
			{1,0,0},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charD() {
		int[][] ret = {
			{1,1,0},
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{1,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charE() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,1,1},
			{1,0,0},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charF() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,1,1},
			{1,0,0},
			{1,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charG() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,0,1},
			{1,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charH() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{1,1,1},
			{1,0,1},
			{1,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charI() {
		int[][] ret = {
			{1},
			{1},
			{1},
			{1},
			{1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charJ() {
		int[][] ret = {
			{0,1},
			{0,1},
			{0,1},
			{0,1},
			{1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charK() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{1,1,0},
			{1,0,1},
			{1,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charL() {
		int[][] ret = {
			{1,0,0},
			{1,0,0},
			{1,0,0},
			{1,0,0},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charM() {
		int[][] ret = {
			{1,0,0,0,1},
			{1,1,0,1,1},
			{1,0,1,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charN() {
		int[][] ret = {
			{1,0,0,1},
			{1,1,0,1},
			{1,0,1,1},
			{1,0,0,1},
			{1,0,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charO() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charP() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,1,1},
			{1,0,0},
			{1,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charQ() {
		int[][] ret = {
			{1,1,1,1},
			{1,0,0,1},
			{1,0,0,1},
			{1,0,1,1},
			{1,1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charR() {
		int[][] ret = {
			{1,1,1},
			{1,0,1},
			{1,1,1},
			{1,1,0},
			{1,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charS() {
		int[][] ret = {
			{1,1,1},
			{1,0,0},
			{1,1,1},
			{0,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charT() {
		int[][] ret = {
			{1,1,1},
			{0,1,0},
			{0,1,0},
			{0,1,0},
			{0,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charU() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charV() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{1,0,1},
			{0,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charW() {
		int[][] ret = {
			{1,0,1,0,1},
			{1,0,1,0,1},
			{1,0,1,0,1},
			{1,0,1,0,1},
			{0,1,0,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charX() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{0,1,0},
			{1,0,1},
			{1,0,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charY() {
		int[][] ret = {
			{1,0,1},
			{1,0,1},
			{0,1,1},
			{0,0,1},
			{0,1,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charZ() {
		int[][] ret = {
			{1,1,1},
			{0,0,1},
			{0,1,0},
			{1,0,0},
			{1,1,1}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture charSpace() {
		int[][] ret = {
			{0,0,0},
			{0,0,0},
			{0,0,0},
			{0,0,0},
			{0,0,0}
		};
		return new MyPicture(convert(ret));
	}
	
	public static MyPicture bg_noise(int res_width, int res_height) {
		int[][] ret = new int[res_width][res_height];
		for (int x = 0; x < res_width; x++) {
			for (int y = 0; y < res_height; y++) {
				int c = (int)((float)Math.random() * 20);
				ret[x][y] = c;
			}
		}
		return new MyPicture(ret);
	}
}

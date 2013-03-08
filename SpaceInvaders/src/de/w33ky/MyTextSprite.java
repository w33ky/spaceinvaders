package de.w33ky;

public class MyTextSprite extends MySprite {
	public String text;
	
	public MyTextSprite(String text, int pos_x, int pos_y) {
		super(null, pos_x, pos_y);
		this.text = text;
		set_text(text);
	}

	public void set_text(String text) {
		MyPicture oldpic = new MyPicture(new int[1][5]);
		MyPicture toadd;
		String ntext = text.toUpperCase();
		for (int i = 0; i < ntext.length(); i++) {
			char c = ntext.charAt(i);
			switch(c) {
				case 'A': toadd = PicturePool.charA(); break;
				case 'B': toadd = PicturePool.charB(); break;
				case 'C': toadd = PicturePool.charC(); break;
				case 'D': toadd = PicturePool.charD(); break;
				case 'E': toadd = PicturePool.charE(); break;
				case 'F': toadd = PicturePool.charF(); break;
				case 'G': toadd = PicturePool.charG(); break;
				case 'H': toadd = PicturePool.charH(); break;
				case 'I': toadd = PicturePool.charI(); break;
				case 'J': toadd = PicturePool.charJ(); break;
				case 'K': toadd = PicturePool.charK(); break;
				case 'L': toadd = PicturePool.charL(); break;
				case 'M': toadd = PicturePool.charM(); break;
				case 'N': toadd = PicturePool.charN(); break;
				case 'O': toadd = PicturePool.charO(); break;
				case 'P': toadd = PicturePool.charP(); break;
				case 'Q': toadd = PicturePool.charQ(); break;
				case 'R': toadd = PicturePool.charR(); break;
				case 'S': toadd = PicturePool.charS(); break;
				case 'T': toadd = PicturePool.charT(); break;
				case 'U': toadd = PicturePool.charU(); break;
				case 'V': toadd = PicturePool.charV(); break;
				case 'W': toadd = PicturePool.charW(); break;
				case 'X': toadd = PicturePool.charX(); break;
				case 'Y': toadd = PicturePool.charY(); break;
				case 'Z': toadd = PicturePool.charZ(); break;
				case ' ': toadd = PicturePool.charSpace(); break;
				default: toadd = new MyPicture(new int[1][5]);
			}
			picture = new MyPicture(new int[oldpic.get_width()+toadd.get_width()+1][5]);
			picture.add_picture(oldpic, 0, 0);
			picture.add_picture(toadd, oldpic.get_width()-1, 0);
			oldpic = picture;
		}
	}
}

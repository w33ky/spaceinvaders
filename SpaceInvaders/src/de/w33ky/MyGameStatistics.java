package de.w33ky;

import org.lwjgl.Sys;

public class MyGameStatistics {
	private long time;
	private long lasttime;
	private long lastsecond;
	private int fpscount;
	private int fps;
	
	public int score;
	
	public boolean run;
	
	public MyGameStatistics() {
		time = (Sys.getTime() * 1000) / Sys.getTimerResolution();
		lasttime = 0;
		lastsecond = 0;
		fpscount = 0;
		fps = 0;
		score = 0;
		this.run = true;
	}
	
	public void calculate_fps() {
		lasttime = time;
		time = (Sys.getTime() * 1000) / Sys.getTimerResolution();
		if (time - lastsecond > 1000) {
			lastsecond = time;
			fps = fpscount;
			fpscount = 0;
		}
		else {
			fpscount++;
		}
	}
	
	public int get_fps() {
		return fps;
	}
	
	public void limit_fps(int x) {
		if (time - lasttime < (long)(1000/x)) {
			try {
				Thread.sleep((long)(1000/x) - (time - lasttime));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

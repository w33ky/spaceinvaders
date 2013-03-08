package de.w33ky;

import org.lwjgl.Sys;

public abstract class MyRepeatedEvent {
	public long each_ms;
	public long last_time;
	
	public MyRepeatedEvent(long each_ms) {
		this.each_ms = each_ms;
		last_time = 0;
	}
	
	public boolean check() {
		long time = (Sys.getTime() * 1000) / Sys.getTimerResolution();
		if (time - last_time >= each_ms) {
			last_time = time;
			this.doEvent();
			return true;
		}
		else {
			return false;
		}
	}
	
	abstract void doEvent();
}

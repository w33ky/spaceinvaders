package de.w33ky;

import java.util.ArrayList;

public class REvMonsterAnimation extends MyRepeatedEvent {
	private ArrayList<ArrayList<MyAnimatedSprite>> monsters;
	public REvMonsterAnimation(long each_ms, ArrayList<ArrayList<MyAnimatedSprite>> monsters) {
		super(each_ms);
		this.monsters = monsters;
	}
	
	@Override
	void doEvent() {
		for (int n = 0; n < monsters.size(); n++) {
			for (int i = 0; i < monsters.get(n).size(); i++) {
				monsters.get(n).get(i).next();
			}
		}
	}
}

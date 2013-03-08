package de.w33ky;

import java.util.ArrayList;

public class REvMoveMonsters extends MyRepeatedEvent {
	private ArrayList<ArrayList<MyAnimatedSprite>> monsters;
	private boolean to_left;
	private boolean wait;
	
	public REvMoveMonsters(long each_ms, ArrayList<ArrayList<MyAnimatedSprite>> monsters) {
		super(each_ms);
		this.monsters = monsters;
		to_left = true;
		wait = false;
	}
	
	private int max_right() {
		int max = 0;
		for (int n = 0; n < monsters.size(); n++) {
			int size = monsters.get(n).size()-1;
			int newmax = monsters.get(n).get(size).pos_x + 11;
			if (newmax > max)
				max = newmax;
		}
		return max;
	}
	
	private int min_left() {
		int min = 200;
		for (int n = 0; n < monsters.size(); n++) {
			int newmin = monsters.get(n).get(0).pos_x;
			if (newmin < min)
				min = newmin;
		}
		return min;
	}
	
	private void move_left(int steps) {
		for (int n = 0; n < monsters.size(); n++) {
			for (int i = 0; i < monsters.get(n).size(); i++) {
				monsters.get(n).get(i).pos_x += steps;
			}
		}
	}
	
	private void move_right(int steps) {
		for (int n = 0; n < monsters.size(); n++) {
			for (int i = 0; i < monsters.get(n).size(); i++) {
				monsters.get(n).get(i).pos_x -= steps;
			}
		}
	}
	
	private void move_down(int steps) {
		for (int n = 0; n < monsters.size(); n++) {
			for (int i = 0; i < monsters.get(n).size(); i++) {
				monsters.get(n).get(i).pos_y -= steps;
			}
		}
	}
	
	@Override
	void doEvent() {
		wait = false;
		if (to_left && max_right() >= 200) {
			to_left = false;
			wait = true;
			move_down(3);
		}
		
		if (!to_left && min_left() <= 0) {
			to_left = true;
			wait = true;
			move_down(3);
		}
		
		if (!wait) {
			if (to_left)
				move_left(1);
			else {
				move_right(1);
			}
		}
	}
}

package com.enums;

public enum Level {
	
	HIGH(3),
	MEDIUM(2),
	LOW(1);
	
	 final int levelcode;
	
	 private Level(int levelcode) {
		this.levelcode=levelcode;
	 }
		public int getLevelCode() {
			return  this.levelcode; // return 10
		}
	}

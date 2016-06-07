package com.nationwide.chapter7;

public class MusicFan extends Fan implements Tailgate {

	public String cheer() {
		return "Wave hands or use lighter app";
	}
	
	public String cheer(int minutes) {
		return "Wave hands for " + minutes + " !";
	}
	
	public String cheer(String bandName) {
		return "Wave hands and Cheer loudly for " + bandName + " !";
	}
	
	public String buffetCheer() {
		//Is this overloading???
		return "fins to the left fins to the right";
	}
	
	public void fillCooler() {
		System.out.println("MusicFan Fill Cooler!!");
	}
}

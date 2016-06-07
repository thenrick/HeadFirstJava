package com.nationwide.chapter7;

public class Fan implements FanBoy, Tailgate {
	
	public String cheer() {
		return "cheer";
	}

	public void fillCooler() {
		System.out.println("fillingCooler!!");
		
	}

	public void joinFanClub() {
		System.out.println("joinFanClub");
		
	}
	
	public void amISuper() {
		System.out.println("In the Super Class!!");
	}

}

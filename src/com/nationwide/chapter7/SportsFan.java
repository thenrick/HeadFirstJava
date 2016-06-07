package com.nationwide.chapter7;

public class SportsFan extends Fan {
	
	public String cheer() {
		return "Yell and Cheer loudly!";
	}
	
	public String cheer(int minutes) {
		return "Yell and Cheer loudly for " + minutes + " !";
	}
	
	public String cheer(String teamName) {
		return "Yell and Cheer loudly for " + teamName + " !";
	}
	
	public void joinFanClub() {
		System.out.println("joinFanClub");
		
	}

}

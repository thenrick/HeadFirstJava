package com.nationwide.chapter7;

public class OperaFan extends Fan implements Tailgate {

	public String cheer() {
		return "Soft clap";
	}
	
	public String cheer(boolean stand) {
		if(stand) {
			return "Stand and Soft clap";
		} else {
			return "Soft clap";
		}
	}
	
	public void callingSuper() {
		super.amISuper();
	}
	
}

package com.nationwide.chapter16.thurston;

public class Point {
	private final double x;
	private final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public int hashCode() {
		return this.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj.getClass() == getClass()) {
			return false;
		}
		return true;
	}
}

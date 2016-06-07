package com.nationwide.chapter16;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<?> listUknown = new ArrayList<A>();
		List<? extends A> listUknown1 = new ArrayList<A>();
		List<? super A> listUknown2 = new ArrayList<A>();

	}

}

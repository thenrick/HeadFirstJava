/**
 * 
 */
package com.nationwide.chapter14;

import java.io.Serializable;

/**
 * @author thenricksen
 * 
 */
public class Deck implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5985273883009150069L;

	private String shape;

	private float size;

	private String deckMaterial;

	/**
	 * 
	 */
	public Deck() {
		super();
		shape = "square";
		size = 40.0f;
		deckMaterial = "cedar";
	}

	public Deck(String shape, float size, String material) {
		super();
		this.shape = shape;
		this.size = size;
		this.deckMaterial = material;
	}

}

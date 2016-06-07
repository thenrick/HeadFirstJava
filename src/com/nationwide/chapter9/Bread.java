package com.nationwide.chapter9;

public class Bread {

	public String flourType;

	public int loafSizeOz;

	public String extraIngredients;

	public String crustType;

	public Bread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param flourType
	 * @param loafSizeOz
	 * @param extraIngredients
	 * @param crustType
	 */
	public Bread(String flourType, int loafSizeOz, String extraIngredients,
			String crustType) {
		super();
		this.flourType = flourType;
		this.loafSizeOz = loafSizeOz;
		this.extraIngredients = extraIngredients;
		this.crustType = crustType;
	}

	/**
	 * @param flourType
	 */
	public Bread(String flourType) {
		super();
		this.flourType = flourType;
	}

	/**
	 * @param flourType
	 * @param loafSizeOz
	 */
	public Bread(String flourType, int loafSizeOz) {
		super();
		this.flourType = flourType;
		this.loafSizeOz = loafSizeOz;
	}

	/**
	 * @param flourType
	 * @param loafSizeOz
	 * @param extraIngredients
	 */
	public Bread(String flourType, int loafSizeOz, String extraIngredients) {
		this.flourType = flourType;
		this.loafSizeOz = loafSizeOz;
		this.extraIngredients = extraIngredients;
	}

	/**
	 * @return the flourType
	 */
	public String getFlourType() {
		return flourType;
	}

	/**
	 * @param flourType
	 *            the flourType to set
	 */
	public void setFlourType(String flourType) {
		this.flourType = flourType;
	}

	/**
	 * @return the loafSizeOz
	 */
	public int getLoafSizeOz() {
		return loafSizeOz;
	}

	/**
	 * @param loafSizeOz
	 *            the loafSizeOz to set
	 */
	public void setLoafSizeOz(int loafSizeOz) {
		this.loafSizeOz = loafSizeOz;
	}

	/**
	 * @return the extraIngredients
	 */
	public String getExtraIngredients() {
		return extraIngredients;
	}

	/**
	 * @param extraIngredients
	 *            the extraIngredients to set
	 */
	public void setExtraIngredients(String extraIngredients) {
		this.extraIngredients = extraIngredients;
	}

	/**
	 * @return the crustType
	 */
	public String getCrustType() {
		return crustType;
	}

	/**
	 * @param crustType
	 *            the crustType to set
	 */
	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}

}
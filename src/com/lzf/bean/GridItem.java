package com.lzf.bean;

public class GridItem {

	private int image;
	private String text;

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public GridItem(int image, String text) {
		super();
		this.image = image;
		this.text = text;
	}

}

package com.lzf.bean;

public class ListItem {
	private String title;
	private String text1;
	private String text2;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public ListItem(String title, String text1, String text2) {
		super();
		this.title = title;
		this.text1 = text1;
		this.text2 = text2;
	}

	public ListItem() {
		super();
	}

}

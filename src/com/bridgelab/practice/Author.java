package com.bridgelab.practice;

public class Author
{
	 private String authorName;
	  int age;
	  String place;

	  // Author class constructor
	  Author(String name, int age, String place)
	  {
	    this.setAuthorName(name);
	    this.age = age;
	    this.place = place;
	  }

	String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}

package com.example.restservicecors;
// TODO: Open a new tab group and open GreetingController. Switch focus between the tab groups and close the second tab group when done
public class Greeting {

	private final long id;
	private final String content;

	//TODO: Make this field private
	public String temp;

	public Greeting() {
		this.id = -1;
		this.content = "";
	}

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}

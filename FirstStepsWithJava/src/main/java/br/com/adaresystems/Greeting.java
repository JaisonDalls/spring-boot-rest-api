package br.com.adaresystems;

public class Greeting {
	private final long id;
	private final String content;
	
	public Greeting(long id, String name) {
		super();
		this.id = id;
		this.content = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return content;
	}
}

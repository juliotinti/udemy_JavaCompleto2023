package model.entities;

public class Sec13_comment {
	private String text;

	public Sec13_comment() 
	{} 
	
	public Sec13_comment(String text) 
	{
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	} 
	
}

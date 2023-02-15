package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Sec13_post 
{
	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment; 
	private String title;
	private String content; 
	private Integer likes; 
	
	private List<Sec13_comment> comments = new ArrayList<>();

	public Sec13_post() {}
	
	public Sec13_post(LocalDateTime  moment, String title, String content, Integer likes) 
	{
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Sec13_comment> getComments() {
		return comments;
	}
	
	public void addComment(Sec13_comment comment){
		comments.add(comment);
	}
	
	public void removeComment(Sec13_comment comment){
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Sec13_comment c : comments)
		{
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
	
	
}

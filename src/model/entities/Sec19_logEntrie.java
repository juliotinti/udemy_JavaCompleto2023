package model.entities;

import java.time.Instant;
import java.util.Objects;

public class Sec19_logEntrie {

	private String username;
	private Instant moment;
	
	public Sec19_logEntrie(String username, Instant moment) {
		this.username = username;
		this.moment = moment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sec19_logEntrie other = (Sec19_logEntrie) obj;
		return Objects.equals(username, other.username);
	} 
	
	
	
	
}

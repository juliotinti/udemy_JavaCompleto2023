package entities;

public class Sec10_rooms 
{
	private int roomID; 
	private String tenantName;
	private String email;
	
	public Sec10_rooms(int roomID) 
	{
		this.roomID = roomID;
	}
	
	public int getRoomID() 
	{
		return roomID;
	}
	
	public String getTenantName() 
	{
		return tenantName;
	}
	
	public void setTenantName(String tenantName) 
	{
		this.tenantName = tenantName;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return roomID + ": " + tenantName + ", " + email + "\n";
	}

}

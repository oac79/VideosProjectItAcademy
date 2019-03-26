package domain;

import java.util.Date;
import java.util.List;

public class User {
	private String name;
	private String surName;
	private String password;
	private Date date;
	private List<Video> videos;

	public User()
		{

		}

	public User(String name, String surName, String password, Date date)
		{
			super();
			this.name = name;
			this.surName = surName;
			this.password = password;
			this.date = date;
		}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public String getSurName()
		{
			return surName;
		}

	public void setSurName(String surName)
		{
			this.surName = surName;
		}

	public String getPassword()
		{
			return password;
		}

	public Date getDate()
		{
			return date;
		}

	public void setVideos(List<Video> videos)
		{
			this.videos = videos;
		}

	public List<Video> getVideos()
		{
			return videos;
		}

	@Override
	public String toString()
		{
			return "User [name=" + name + ", surName=" + surName + ", password= XXXXXX--- " + ", date=" + date + "]";
		}

}

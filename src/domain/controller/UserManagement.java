package domain.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.User;
import domain.Video;

public class UserManagement {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private User user;
	private List<Video> videos;

	public UserManagement(User user, List<Video> videos)
		{
			super();
			this.user = user;
			this.videos = videos;
		}

	public static User inputCreateUser() throws Exception
		{
			String name, surName, password;
			Date date;
			System.out.println("Name: ");
			name = br.readLine();
			System.out.println("surName: ");
			surName = br.readLine();
			System.out.println("Password: ");
			password = br.readLine();
			date = new Date();
			User user = new User(name, surName, password, date);
			return user;
		}

	public static Video inputCreateVideo() throws Exception
		{
			String title, url;
			List<String> tags = new ArrayList<>();
			System.out.println("Title: ");
			title = br.readLine();
			System.out.println("Url:");
			url = br.readLine();
			tags = inputAddTag();
			Video.checkText(tags);
			Video video = new Video(title, url, tags);
			return video;
		}

	public static List<Video> inputAddVideos() throws Exception
		{
			List<Video> videos = new ArrayList<>();
			Video video;
			boolean exit = false;
			int option;
			do
				{
					printMenuVideos();
					option = Integer.parseInt(br.readLine());
					switch (option)
						{
						case 1:
						video = inputCreateVideo();
						videos.add(video);
						exit = false;
							break;
						case 0:
						System.out.println("--Exit--");
						exit = true;
							break;
						default:
						System.out.println("Error");
							break;
						}
				} while (!exit);
			return videos;
		}

	public static List<String> inputAddTag() throws NumberFormatException, IOException
		{
			List<String> tags = new ArrayList<String>();
			String tag;
			boolean exit = false;
			int num;
			do
				{
					printMenuTags();
					num = Integer.parseInt(br.readLine());
					switch (num)
						{
						case 1:
						System.out.println("Tag: ");
						tag = br.readLine();
						tags.add(tag);
						exit = false;
							break;
						case 0:
						System.out.println("--Exit--");
						exit = true;
							break;
						default:
						System.err.println("--ERROR--");
							break;
						}
				} while (!exit);
			return tags;
		}

	public static void printMenuTags()
		{
			System.out.println("[1] Add Tags");
			System.out.println("[0] Exit");
		}

	public static void printMenuVideos()
		{
			System.out.println("[1] Add Video");
			System.out.println("[0] Exit");
		}

	@Override
	public String toString()
		{
			return "UserManagement [user=" + user.toString() + ", videos=" + videos.toString() + "]";
		}
}

package domain.UI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import domain.User;
import domain.Video;
import domain.controller.UserManagement;

public class TestVideo {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception
		{
			User user;
			List<Video> videos = new ArrayList<>();
			UserManagement uManagement;
			user = UserManagement.inputCreateUser();
			videos = UserManagement.inputAddVideos();
			uManagement = new UserManagement(user, videos);
			System.out.println(uManagement.toString());
		}

}

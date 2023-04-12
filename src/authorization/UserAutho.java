package authorization;

import java.util.ArrayList;
import java.util.List;

public class UserAutho {
	static public List<User> userList=new ArrayList<>();
	public static void user(){
		userList.add(new User("rashad", 20, 123458989, "chennai","Rashad&1234"));
		userList.add(new User("mehran", 21, 234567789, "Ambur", "Mehran&1234"));
		userList.add(new User("abrar", 22, 456388292, "chennai", "Abrar&1234"));
		
	}
//	public static void main(String[] args) {
//		user();
//		System.out.println(userList.get(0).getName());
//	}
}

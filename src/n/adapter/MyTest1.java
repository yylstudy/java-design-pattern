package n.adapter;

/**
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		IUserInfo userinfo = new UserInfoAdapter1();
		System.out.println(userinfo.getHomeAddress());
	}
}

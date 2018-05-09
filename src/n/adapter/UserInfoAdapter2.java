package n.adapter;

public class UserInfoAdapter2 implements IUserInfo{
	private IOuterUser outerUser;
	public UserInfoAdapter2(IOuterUser outerUser) {
		this.outerUser = outerUser;
	}
	@Override
	public String getUserName() {
		return (String) outerUser.getUserBaseInfo().get("userName");
	}

	@Override
	public String getHomeAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMobileNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJobPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}

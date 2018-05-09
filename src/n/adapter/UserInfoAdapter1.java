package n.adapter;

public class UserInfoAdapter1 extends OuterUser implements IUserInfo{
	@Override
	public String getUserName() {
		return (String) this.getUserBaseInfo().get("userName");
	}

	@Override
	public String getHomeAddress() {
		return (String)this.getUserHomeInfo().get("homeAddress");
	}

	@Override
	public String getMobileNumber() {
		return (String)this.getUserBaseInfo().get("mobileNumber");
	}

	@Override
	public String getOfficeTelNumber() {
		return (String)this.getUserOfficeInfo().get("officeTelNumber");
	}

	@Override
	public String getJobPosition() {
		return (String)this.getUserOfficeInfo().get("jobPosition");
	}

	@Override
	public String getHomeTelNumber() {
		return (String)this.getUserHomeInfo().get("homeTelNumbner");
	}

}

package n.adapter2;

public class UserInfoAdapter implements IUserInfo{
	private IOuterUserBaseInfo baseInfo;
	private IOuterUserHomeInfo homeInfo;
	private IOuterUserOfficeInfo officeInfo;
	
	public UserInfoAdapter(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
		super();
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
	}

	@Override
	public String getUserName() {
		return (String) baseInfo.getUserBaseInfo().get("userName");
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

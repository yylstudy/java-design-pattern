package x.flyweight;

public class SignInfo4Pool extends SignInfo {
	// ����һ���������ȡ��KEYֵ
	private String key;

	// ���캯�������ͬ��־
	public SignInfo4Pool(String _key) {
		this.key = _key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}

package e.open;

public abstract class Builder {
	//�����Ʒ
	public abstract Product buildProduct();
	/**
	 * ���ò�Ʒ�Ĳ�ͬ���֣��Ի�ò�ͬ�Ĳ�Ʒ
		setPart��������������ã�ʲô������������Ķ��󣬻��һ����ͬ���������
		��ͬ��װ��˳��Ϳ��ܲ�����ͬ�Ĳ�Ʒ
	 */
	public abstract void setPart();
}

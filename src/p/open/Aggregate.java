package p.open;

public interface Aggregate {
	//��������Ȼ��Ԫ�ص�����
	public void add(Object object);
	//����Ԫ��
	public void remove(Object object);
	//�ɵ��������������е�Ԫ��
	public Iterator iterator();
}

package e.builder;

import java.util.ArrayList;

public class Director {
	private ArrayList<String> sequence = new ArrayList();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();

	/*
	 * A���͵ı��۳�ģ�ͣ���start��Ȼ��stop������ʲô���桢����һ��û��
	 */
	public BenzModel getABenzModel() {
		// ��������������һЩ��������Ա��ע��ĵط�
		this.sequence.clear();
		// ABenzModel��ִ��˳��
		this.sequence.add("start");
		this.sequence.add("stop");
		// ����˳�򷵻�һ�����۳�
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	/*
	 * B�ͺŵı��۳�ģ�ͣ����ȷ������棬Ȼ��������Ȼ��ֹͣ��û������
	 */
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	/*
	 * C�ͺŵı������Ȱ������ȣ���ҫ���Ȼ��������Ȼ��ֹͣ
	 */
	public BMWModel getCBMWModel() {
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}

	/*
	 * D���͵ı���ֻ��һ�����ܣ������ܣ������������ܣ���Զ��ֹͣ
	 */
	public BMWModel getDBMWModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.benzBuilder.getCarModel();
	}
	/*
	 * ���ﻹ�����кܶ෽�����������ֹͣ��Ȼ��������������һֱͣ�Ų�������̬���� �����������ʲô˳���ǵ���˵����
	 */
}

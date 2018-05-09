package e.open;

public abstract class Builder {
	//建造产品
	public abstract Product buildProduct();
	/**
	 * 设置产品的不同部分，以获得不同的产品
		setPart方法是零件的配置，什么是零件？其他的对象，获得一个不同零件，或者
		不同的装配顺序就可能产生不同的产品
	 */
	public abstract void setPart();
}

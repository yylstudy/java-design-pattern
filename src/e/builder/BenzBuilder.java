package e.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{
	private CarModel model = new BenzModel(); 
	@Override
	public void setSequence(ArrayList<String> sequence) {
		model.setSequence(sequence);
	}
	@Override
	public CarModel getCarModel() {
		return model;
	}

}

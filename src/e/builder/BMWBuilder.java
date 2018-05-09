package e.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{
	CarModel model = new BMWModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		model.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return model;
	}

}

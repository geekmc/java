package com.adapter.java;

public class TreeElectricAdapter implements ThreeElectricOutlet {
	
	TwoElectricOutlet outlet;
	

	public TreeElectricAdapter(TwoElectricOutlet outlet) {
		super();
		this.outlet = outlet;
	}


	@Override
	public void connectElectricCurrent() {
		outlet.connectElectricCurrent();
	}

}

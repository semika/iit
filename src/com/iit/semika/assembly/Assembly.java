package com.iit.semika.assembly;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends Component {

	private List<Component> components; 

	public Assembly() {
		super();
		this.components = new ArrayList<Component>(); 
	}
	
	public void addComponent(Component component) {
		this.components.add(component); 
	}
	
	@Override
	public Double getCost() {
		Double assemlyCost = 0.0;
		for(Component comp :components) {
			assemlyCost+= comp.getCost();
		}
		return assemlyCost;
	}
}

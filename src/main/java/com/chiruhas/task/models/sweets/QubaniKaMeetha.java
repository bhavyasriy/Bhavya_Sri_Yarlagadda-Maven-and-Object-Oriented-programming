package com.chiruhas.task.models.chocolate.sweets;

import com.chiruhas.task.models.sweets.Sweet;

public class QubaniKaMeetha extends Sweet {
	private String Sweetname;
	public QubaniKaMeetha(int sugar, int sweet, int weight){
		super(sugar,sweet,weight);
	}
	public void setName(String name){
		Sweetname = name;
	}
	public String getSweetname() {
		return Sweetname;
	}
}

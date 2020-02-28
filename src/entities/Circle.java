package entities;

import entities.enums.Color;

public class Circle extends Shape {

	
	private Double raius;
	
	public Circle() {
	super();
	}
	
	public Circle(Color color, Double circle) {
		super(color);
		this.raius = circle;
	}

	public Double getCircle() {
		return raius;
	}

	public void setCircle(Double circle) {
		this.raius = circle;
	}


	@Override
	public double area() {
		return Math.PI * raius * raius;
	}

}

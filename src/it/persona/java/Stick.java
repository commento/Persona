package it.persona.java;

public class Stick extends Tool {
	private int length;
	
	public Stick(int length) {
		super.name = "Stick";
		this.length = length;
	}
	
	@Override
	public void use() {
		System.out.println("Stick is being used");
	}
	
	public void facilitateWalk() {
	}
}

package it.persona.java;

public class Stick extends Tool {
	private int length;
	
	public Stick(int length, String ...purposes) {
		super.name = "Stick";
		for(String p : purposes) {
			super.purposes.add(p);
		}
		this.length = length;
	}
	
	@Override
	public void use() {
	}
}

package it.persona.java;

import java.util.ArrayList;

public abstract class Tool {
	public String name;
	public ArrayList<String> purposes = new ArrayList<String>();
	abstract public void use();
}

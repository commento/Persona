package it.persona.java.abs;

public class Spirit {
	public enum Mood {
		GOOD,
		BAD,
		SO_SO,
		SOS
	}
	
	Mood mood;
	Intensity Intensity;
	
	public Spirit(Mood mood, Intensity intensity) {
		this.mood = mood;
		this.Intensity = intensity;
	}
}

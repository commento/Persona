package it.persona.java.abs;

public class Energy {
	public enum Liveness {
		ALIVE,
		HALF_DEAD,
		DEAD,
		UNDEAD
	}
	
	Intensity intensity;
	Liveness liveness;

	public Energy(Intensity intensity, Liveness liveness) {
		this.intensity = intensity;
		this.liveness = liveness;	
	}
}

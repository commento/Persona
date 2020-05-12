package it.persona.java.abs;

public class Energy {
	public enum Liveness {
		ALIVE,
		HALF_DEAD,
		DEAD,
		UNDEAD{
	        @Override
	        public Liveness next() {
	            return null;
	        };
		};
	    public Liveness next() {
	        return values()[ordinal() + 1];
	    }
	}
	
	Intensity intensity;
	Liveness liveness;

	public Energy(Intensity intensity, Liveness liveness) {
		this.intensity = intensity;
		this.liveness = liveness;	
	}
}

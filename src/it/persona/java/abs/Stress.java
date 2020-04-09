package it.persona.java.abs;

public class Stress {
	
	public enum Reason {
		WORK,
		CONFLICTS,
		DISCUSSION,
		DISAPPOINTMENT,
		INCOMMUNICABILITY
	}
	
	public enum Level {
		LOW,
		MEDIUM,
		HIGH,
		EXAUSTION,
		NERVOUS_BREAKDOWN{
	        @Override
	        public Level next() {
	            return null;
	        };
		};
		
	    public Level next() {
	        return values()[ordinal() + 1];
	    }
	}
	
	private Level level;
	
	
	public Stress() {
		this.level = Level.LOW;
	}
	
	public void increaseStress() {
		this.level = this.level.next();
	}

	public Level getStressLevel() {
		return this.level;
	}

}

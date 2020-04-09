package it.persona.java;


public class Language extends Tool {
	
	public enum LanguageType {
		CRY,
		MOTHER_TONGUE,
		FOREIGN_LANGUAGE,
		PROGRAMMING_LANGUAGE,
		
	}
	
	public enum Level {
		LOW,
		MEDIUM,
		UPPER_INTERMEDIATE,
		MOTHER_TONGUE{
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
	
	public Language() {
		this.level = Level.LOW;
	}
	
	public void use() {
		System.out.println("Talking/Crying/Coding");
	}
}

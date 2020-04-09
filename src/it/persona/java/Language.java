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
	
	public Language(String name, Level level, String... purposes) {
		this.level = Level.LOW;
		super.name = name;
		for (String p : purposes) {
			super.purposes.add(p);
		}
	}
	
	public void use() {
		System.out.println("Talking/Crying/Coding");
	}
}

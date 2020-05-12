package it.persona.java.vitamin;

public enum VitaminLevel {
	LOW,
	MEDIUM,
	HIGH{
        @Override
        public VitaminLevel next() {
            return null;
        };
	};
    public VitaminLevel next() {
        return values()[ordinal() + 1];
    }
}

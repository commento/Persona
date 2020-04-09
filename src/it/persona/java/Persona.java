package it.persona.java;

import java.util.HashMap;

import it.persona.java.Language;
import it.persona.java.Language.LanguageType;
import it.persona.java.Language.Level;
import it.persona.java.abs.Energy;
import it.persona.java.abs.Energy.Liveness;
import it.persona.java.abs.Intensity;
import it.persona.java.abs.Spirit;
import it.persona.java.abs.Spirit.Mood;
import it.persona.java.abs.Stress;
import it.persona.java.abs.Stress.Reason;
import it.persona.java.Job;
import it.persona.java.Job.Field;

public class Persona {
	private boolean isAlive = false;
	private Job job;
	private HashMap<Reason, Stress> stressors = new HashMap<Reason, Stress>();
	private HashMap<LanguageType, Language> languages = new HashMap<LanguageType, Language>();
	private Spirit spirit;
	private Energy energy;

	public Persona() {
		this.isAlive = true;
		languages.put(LanguageType.MOTHER_TONGUE, new Language("Italian", Level.MOTHER_TONGUE, "informative", "expositive"));
		languages.put(LanguageType.FOREIGN_LANGUAGE, new Language("English", Level.UPPER_INTERMEDIATE, "informative", "expositive"));
		languages.put(LanguageType.PROGRAMMING_LANGUAGE, new Language("Java", Level.LOW, "descriptive", "useful"));
		languages.put(LanguageType.PROGRAMMING_LANGUAGE, new Language("COBOL", Level.LOW, "verbose", "strongly typed"));
		this.job = new Job(new Location(45.464664, 9.188540), Field.PAYMENTS, "W*******e" );
		this.spirit = new Spirit(Mood.SO_SO, Intensity.MEDIUM);
		this.energy = new Energy(Intensity.WEAK, Liveness.HALF_DEAD);
	}

	public Language getLanguage(LanguageType languageType) {
		return languages.get(languageType);
	}

	public it.persona.java.abs.Stress.Level work() {
		if(!this.stressors.containsKey(Reason.WORK)) {
			this.stressors.put(Reason.WORK, new Stress());
			return this.stressors.get(Reason.WORK).getStressLevel();
		}else {
			this.stressors.get(Reason.WORK).increaseStress();
			return this.stressors.get(Reason.WORK).getStressLevel();
		}
	}
	
	public void relate() {
		if(!this.stressors.containsKey(Reason.INCOMMUNICABILITY)) {
			this.stressors.put(Reason.INCOMMUNICABILITY, new Stress());
		}else {
			this.stressors.get(Reason.INCOMMUNICABILITY).increaseStress();
		}
	}
	
	public void fail() {
		if(!this.stressors.containsKey(Reason.DISAPPOINTMENT)) {
			this.stressors.put(Reason.DISAPPOINTMENT, new Stress());
		}else {
			this.stressors.get(Reason.DISAPPOINTMENT).increaseStress();
		}
	}
	
	public void conflict() {
		if(!this.stressors.containsKey(Reason.CONFLICTS)) {
			this.stressors.put(Reason.CONFLICTS, new Stress());
		}else {
			this.stressors.get(Reason.CONFLICTS).increaseStress();
		}
	}
}

package it.persona.java;

import java.util.HashMap;

import it.persona.java.Stress;
import it.persona.java.Stress.Reason;

public class Persona {
	private boolean isAlive = false;
	private boolean isBorn = false;
	private HashMap<Reason, Stress> stressors;
	
	public Persona() {
		this.isBorn = true;
		this.isAlive = true;
	}
	
	public void work() {
		if(!this.stressors.containsKey(Reason.WORK)) {
			this.stressors.put(Reason.WORK, new Stress());
		}else {
			this.stressors.get(Reason.WORK).increaseStress();
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
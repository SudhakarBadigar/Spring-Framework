package com.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	
	@Value("India")
	private String teamName;
	@Value("MSD")
	private String teamCaptain;
	
	public Ipl() {
		super();
	}

	public Ipl(String teamName, String teamCaptain) {
		super();
		this.teamName = teamName;
		this.teamCaptain = teamCaptain;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCaptain() {
		return teamCaptain;
	}

	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}

	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaptain=" + teamCaptain + "]";
	}
	
	
	
	

}

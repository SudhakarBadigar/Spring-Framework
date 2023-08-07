package com.stereotype.resource.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ab")
@Scope("singleton")
public class SpelIpl {
	@Value("virat kohli")
	private String teamCaptain;
	@Value("RCB")
	private String teamName;
	@Value("#{temp}")
	private List<String> players;

	public SpelIpl() {
		super();
	}

	public SpelIpl(String teamCaptain, String teamName, List<String> players) {
		super();
		this.teamCaptain = teamCaptain;
		this.teamName = teamName;
		this.players = players;
	}

	@Override
	public String toString() {
		return "SpelIpl [teamCaptain=" + teamCaptain + ", teamName=" + teamName + ", players=" + players + "]";
	}

	public String getTeamCaptain() {
		return teamCaptain;
	}

	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}
	
	
}

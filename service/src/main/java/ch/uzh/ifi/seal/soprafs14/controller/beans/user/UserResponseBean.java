package ch.uzh.ifi.seal.soprafs14.controller.beans.user;

import java.util.List;

public class UserResponseBean {

	private Long id;
	private String name;
	private String username;
	private List<String> games;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getGames() {
		return games;
	}
	public void setGames(List<String> games) {
		this.games = games;
	}
}

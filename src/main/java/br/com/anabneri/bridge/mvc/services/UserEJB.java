package br.com.anabneri.bridge.mvc.services;

import br.com.anabneri.bridge.mvc.model.User;

public class UserEJB {

	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
	}
}

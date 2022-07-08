package com.game.service;

import java.util.List;

import com.game.model.Admin;

public interface InterfaceAdminService {

	public List<Admin> validate(String userName, String password);
	
	public boolean getLoginState();
	
	
}

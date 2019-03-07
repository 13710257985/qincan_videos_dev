package com.qincan.service;

import com.qincan.pojo.Users;
import com.qincan.utils.PagedResult;

public interface UsersService {

	
	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);

}

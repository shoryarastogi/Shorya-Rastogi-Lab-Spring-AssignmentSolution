package com.shorya.StudentManagementBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shorya.StudentManagementBoot.entity.User;
import com.shorya.StudentManagementBoot.repository.UserRepository;
import com.shorya.StudentManagementBoot.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.getUserByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user by Username" + username);
		}
		
		return new MyUserDetails(user);
	}

}

package com.yedam.myserver.users.service.Impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yedam.myserver.users.mapper.UserMapper;
import com.yedam.myserver.users.service.UserService;
import com.yedam.myserver.users.vo.UserVO;

@Service
public class UserServiceImpl implements UserService, UserDetailsService{
	
	@Autowired  UserMapper mapper;
	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public List<UserVO> find() {
		// TODO Auto-generated method stub
		return mapper.find();
	}

	@Override
	public List<Map> findByName(UserVO vo) {
		// TODO Auto-generated method stub
		return mapper.findByName(vo);
	}

	@Override
	public UserVO findById(UserVO vo) {
		// TODO Auto-generated method stub
		return mapper.findById(vo);
	}

	@Override
	public void persist(UserVO vo) {
		mapper.persist(vo);
		
	}

	@Override
	public void merge(UserVO vo) {
		mapper.merge(vo);
		
	}

	@Override
	public void remove(UserVO vo) {
		mapper.remove(vo);
		
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVO vo = new UserVO();
		vo.setId(username);
		vo = mapper.findById(vo);
		if(vo == null) {
			throw new UsernameNotFoundException("no user");
			}
			
		return vo;
	}
	

}

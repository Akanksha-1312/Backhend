package com.example.demo.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.*;



public interface UserDetailRepo extends CrudRepository<UserDetail,Integer> {
	
	

}


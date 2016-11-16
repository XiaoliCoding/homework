package com.homework.models.dao;

import javax.transaction.Transactional;

import com.homework.models.entity.Paper;

import org.springframework.data.repository.CrudRepository;

@Transactional  
public interface PaperDao extends CrudRepository<Paper, Integer> {
	
}

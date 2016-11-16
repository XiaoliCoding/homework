package com.homework.models.dao;

import javax.transaction.Transactional;
import com.homework.models.entity.UserPaper;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserPaperDao extends CrudRepository<UserPaper, Integer> {
	
}

package com.homework.models.dao;

import javax.transaction.Transactional;
import com.homework.models.entity.Department;
import org.springframework.data.repository.CrudRepository;

@Transactional  
public interface DepartmentDao extends CrudRepository<Department, Integer> {

}

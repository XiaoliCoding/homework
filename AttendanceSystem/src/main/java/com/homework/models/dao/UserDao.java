package com.homework.models.dao;
import com.homework.models.entity.User;  
import org.springframework.data.repository.CrudRepository;  
import javax.transaction.Transactional;  
import java.math.BigDecimal;  
import java.util.Date;  
import java.util.List;  
  
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {  
    public List<User> findById(int work_id);  
    
}

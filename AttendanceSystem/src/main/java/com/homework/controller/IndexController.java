package com.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;  

import java.math.BigDecimal;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.List;

import com.homework.models.entity.User;
import com.homework.models.dao.UserDao;

@EnableAutoConfiguration
@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired  
	private UserDao userDao; 
	
	@RequestMapping("/")
	public String login(){
		return "login";
	}
	
	
	@RequestMapping("/getname")
	@ResponseBody
    public String index(String work_id){
        List<User> userList = userDao.findById(Integer.valueOf(work_id).intValue());
        if (userList != null && userList.size()!=0) {
        	User user=userList.get(0);
            return "The user name is: " +user.getName();  
        }  
        return "user " + work_id + " is not exist."; 
    }
	
}

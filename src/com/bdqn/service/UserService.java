package com.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.dao.UserMapper;
import com.bdqn.entity.Dianying;
import com.bdqn.entity.Gouwuche;
import com.bdqn.entity.Group;
import com.bdqn.entity.news_detail;
import com.bdqn.entity.xuesheng;
  @Service("userservice")
public class UserService {
        @Autowired
  public UserMapper usermapper;
 
        public List<Gouwuche> getchaxun(){
        	List<Gouwuche> list=usermapper.getchaxun();
        	 return list;
        			 
        }
        public List<Group> getgroup(){
        	return usermapper.getgroup();
        }
        
        public List<Dianying> getdianyin(){       	    	
        	return usermapper.getdianyin();
        }
        public xuesheng dengru(@Param("telephone")String telephone,@Param("age")int age){
        	return usermapper.dengru(telephone, age);
        }     
        
        
        
        
        
        
        
        
        
        
        
        
        
		public UserMapper getUsermapper() {
			return usermapper;
		}

		public void setUsermapper(UserMapper usermapper) {
			this.usermapper = usermapper;
		}
		public List<news_detail> getnewslist() {
			// TODO Auto-generated method stub
			return usermapper.getnewslist();
		}
        
}

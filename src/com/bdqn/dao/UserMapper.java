package com.bdqn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.entity.Dianying;
import com.bdqn.entity.Gouwuche;
import com.bdqn.entity.Group;
import com.bdqn.entity.news_detail;
import com.bdqn.entity.xuesheng;

public interface UserMapper {
 public List<Gouwuche> getchaxun();
 public List<Group> getgroup();
public List<news_detail> getnewslist();
public List<Dianying> getdianyin();
public xuesheng dengru(@Param("telephone")String telephone,@Param("age")int age);

 
}

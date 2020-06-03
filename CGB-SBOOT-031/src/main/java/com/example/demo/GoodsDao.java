package com.example.demo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
/*
 * GoodsDao是一个数据层商品信息访问接口
 * @Mapper注解由Mapper框架提供由mybatis框架实现类
 * 并交给spring容器管理,对象的名字默认为接口名首字母小写
 */
@Mapper
public interface GoodsDao {
    
	@Delete("delete from tb_goods where id=#{id}")
	public int DeleteById(Integer id);
	
}

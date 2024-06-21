package com.entity.view;

import com.entity.GoumaidekechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买的课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
@TableName("goumaidekecheng")
public class GoumaidekechengView  extends GoumaidekechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaidekechengView(){
	}
 
 	public GoumaidekechengView(GoumaidekechengEntity goumaidekechengEntity){
 	try {
			BeanUtils.copyProperties(this, goumaidekechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

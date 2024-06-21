package com.entity.view;

import com.entity.WodekechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
@TableName("wodekecheng")
public class WodekechengView  extends WodekechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodekechengView(){
	}
 
 	public WodekechengView(WodekechengEntity wodekechengEntity){
 	try {
			BeanUtils.copyProperties(this, wodekechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

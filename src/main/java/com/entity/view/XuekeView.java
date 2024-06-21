package com.entity.view;

import com.entity.XuekeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学科
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
@TableName("xueke")
public class XuekeView  extends XuekeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuekeView(){
	}
 
 	public XuekeView(XuekeEntity xuekeEntity){
 	try {
			BeanUtils.copyProperties(this, xuekeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

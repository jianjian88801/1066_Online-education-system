package com.entity.view;

import com.entity.ZhiyeguihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职业规划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
@TableName("zhiyeguihua")
public class ZhiyeguihuaView  extends ZhiyeguihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyeguihuaView(){
	}
 
 	public ZhiyeguihuaView(ZhiyeguihuaEntity zhiyeguihuaEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyeguihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

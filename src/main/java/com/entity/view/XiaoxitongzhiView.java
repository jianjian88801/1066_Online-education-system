package com.entity.view;

import com.entity.XiaoxitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消息通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
@TableName("xiaoxitongzhi")
public class XiaoxitongzhiView  extends XiaoxitongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoxitongzhiView(){
	}
 
 	public XiaoxitongzhiView(XiaoxitongzhiEntity xiaoxitongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoxitongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.model;

import com.entity.ZhiyeguihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 职业规划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public class ZhiyeguihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 确立目标
	 */
	
	private String quelimubiao;
		
	/**
	 * 环境评价
	 */
	
	private String huanjingpingjia;
		
	/**
	 * 职业定位
	 */
	
	private String zhiyedingwei;
		
	/**
	 * 实施策略
	 */
	
	private String shishicelve;
		
	/**
	 * 评估与反馈
	 */
	
	private String pingguyufankui;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 目前职业
	 */
	
	private String muqianzhiye;
				
	
	/**
	 * 设置：确立目标
	 */
	 
	public void setQuelimubiao(String quelimubiao) {
		this.quelimubiao = quelimubiao;
	}
	
	/**
	 * 获取：确立目标
	 */
	public String getQuelimubiao() {
		return quelimubiao;
	}
				
	
	/**
	 * 设置：环境评价
	 */
	 
	public void setHuanjingpingjia(String huanjingpingjia) {
		this.huanjingpingjia = huanjingpingjia;
	}
	
	/**
	 * 获取：环境评价
	 */
	public String getHuanjingpingjia() {
		return huanjingpingjia;
	}
				
	
	/**
	 * 设置：职业定位
	 */
	 
	public void setZhiyedingwei(String zhiyedingwei) {
		this.zhiyedingwei = zhiyedingwei;
	}
	
	/**
	 * 获取：职业定位
	 */
	public String getZhiyedingwei() {
		return zhiyedingwei;
	}
				
	
	/**
	 * 设置：实施策略
	 */
	 
	public void setShishicelve(String shishicelve) {
		this.shishicelve = shishicelve;
	}
	
	/**
	 * 获取：实施策略
	 */
	public String getShishicelve() {
		return shishicelve;
	}
				
	
	/**
	 * 设置：评估与反馈
	 */
	 
	public void setPingguyufankui(String pingguyufankui) {
		this.pingguyufankui = pingguyufankui;
	}
	
	/**
	 * 获取：评估与反馈
	 */
	public String getPingguyufankui() {
		return pingguyufankui;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：目前职业
	 */
	 
	public void setMuqianzhiye(String muqianzhiye) {
		this.muqianzhiye = muqianzhiye;
	}
	
	/**
	 * 获取：目前职业
	 */
	public String getMuqianzhiye() {
		return muqianzhiye;
	}
			
}

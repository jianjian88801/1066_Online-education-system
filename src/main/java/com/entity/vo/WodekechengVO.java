package com.entity.vo;

import com.entity.WodekechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 我的课程
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public class WodekechengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 章节
	 */
	
	private String zhangjie;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
				
	
	/**
	 * 设置：章节
	 */
	 
	public void setZhangjie(String zhangjie) {
		this.zhangjie = zhangjie;
	}
	
	/**
	 * 获取：章节
	 */
	public String getZhangjie() {
		return zhangjie;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
			
}

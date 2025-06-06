package com.entity.vo;

import com.entity.YishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医生
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public class YishengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 所属科室
	 */
	
	private String suoshukeshi;
		
	/**
	 * 医院名字
	 */
	
	private String yiyuanmingzi;
		
	/**
	 * 医生性别
	 */
	
	private String yishengxingbie;
		
	/**
	 * 医生年龄
	 */
	
	private Integer yishengnianling;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 医生邮箱
	 */
	
	private String yishengyouxiang;
		
	/**
	 * 医生照片
	 */
	
	private String yishengzhaopian;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：所属科室
	 */
	 
	public void setSuoshukeshi(String suoshukeshi) {
		this.suoshukeshi = suoshukeshi;
	}
	
	/**
	 * 获取：所属科室
	 */
	public String getSuoshukeshi() {
		return suoshukeshi;
	}
				
	
	/**
	 * 设置：医院名字
	 */
	 
	public void setYiyuanmingzi(String yiyuanmingzi) {
		this.yiyuanmingzi = yiyuanmingzi;
	}
	
	/**
	 * 获取：医院名字
	 */
	public String getYiyuanmingzi() {
		return yiyuanmingzi;
	}
				
	
	/**
	 * 设置：医生性别
	 */
	 
	public void setYishengxingbie(String yishengxingbie) {
		this.yishengxingbie = yishengxingbie;
	}
	
	/**
	 * 获取：医生性别
	 */
	public String getYishengxingbie() {
		return yishengxingbie;
	}
				
	
	/**
	 * 设置：医生年龄
	 */
	 
	public void setYishengnianling(Integer yishengnianling) {
		this.yishengnianling = yishengnianling;
	}
	
	/**
	 * 获取：医生年龄
	 */
	public Integer getYishengnianling() {
		return yishengnianling;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：医生邮箱
	 */
	 
	public void setYishengyouxiang(String yishengyouxiang) {
		this.yishengyouxiang = yishengyouxiang;
	}
	
	/**
	 * 获取：医生邮箱
	 */
	public String getYishengyouxiang() {
		return yishengyouxiang;
	}
				
	
	/**
	 * 设置：医生照片
	 */
	 
	public void setYishengzhaopian(String yishengzhaopian) {
		this.yishengzhaopian = yishengzhaopian;
	}
	
	/**
	 * 获取：医生照片
	 */
	public String getYishengzhaopian() {
		return yishengzhaopian;
	}
			
}

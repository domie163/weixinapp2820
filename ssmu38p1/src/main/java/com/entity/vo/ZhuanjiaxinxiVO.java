package com.entity.vo;

import com.entity.ZhuanjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 专家信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public class ZhuanjiaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 所属科室
	 */
	
	private String suoshukeshi;
		
	/**
	 * 医生性别
	 */
	
	private String yishengxingbie;
		
	/**
	 * 医生年龄
	 */
	
	private String yishengnianling;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 医院名字
	 */
	
	private String yiyuanmingzi;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 门诊时间
	 */
	
	private String menzhenshijian;
		
	/**
	 * 医生简介
	 */
	
	private String yishengjianjie;
		
	/**
	 * 医生照片
	 */
	
	private String yishengzhaopian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 
	public void setYishengnianling(String yishengnianling) {
		this.yishengnianling = yishengnianling;
	}
	
	/**
	 * 获取：医生年龄
	 */
	public String getYishengnianling() {
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
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：门诊时间
	 */
	 
	public void setMenzhenshijian(String menzhenshijian) {
		this.menzhenshijian = menzhenshijian;
	}
	
	/**
	 * 获取：门诊时间
	 */
	public String getMenzhenshijian() {
		return menzhenshijian;
	}
				
	
	/**
	 * 设置：医生简介
	 */
	 
	public void setYishengjianjie(String yishengjianjie) {
		this.yishengjianjie = yishengjianjie;
	}
	
	/**
	 * 获取：医生简介
	 */
	public String getYishengjianjie() {
		return yishengjianjie;
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
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}

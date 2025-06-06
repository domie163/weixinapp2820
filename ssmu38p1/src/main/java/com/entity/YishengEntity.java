package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 医生
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
@TableName("yisheng")
public class YishengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YishengEntity() {
		
	}
	
	public YishengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医生工号
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
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

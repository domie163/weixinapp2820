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
 * 取消预约申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
@TableName("quxiaoyuyueshenqing")
public class QuxiaoyuyueshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QuxiaoyuyueshenqingEntity() {
		
	}
	
	public QuxiaoyuyueshenqingEntity(T t) {
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
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 预约时间
	 */
					
	private String yuyueshijian;
	
	/**
	 * 取消原因
	 */
					
	private String quxiaoyuanyin;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(String yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public String getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：取消原因
	 */
	public void setQuxiaoyuanyin(String quxiaoyuanyin) {
		this.quxiaoyuanyin = quxiaoyuanyin;
	}
	/**
	 * 获取：取消原因
	 */
	public String getQuxiaoyuanyin() {
		return quxiaoyuanyin;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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

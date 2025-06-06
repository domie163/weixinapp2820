package com.entity.view;

import com.entity.QuxiaoyuyueshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 取消预约申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
@TableName("quxiaoyuyueshenqing")
public class QuxiaoyuyueshenqingView  extends QuxiaoyuyueshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaoyuyueshenqingView(){
	}
 
 	public QuxiaoyuyueshenqingView(QuxiaoyuyueshenqingEntity quxiaoyuyueshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaoyuyueshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

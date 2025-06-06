package com.dao;

import com.entity.QuxiaoyuyueshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaoyuyueshenqingVO;
import com.entity.view.QuxiaoyuyueshenqingView;


/**
 * 取消预约申请
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public interface QuxiaoyuyueshenqingDao extends BaseMapper<QuxiaoyuyueshenqingEntity> {
	
	List<QuxiaoyuyueshenqingVO> selectListVO(@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
	
	QuxiaoyuyueshenqingVO selectVO(@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
	
	List<QuxiaoyuyueshenqingView> selectListView(@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);

	List<QuxiaoyuyueshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
	
	QuxiaoyuyueshenqingView selectView(@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
	
}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaoyuyueshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaoyuyueshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaoyuyueshenqingView;


/**
 * 取消预约申请
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public interface QuxiaoyuyueshenqingService extends IService<QuxiaoyuyueshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoyuyueshenqingVO> selectListVO(Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
   	
   	QuxiaoyuyueshenqingVO selectVO(@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
   	
   	List<QuxiaoyuyueshenqingView> selectListView(Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
   	
   	QuxiaoyuyueshenqingView selectView(@Param("ew") Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaoyuyueshenqingEntity> wrapper);
   	
}


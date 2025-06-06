package com.dao;

import com.entity.ZhuanjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiaxinxiVO;
import com.entity.view.ZhuanjiaxinxiView;


/**
 * 专家信息
 * 
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public interface ZhuanjiaxinxiDao extends BaseMapper<ZhuanjiaxinxiEntity> {
	
	List<ZhuanjiaxinxiVO> selectListVO(@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);
	
	ZhuanjiaxinxiVO selectVO(@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);
	
	List<ZhuanjiaxinxiView> selectListView(@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);

	List<ZhuanjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);
	
	ZhuanjiaxinxiView selectView(@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);
	
}

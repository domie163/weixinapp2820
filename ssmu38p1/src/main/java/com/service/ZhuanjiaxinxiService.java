package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiaxinxiView;


/**
 * 专家信息
 *
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
public interface ZhuanjiaxinxiService extends IService<ZhuanjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiaxinxiVO> selectListVO(Wrapper<ZhuanjiaxinxiEntity> wrapper);
   	
   	ZhuanjiaxinxiVO selectVO(@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);
   	
   	List<ZhuanjiaxinxiView> selectListView(Wrapper<ZhuanjiaxinxiEntity> wrapper);
   	
   	ZhuanjiaxinxiView selectView(@Param("ew") Wrapper<ZhuanjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiaxinxiEntity> wrapper);
   	
}


package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhuanjiaxinxiDao;
import com.entity.ZhuanjiaxinxiEntity;
import com.service.ZhuanjiaxinxiService;
import com.entity.vo.ZhuanjiaxinxiVO;
import com.entity.view.ZhuanjiaxinxiView;

@Service("zhuanjiaxinxiService")
public class ZhuanjiaxinxiServiceImpl extends ServiceImpl<ZhuanjiaxinxiDao, ZhuanjiaxinxiEntity> implements ZhuanjiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanjiaxinxiEntity> page = this.selectPage(
                new Query<ZhuanjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuanjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanjiaxinxiEntity> wrapper) {
		  Page<ZhuanjiaxinxiView> page =new Query<ZhuanjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanjiaxinxiVO> selectListVO(Wrapper<ZhuanjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanjiaxinxiVO selectVO(Wrapper<ZhuanjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanjiaxinxiView> selectListView(Wrapper<ZhuanjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanjiaxinxiView selectView(Wrapper<ZhuanjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.QuxiaoyuyueshenqingDao;
import com.entity.QuxiaoyuyueshenqingEntity;
import com.service.QuxiaoyuyueshenqingService;
import com.entity.vo.QuxiaoyuyueshenqingVO;
import com.entity.view.QuxiaoyuyueshenqingView;

@Service("quxiaoyuyueshenqingService")
public class QuxiaoyuyueshenqingServiceImpl extends ServiceImpl<QuxiaoyuyueshenqingDao, QuxiaoyuyueshenqingEntity> implements QuxiaoyuyueshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoyuyueshenqingEntity> page = this.selectPage(
                new Query<QuxiaoyuyueshenqingEntity>(params).getPage(),
                new EntityWrapper<QuxiaoyuyueshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaoyuyueshenqingEntity> wrapper) {
		  Page<QuxiaoyuyueshenqingView> page =new Query<QuxiaoyuyueshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaoyuyueshenqingVO> selectListVO(Wrapper<QuxiaoyuyueshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoyuyueshenqingVO selectVO(Wrapper<QuxiaoyuyueshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoyuyueshenqingView> selectListView(Wrapper<QuxiaoyuyueshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoyuyueshenqingView selectView(Wrapper<QuxiaoyuyueshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

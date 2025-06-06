package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuanjiaxinxiEntity;
import com.entity.view.ZhuanjiaxinxiView;

import com.service.ZhuanjiaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 专家信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-18 15:39:33
 */
@RestController
@RequestMapping("/zhuanjiaxinxi")
public class ZhuanjiaxinxiController {
    @Autowired
    private ZhuanjiaxinxiService zhuanjiaxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuanjiaxinxiEntity zhuanjiaxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			zhuanjiaxinxi.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanjiaxinxiEntity> ew = new EntityWrapper<ZhuanjiaxinxiEntity>();
		PageUtils page = zhuanjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiaxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuanjiaxinxiEntity zhuanjiaxinxi, HttpServletRequest request){

		String tableName = String.valueOf(request.getSession().getAttribute("tableName"));
		if(tableName.equals("yisheng")) {
			zhuanjiaxinxi.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanjiaxinxiEntity> ew = new EntityWrapper<ZhuanjiaxinxiEntity>();
		PageUtils page = zhuanjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuanjiaxinxiEntity zhuanjiaxinxi){
       	EntityWrapper<ZhuanjiaxinxiEntity> ew = new EntityWrapper<ZhuanjiaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuanjiaxinxi, "zhuanjiaxinxi")); 
        return R.ok().put("data", zhuanjiaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuanjiaxinxiEntity zhuanjiaxinxi){
        EntityWrapper< ZhuanjiaxinxiEntity> ew = new EntityWrapper< ZhuanjiaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuanjiaxinxi, "zhuanjiaxinxi")); 
		ZhuanjiaxinxiView zhuanjiaxinxiView =  zhuanjiaxinxiService.selectView(ew);
		return R.ok("查询专家信息成功").put("data", zhuanjiaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuanjiaxinxiEntity zhuanjiaxinxi = zhuanjiaxinxiService.selectById(id);
		zhuanjiaxinxi.setClicknum(zhuanjiaxinxi.getClicknum()+1);
		zhuanjiaxinxi.setClicktime(new Date());
		zhuanjiaxinxiService.updateById(zhuanjiaxinxi);
        return R.ok().put("data", zhuanjiaxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuanjiaxinxiEntity zhuanjiaxinxi = zhuanjiaxinxiService.selectById(id);
		zhuanjiaxinxi.setClicknum(zhuanjiaxinxi.getClicknum()+1);
		zhuanjiaxinxi.setClicktime(new Date());
		zhuanjiaxinxiService.updateById(zhuanjiaxinxi);
        return R.ok().put("data", zhuanjiaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanjiaxinxiEntity zhuanjiaxinxi, HttpServletRequest request){
    	zhuanjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanjiaxinxi);

        zhuanjiaxinxiService.insert(zhuanjiaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuanjiaxinxiEntity zhuanjiaxinxi, HttpServletRequest request){
    	zhuanjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanjiaxinxi);
    	zhuanjiaxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        zhuanjiaxinxiService.insert(zhuanjiaxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuanjiaxinxiEntity zhuanjiaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuanjiaxinxi);
        zhuanjiaxinxiService.updateById(zhuanjiaxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuanjiaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuanjiaxinxiEntity> wrapper = new EntityWrapper<ZhuanjiaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishenggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuanjiaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhuanjiaxinxiEntity zhuanjiaxinxi, HttpServletRequest request,String pre){
        EntityWrapper<ZhuanjiaxinxiEntity> ew = new EntityWrapper<ZhuanjiaxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = zhuanjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiaxinxi), params), params));
        return R.ok().put("data", page);
    }


}

package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.XiticeDao;
import com.cl.entity.XiticeEntity;
import com.cl.service.XiticeService;
import com.cl.entity.view.XiticeView;

@Service("xiticeService")
public class XiticeServiceImpl extends ServiceImpl<XiticeDao, XiticeEntity> implements XiticeService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<XiticeEntity> wrapper) {
		Page<XiticeView> page =new Query<XiticeView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiticeEntity> page = this.selectPage(
                new Query<XiticeEntity>(params).getPage(),
                new EntityWrapper<XiticeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiticeEntity> wrapper) {
		  Page<XiticeView> page =new Query<XiticeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XiticeView> selectListView(Wrapper<XiticeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiticeView selectView(Wrapper<XiticeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

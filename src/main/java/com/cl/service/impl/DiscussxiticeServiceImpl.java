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


import com.cl.dao.DiscussxiticeDao;
import com.cl.entity.DiscussxiticeEntity;
import com.cl.service.DiscussxiticeService;
import com.cl.entity.view.DiscussxiticeView;

@Service("discussxiticeService")
public class DiscussxiticeServiceImpl extends ServiceImpl<DiscussxiticeDao, DiscussxiticeEntity> implements DiscussxiticeService {
	
	@Override
	public PageUtils queryPageGroupBy(Map<String, Object> params, Wrapper<DiscussxiticeEntity> wrapper) {
		Page<DiscussxiticeView> page =new Query<DiscussxiticeView>(params).getPage();
        page.setRecords(baseMapper.selectGroupBy(page,wrapper));
    	PageUtils pageUtil = new PageUtils(page);
    	return pageUtil;
	}
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiticeEntity> page = this.selectPage(
                new Query<DiscussxiticeEntity>(params).getPage(),
                new EntityWrapper<DiscussxiticeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiticeEntity> wrapper) {
		  Page<DiscussxiticeView> page =new Query<DiscussxiticeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussxiticeView> selectListView(Wrapper<DiscussxiticeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiticeView selectView(Wrapper<DiscussxiticeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

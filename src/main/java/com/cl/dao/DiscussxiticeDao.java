package com.cl.dao;

import com.cl.entity.DiscussxiticeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxiticeView;


/**
 * 习题册评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-13 14:19:48
 */
public interface DiscussxiticeDao extends BaseMapper<DiscussxiticeEntity> {
	
	List<DiscussxiticeView> selectListView(@Param("ew") Wrapper<DiscussxiticeEntity> wrapper);

	List<DiscussxiticeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiticeEntity> wrapper);
	
	DiscussxiticeView selectView(@Param("ew") Wrapper<DiscussxiticeEntity> wrapper);
	
	List<DiscussxiticeView> selectGroupBy(Pagination page,@Param("ew") Wrapper<DiscussxiticeEntity> wrapper);

}

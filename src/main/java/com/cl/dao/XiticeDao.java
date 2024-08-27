package com.cl.dao;

import com.cl.entity.XiticeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiticeView;


/**
 * 习题册
 * 
 * @author 
 * @email 
 * @date 2024-03-13 14:19:47
 */
public interface XiticeDao extends BaseMapper<XiticeEntity> {
	
	List<XiticeView> selectListView(@Param("ew") Wrapper<XiticeEntity> wrapper);

	List<XiticeView> selectListView(Pagination page,@Param("ew") Wrapper<XiticeEntity> wrapper);
	
	XiticeView selectView(@Param("ew") Wrapper<XiticeEntity> wrapper);
	
	List<XiticeView> selectGroupBy(Pagination page,@Param("ew") Wrapper<XiticeEntity> wrapper);

}

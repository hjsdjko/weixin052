package com.cl.dao;

import com.cl.entity.KemuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KemuView;


/**
 * 科目
 * 
 * @author 
 * @email 
 * @date 2024-03-13 14:19:47
 */
public interface KemuDao extends BaseMapper<KemuEntity> {
	
	List<KemuView> selectListView(@Param("ew") Wrapper<KemuEntity> wrapper);

	List<KemuView> selectListView(Pagination page,@Param("ew") Wrapper<KemuEntity> wrapper);
	
	KemuView selectView(@Param("ew") Wrapper<KemuEntity> wrapper);
	
	List<KemuView> selectGroupBy(Pagination page,@Param("ew") Wrapper<KemuEntity> wrapper);

}

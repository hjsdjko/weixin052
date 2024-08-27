package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.KemuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KemuView;


/**
 * 科目
 *
 * @author 
 * @email 
 * @date 2024-03-13 14:19:47
 */
public interface KemuService extends IService<KemuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KemuView> selectListView(Wrapper<KemuEntity> wrapper);
   	
   	KemuView selectView(@Param("ew") Wrapper<KemuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KemuEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<KemuEntity> wrapper);

}


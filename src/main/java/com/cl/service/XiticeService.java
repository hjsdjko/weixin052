package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XiticeEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiticeView;


/**
 * 习题册
 *
 * @author 
 * @email 
 * @date 2024-03-13 14:19:47
 */
public interface XiticeService extends IService<XiticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiticeView> selectListView(Wrapper<XiticeEntity> wrapper);
   	
   	XiticeView selectView(@Param("ew") Wrapper<XiticeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiticeEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<XiticeEntity> wrapper);

}


package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussxiticeEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxiticeView;


/**
 * 习题册评论表
 *
 * @author 
 * @email 
 * @date 2024-03-13 14:19:48
 */
public interface DiscussxiticeService extends IService<DiscussxiticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxiticeView> selectListView(Wrapper<DiscussxiticeEntity> wrapper);
   	
   	DiscussxiticeView selectView(@Param("ew") Wrapper<DiscussxiticeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxiticeEntity> wrapper);
   	
   	PageUtils queryPageGroupBy(Map<String, Object> params,Wrapper<DiscussxiticeEntity> wrapper);

}


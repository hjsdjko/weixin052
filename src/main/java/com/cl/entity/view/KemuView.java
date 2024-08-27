package com.cl.entity.view;

import com.cl.entity.KemuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 科目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-13 14:19:47
 */
@TableName("kemu")
public class KemuView  extends KemuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KemuView(){
	}
 
 	public KemuView(KemuEntity kemuEntity){
 	try {
			BeanUtils.copyProperties(this, kemuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
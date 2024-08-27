package com.cl.entity.view;

import com.cl.entity.XiticeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 习题册
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-13 14:19:47
 */
@TableName("xitice")
public class XiticeView  extends XiticeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiticeView(){
	}
 
 	public XiticeView(XiticeEntity xiticeEntity){
 	try {
			BeanUtils.copyProperties(this, xiticeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

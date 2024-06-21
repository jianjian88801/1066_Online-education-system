package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuekeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuekeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuekeView;


/**
 * 学科
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface XuekeService extends IService<XuekeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuekeVO> selectListVO(Wrapper<XuekeEntity> wrapper);
   	
   	XuekeVO selectVO(@Param("ew") Wrapper<XuekeEntity> wrapper);
   	
   	List<XuekeView> selectListView(Wrapper<XuekeEntity> wrapper);
   	
   	XuekeView selectView(@Param("ew") Wrapper<XuekeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuekeEntity> wrapper);
   	
}


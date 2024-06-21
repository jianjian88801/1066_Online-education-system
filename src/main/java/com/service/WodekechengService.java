package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodekechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodekechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodekechengView;


/**
 * 我的课程
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public interface WodekechengService extends IService<WodekechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodekechengVO> selectListVO(Wrapper<WodekechengEntity> wrapper);
   	
   	WodekechengVO selectVO(@Param("ew") Wrapper<WodekechengEntity> wrapper);
   	
   	List<WodekechengView> selectListView(Wrapper<WodekechengEntity> wrapper);
   	
   	WodekechengView selectView(@Param("ew") Wrapper<WodekechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodekechengEntity> wrapper);
   	
}


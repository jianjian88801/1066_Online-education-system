package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaidekechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaidekechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaidekechengView;


/**
 * 购买的课程
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface GoumaidekechengService extends IService<GoumaidekechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaidekechengVO> selectListVO(Wrapper<GoumaidekechengEntity> wrapper);
   	
   	GoumaidekechengVO selectVO(@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);
   	
   	List<GoumaidekechengView> selectListView(Wrapper<GoumaidekechengEntity> wrapper);
   	
   	GoumaidekechengView selectView(@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaidekechengEntity> wrapper);
   	
}


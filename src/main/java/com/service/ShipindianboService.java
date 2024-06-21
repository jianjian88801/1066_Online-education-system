package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipindianboEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipindianboVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipindianboView;


/**
 * 视频点播
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface ShipindianboService extends IService<ShipindianboEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipindianboVO> selectListVO(Wrapper<ShipindianboEntity> wrapper);
   	
   	ShipindianboVO selectVO(@Param("ew") Wrapper<ShipindianboEntity> wrapper);
   	
   	List<ShipindianboView> selectListView(Wrapper<ShipindianboEntity> wrapper);
   	
   	ShipindianboView selectView(@Param("ew") Wrapper<ShipindianboEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipindianboEntity> wrapper);
   	
}


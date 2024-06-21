package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyeguihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyeguihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyeguihuaView;


/**
 * 职业规划
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface ZhiyeguihuaService extends IService<ZhiyeguihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyeguihuaVO> selectListVO(Wrapper<ZhiyeguihuaEntity> wrapper);
   	
   	ZhiyeguihuaVO selectVO(@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);
   	
   	List<ZhiyeguihuaView> selectListView(Wrapper<ZhiyeguihuaEntity> wrapper);
   	
   	ZhiyeguihuaView selectView(@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyeguihuaEntity> wrapper);
   	
}


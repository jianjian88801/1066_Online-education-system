package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodebijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodebijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodebijiView;


/**
 * 我的笔记
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public interface WodebijiService extends IService<WodebijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodebijiVO> selectListVO(Wrapper<WodebijiEntity> wrapper);
   	
   	WodebijiVO selectVO(@Param("ew") Wrapper<WodebijiEntity> wrapper);
   	
   	List<WodebijiView> selectListView(Wrapper<WodebijiEntity> wrapper);
   	
   	WodebijiView selectView(@Param("ew") Wrapper<WodebijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodebijiEntity> wrapper);
   	
}


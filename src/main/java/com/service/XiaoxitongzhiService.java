package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoxitongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoxitongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoxitongzhiView;


/**
 * 消息通知
 *
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public interface XiaoxitongzhiService extends IService<XiaoxitongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoxitongzhiVO> selectListVO(Wrapper<XiaoxitongzhiEntity> wrapper);
   	
   	XiaoxitongzhiVO selectVO(@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);
   	
   	List<XiaoxitongzhiView> selectListView(Wrapper<XiaoxitongzhiEntity> wrapper);
   	
   	XiaoxitongzhiView selectView(@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoxitongzhiEntity> wrapper);
   	
}


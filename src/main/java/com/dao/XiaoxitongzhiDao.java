package com.dao;

import com.entity.XiaoxitongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxitongzhiVO;
import com.entity.view.XiaoxitongzhiView;


/**
 * 消息通知
 * 
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public interface XiaoxitongzhiDao extends BaseMapper<XiaoxitongzhiEntity> {
	
	List<XiaoxitongzhiVO> selectListVO(@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);
	
	XiaoxitongzhiVO selectVO(@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);
	
	List<XiaoxitongzhiView> selectListView(@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);

	List<XiaoxitongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);
	
	XiaoxitongzhiView selectView(@Param("ew") Wrapper<XiaoxitongzhiEntity> wrapper);
	
}

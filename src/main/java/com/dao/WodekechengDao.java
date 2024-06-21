package com.dao;

import com.entity.WodekechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodekechengVO;
import com.entity.view.WodekechengView;


/**
 * 我的课程
 * 
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public interface WodekechengDao extends BaseMapper<WodekechengEntity> {
	
	List<WodekechengVO> selectListVO(@Param("ew") Wrapper<WodekechengEntity> wrapper);
	
	WodekechengVO selectVO(@Param("ew") Wrapper<WodekechengEntity> wrapper);
	
	List<WodekechengView> selectListView(@Param("ew") Wrapper<WodekechengEntity> wrapper);

	List<WodekechengView> selectListView(Pagination page,@Param("ew") Wrapper<WodekechengEntity> wrapper);
	
	WodekechengView selectView(@Param("ew") Wrapper<WodekechengEntity> wrapper);
	
}

package com.dao;

import com.entity.GoumaidekechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaidekechengVO;
import com.entity.view.GoumaidekechengView;


/**
 * 购买的课程
 * 
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface GoumaidekechengDao extends BaseMapper<GoumaidekechengEntity> {
	
	List<GoumaidekechengVO> selectListVO(@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);
	
	GoumaidekechengVO selectVO(@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);
	
	List<GoumaidekechengView> selectListView(@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);

	List<GoumaidekechengView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);
	
	GoumaidekechengView selectView(@Param("ew") Wrapper<GoumaidekechengEntity> wrapper);
	
}

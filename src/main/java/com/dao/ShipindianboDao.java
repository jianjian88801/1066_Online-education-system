package com.dao;

import com.entity.ShipindianboEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipindianboVO;
import com.entity.view.ShipindianboView;


/**
 * 视频点播
 * 
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface ShipindianboDao extends BaseMapper<ShipindianboEntity> {
	
	List<ShipindianboVO> selectListVO(@Param("ew") Wrapper<ShipindianboEntity> wrapper);
	
	ShipindianboVO selectVO(@Param("ew") Wrapper<ShipindianboEntity> wrapper);
	
	List<ShipindianboView> selectListView(@Param("ew") Wrapper<ShipindianboEntity> wrapper);

	List<ShipindianboView> selectListView(Pagination page,@Param("ew") Wrapper<ShipindianboEntity> wrapper);
	
	ShipindianboView selectView(@Param("ew") Wrapper<ShipindianboEntity> wrapper);
	
}

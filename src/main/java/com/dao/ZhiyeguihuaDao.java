package com.dao;

import com.entity.ZhiyeguihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyeguihuaVO;
import com.entity.view.ZhiyeguihuaView;


/**
 * 职业规划
 * 
 * @author 
 * @email 
 * @date 2021-05-09 15:46:14
 */
public interface ZhiyeguihuaDao extends BaseMapper<ZhiyeguihuaEntity> {
	
	List<ZhiyeguihuaVO> selectListVO(@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);
	
	ZhiyeguihuaVO selectVO(@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);
	
	List<ZhiyeguihuaView> selectListView(@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);

	List<ZhiyeguihuaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);
	
	ZhiyeguihuaView selectView(@Param("ew") Wrapper<ZhiyeguihuaEntity> wrapper);
	
}

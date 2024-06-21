package com.dao;

import com.entity.WodebijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodebijiVO;
import com.entity.view.WodebijiView;


/**
 * 我的笔记
 * 
 * @author 
 * @email 
 * @date 2021-05-09 15:46:15
 */
public interface WodebijiDao extends BaseMapper<WodebijiEntity> {
	
	List<WodebijiVO> selectListVO(@Param("ew") Wrapper<WodebijiEntity> wrapper);
	
	WodebijiVO selectVO(@Param("ew") Wrapper<WodebijiEntity> wrapper);
	
	List<WodebijiView> selectListView(@Param("ew") Wrapper<WodebijiEntity> wrapper);

	List<WodebijiView> selectListView(Pagination page,@Param("ew") Wrapper<WodebijiEntity> wrapper);
	
	WodebijiView selectView(@Param("ew") Wrapper<WodebijiEntity> wrapper);
	
}

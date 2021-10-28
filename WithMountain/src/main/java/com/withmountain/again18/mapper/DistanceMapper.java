package com.withmountain.again18.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.DistanceDTO;

@Mapper
public interface DistanceMapper {
	List<DistanceDTO> getDistanceListByUserId(int userId);
	int insertDistance(DistanceDTO distance);
}

package com.withmountain.again18.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.withmountain.again18.domain.TestDTO;

@Mapper
public interface TestMapper {
	public List<TestDTO> selectTestList();

}

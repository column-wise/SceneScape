package com.ssafy.enjoytrip.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.model.dto.AttractionLikeDTO;

@Mapper
public interface AttractionLikeDAO {
	int insert(AttractionLikeDTO attractionLikeDTO);

	boolean select(AttractionLikeDTO attractionLikeDTO);
}
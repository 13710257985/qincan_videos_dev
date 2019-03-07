package com.qincan.mapper;

import java.util.List;

import com.qincan.pojo.Comments;
import com.qincan.pojo.vo.CommentsVO;
import com.qincan.utils.MyMapper;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}
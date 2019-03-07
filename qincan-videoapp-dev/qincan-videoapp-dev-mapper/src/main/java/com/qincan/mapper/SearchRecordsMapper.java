package com.qincan.mapper;

import java.util.List;

import com.qincan.pojo.SearchRecords;
import com.qincan.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {

	List<String> getHotwords();
}
package com.huijia.search.mapper;

import java.util.List;

import com.huijia.common.pojo.SearchItem;

public interface SearchItemMapper {

	List<SearchItem> getItemList();
	SearchItem getItemById(long itemId);
}

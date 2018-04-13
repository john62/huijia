package com.huijia.content.service;

import java.util.List;

import com.huijia.common.pojo.EasyUITreeNode;
import com.huijia.common.pojo.TaotaoResult;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCategoryList(long parentId);
	TaotaoResult addContentCategory(Long parentId, String name);
}

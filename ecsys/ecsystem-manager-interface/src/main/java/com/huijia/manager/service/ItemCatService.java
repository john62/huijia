package com.huijia.manager.service;



import com.huijia.common.pojo.EasyUITreeNode;
import com.huijia.manager.pojo.TbItem;

import java.util.List;



public interface ItemCatService {

//	TbItem getItemById(long itemId);
   List<EasyUITreeNode> getItemCatList(long parentId);
}

package com.huijia.manager.service;
import com.huijia.common.pojo.EasyUITreeNode;
import com.huijia.common.pojo.EasyUIDataGridResult;
import com.huijia.common.pojo.TaotaoResult;
import com.huijia.manager.pojo.TbItem;
import com.huijia.manager.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	TaotaoResult addItem(TbItem item, String desc);
	TbItemDesc getItemDescById(long itemId);
}

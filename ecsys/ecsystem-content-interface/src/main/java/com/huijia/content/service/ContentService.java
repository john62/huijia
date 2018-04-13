package com.huijia.content.service;

import java.util.List;
import com.huijia.manager.pojo.TbContent;
import com.huijia.common.pojo.TaotaoResult;


public interface ContentService {

	TaotaoResult addContent(TbContent content);
	List<TbContent> getContentByCid(long cid);
}

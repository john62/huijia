package com.huijia.sso.service;

import com.huijia.common.pojo.TaotaoResult;
import com.huijia.manager.pojo.TbUser;

public interface UserService {

	TaotaoResult checkData(String data, int type);
	TaotaoResult register(TbUser user);
	TaotaoResult login(String username, String password);
	TaotaoResult getUserByToken(String token);
}

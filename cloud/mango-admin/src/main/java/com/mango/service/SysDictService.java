package com.mango.service;

import com.mango.core.service.CurdService;
import com.mango.model.SysDict;

import java.util.List;

/**
 * 字典管理
 * @author zhengxin
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}

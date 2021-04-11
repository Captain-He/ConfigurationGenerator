package com.zzu.configurationgenerator.equipments.handler;

import java.util.Map;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 17:22
 * @Version 1.0
 */
public interface EquipmentLoadService {
	Map<String,Object> Load();
	Object findEquipment(String id);
}

package com.zzu.configurationgenerator.equipments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 17:12
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 远古版本的职工总图
 */
public class Sensor {
	private String id;//采集设备唯一ID
	private String type; //采集设备型号
}

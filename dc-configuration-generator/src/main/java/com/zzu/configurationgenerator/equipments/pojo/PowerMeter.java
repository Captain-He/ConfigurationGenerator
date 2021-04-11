package com.zzu.configurationgenerator.equipments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 17:28
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PowerMeter {
	private Register registerInstance;

	public PowerMeter (int registerSize){
		this.registerInstance = new Register(registerSize);
	}
}

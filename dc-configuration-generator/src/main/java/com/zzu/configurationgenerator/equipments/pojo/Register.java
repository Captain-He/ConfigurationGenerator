package com.zzu.configurationgenerator.equipments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.ByteBuffer;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 17:47
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {
	private int size;
	private ByteBuffer register;
	Register(int size){
		this.register = ByteBuffer.allocate(size);
	}

}

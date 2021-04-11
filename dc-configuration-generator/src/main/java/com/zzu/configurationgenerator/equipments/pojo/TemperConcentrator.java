package com.zzu.configurationgenerator.equipments.pojo;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 17:02
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测温集中器 在xlsx表中 叫集中器
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemperConcentrator {
	private String id ;//集中器唯一ID
	private String type;//集中器型号
	private String accessType; //接入方式
	private String subCommunicationManagerId;//隶属的通信管理机编号
	private String modbusType; //通信协议(modbusTCP/modbusRTU)
	private String comNum; //串口编号
	private String baudRate; //波特率
	private String dataBit; //数据位
	private String checkBit; //校验位
	private String stopBit; //停止位
	private String fluidControl;//流控
	private String slaveAddress;//从站地址
	private Register registerInstance;

	public TemperConcentrator(int registerSize){
		this.registerInstance = new Register(registerSize);
	}

}

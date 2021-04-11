package com.zzu.configurationgenerator.equipments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 16:38
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommunicationManager {
	private String id; //通信管理机唯一ID
	private String installPosition; //安装位置
	private String clientOrServer; //C端/S端
	private String subPCId;//PC编号(如是C端)
	private String numOfSerialChannels;//串行通道数量
	private Map<String,String[]> bus_Ip_Port_Mapping;//总线/IP/端口映射关系
	private Map<Integer,TemperConcentrator> temperConcentratorMap;//通信管理机下的测温集中器列表
	private Map<Integer,PowerMeter> powerMeterMap;//通信管理机下的电力仪表列表
}

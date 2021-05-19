package com.zzu.configurationgenerator.configuration.pojo;

import java.util.List;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 13:30
 * @Version 1.0
 */
public class DpuList {
	private String id; //通信管理机唯一ID
	private String clientOrServer; //C端/S端
	private String numOfSerialChannels;//串行通道数量
	private List<String> bus_Ip_Port_Mapping;//{串口编号/IP地址/端口}

	public void addBus_Ip_Port_Mapping(String bus,String port,String ip) {
		this.bus_Ip_Port_Mapping.add(bus+"/"+ip+"/"+port+"/");
	}
}

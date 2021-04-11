package com.zzu.configurationgenerator.configuration.pojo;

import java.util.List;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 13:13
 * @Version 1.0
 */
public class DevLink {
	private String id;//设备链ID
	private String subPCId;//隶属的PC编号
	private String modbusType; //通信协议
	private String accessType; //接入方式 (转为英文大写)
	private String communicationManagerId;//通信管理机ID
	private String communicationManagerChannelId;//通信管理机通道号
	private String concentratorNum;//集中器数量
	private List<String> concentratorList;//{集中器ID}
}

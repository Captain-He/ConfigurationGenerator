package com.zzu.configurationgenerator.equipments.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 15:17
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollectPC {
	private String id; //采集服务器唯一ID
	private String type;//设备类型
	private String ip;//IP地址
	private String installPosition;//设备安装位置
	private String managerPowerDistributionRoom;//设备管理配电室
	private String port;//端口号
	private Map<Integer,CommunicationManager> communicationManagerMap;//采集PC下的通信管理机列表

	/**
	 * 向通信管理机请求
	 *
	 * @param requestBody 请求报文（服务器）/查询体（转换器）
	 * @param <T>
	 * @return 应答报文/查询结果集
	 */
	/*public abstract  <T> T request(T requestBody) ;*/
}

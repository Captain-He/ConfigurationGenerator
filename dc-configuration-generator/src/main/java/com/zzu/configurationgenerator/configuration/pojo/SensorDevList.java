package com.zzu.configurationgenerator.configuration.pojo;

import java.util.List;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 13:38
 * @Version 1.0
 */
public class SensorDevList {
	private String sensorId;//电力仪表ID或测温集中器ID
	private String concentratorId;//电力仪表ID或测温集中器ID
	private int itemTotalNum;//数据数量
	private List<String> itemList;//{Item序号/寄存器地址/单个数据占据的寄存器数量/倍率/参数B（保留6位）/数据类型}

	public void addItemList(int itemId,String registerAddress,String sigleRegisterNum,String magnification,String parameterB,String dataType ) {
		this.itemList.add(itemId+"/"+registerAddress+"/"+sigleRegisterNum+"/"+magnification+"/"+parameterB+"/"+dataType);
	}
}

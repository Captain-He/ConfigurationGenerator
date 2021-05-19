package com.zzu.configurationgenerator.configuration.pojo;

import com.zzu.configurationgenerator.equipments.pojo.Register;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 12:49
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConcentratorList {
	private String id ;//集中器唯一ID
	private String comNum; //串口编号
	private String baudRate; //波特率
	private String dataBit; //数据位
	private String checkBit; //校验位
	private String stopBit; //停止位
	private String fluidControl;//流控
	private String slaveAddress;//从站地址
	private List<String> dataSegment;//{分段序号/+ 功能码 （int，0~255）/寄存器起始地址/寄存器数量}

	public void addDataSegment(int segmentId,String functionCode,String registerStartAddress,int registerNum) {
		this.dataSegment.add(segmentId+"/"+functionCode+"/"+registerStartAddress+"/"+registerNum);
	}

}

package com.zzu.configurationgenerator.xlsx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/10 18:16
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Xlsx {
	private String url;
	private String fileName;
	private Map<String, Map<String, List<String>>> sheetMap;//sheetName 到 sheet 的映射
}

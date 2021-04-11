package com.zzu.configurationgenerator.xlsx.handler;

import com.zzu.configurationgenerator.xlsx.pojo.Xlsx;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 16:43
 * @Version 1.0
 */
public interface XlsxFileHandlerService {
	Xlsx readXlsxFile(String src);
	void checkXlsxFileContent();
}

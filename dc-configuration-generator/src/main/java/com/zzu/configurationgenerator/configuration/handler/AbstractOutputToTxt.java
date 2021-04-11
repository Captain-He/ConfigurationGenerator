package com.zzu.configurationgenerator.configuration.handler;

import com.zzu.configurationgenerator.util.WriteFile;

import java.io.IOException;

/**
 * @Company Zhengzhou University (zzu)
 * @Author ZhiChao He
 * @Date 2021/4/11 17:41
 * @Version 1.0
 */
public abstract class AbstractOutputToTxt {
	public abstract Object ConfigurationLoad();
	public abstract String toString( Object object);

	public boolean wirte(String savePath){
		Object object = ConfigurationLoad();
		String content = toString(object);
		WriteFile writefile = new WriteFile();
		try {
			writefile.WriteToFile(content.trim(), savePath);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}

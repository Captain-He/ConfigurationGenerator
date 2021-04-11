package com.zzu.configurationgenerator;

import com.alibaba.fastjson.JSON;
import com.zzu.configurationgenerator.equipments.pojo.TemperConcentrator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ConfigurationgeneratorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
		void main(){
		Yaml yaml = new Yaml();
		//文件路径是相对类目录(src/main/java)的相对路径
		InputStream in = ConfigurationgeneratorApplicationTests.class.getClassLoader().getResourceAsStream("com\\zzu\\configurationgenerator\\configuration\\dpu.yml");
		Map<String, Object> map = yaml.loadAs(in, Map.class);
		System.out.println(map.get("dpu_list").toString());

/*

		String fileName = map.get("a").toString();
		System.out.println(fileName);*/
		//String mypjson  =JSON.toJSONString(yaml.loadAs(in, String.class),true) ;
//ArrayList<String> map2 = (ArrayList<String>)map.get("dpu_list");
		//String mypjson = JSON.toJSONString(map.get("dpu_list"),true);
		//List<String> listString = JSON.parseArray(mypjson, String.class);
		/*for (String s : listString) {
			System.out.println(s);
		}*/
//https://zhidao.baidu.com/question/202170623.html
//https://blog.csdn.net/goodlook0123/article/details/80333220?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control&dist_request_id=1330147.11065.16180622920460491&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromMachineLearnPai2%7Edefault-1.control
	//https://www.cnblogs.com/mysgk/p/9790801.html
	}
}

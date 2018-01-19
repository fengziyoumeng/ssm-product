
package com.cn.wubin.genertor;

import org.mybatis.generator.api.ShellRunner;


/**
 * @author wubin
 */
public class MybatisGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String config = MybatisGenerator.class.getClassLoader().getResource("mybatis-generator/generatorConfig.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
		System.out.println("生成自动代码成功");
	}
}

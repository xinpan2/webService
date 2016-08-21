package com.xinpaninjava.test;

import java.util.List;

import org.junit.Test;

import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

public class TestTranslate {
	/*
	 * 得到指定的服务
	 * 
	 * 得到该服务的所有子服务集合
	 * 
	 * 调用指定服务，并接受返回值
	 * 
	 * 输出结果
	 */
	@Test
	public void test() {
		// 得到指定的服务
		EnglishChinese ws = new EnglishChinese();
		// 得到该服务的所有子服务集合
		EnglishChineseSoap functions = ws.getEnglishChineseSoap();
		// 调用指定服务，并接受返回值
		List<String> list = functions.translatorString("fancy").getString();
		// 输出结果
		for (String s : list)
			System.out.println(s);

	}
}

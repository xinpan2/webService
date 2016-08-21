package com.xinpaninjava.test;

import java.util.List;

import org.junit.Test;

import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

public class TestTranslate {
	/*
	 * �õ�ָ���ķ���
	 * 
	 * �õ��÷���������ӷ��񼯺�
	 * 
	 * ����ָ�����񣬲����ܷ���ֵ
	 * 
	 * ������
	 */
	@Test
	public void test() {
		// �õ�ָ���ķ���
		EnglishChinese ws = new EnglishChinese();
		// �õ��÷���������ӷ��񼯺�
		EnglishChineseSoap functions = ws.getEnglishChineseSoap();
		// ����ָ�����񣬲����ܷ���ֵ
		List<String> list = functions.translatorString("fancy").getString();
		// ������
		for (String s : list)
			System.out.println(s);

	}
}

package com.xinpaninjava.test;

import org.junit.Test;

import com.xinpaninjava.myws.HelloWS;
import com.xinpaninjava.myws.HelloWSService;

/**
 * my ws test by invoking the sayHello method
 * 
 * 1¡¢get the ws£ºby refering the wsdl bottom configuration
 * 
 * 2¡¢get the serviceList
 * 
 * 3¡¢invoke
 * 
 */
public class MYWSTest {

	@Test
	public void testSayHello() {
		// get the ws
		HelloWSService ws = new HelloWSService();
		// get the serviceList
		HelloWS serviceList = ws.getHelloWSPort();
		// invoke
		serviceList.sayHello("XinPan");
	}
}

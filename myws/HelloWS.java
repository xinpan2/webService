package com.xinpaninjava.myws;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * First we publish an EndPoint by given configurations,address and implementor.
 * 
 * Before publishing ,we should check out the port whether being used
 * 
 * If there are conflict with the port, utilize others port instead
 * 
 * The ensuing step is that devise the concrete method to call by client.
 * 
 * Last,run the application and see what's going on the command line!
 *
 */

@WebService
public class HelloWS {
	// concrete method to call by client like the translate example
	public String sayHello(String name) {
		System.out.println("Hello " + name);
		return "Hello " + name;
	}

	public static void main(String[] args) {
		String address = "http://localhost:8888/sayHello";
		HelloWS implementor = new HelloWS();
		Endpoint.publish(address, implementor);
		System.out.println("HelloWS~~~~run~~~~");
	}

}

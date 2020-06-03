package com.cy.pj.common.gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassA {

	public void finalize() throws Throwable {
		System.out.println("finalize()");
	}
}

// -XX:+PrintGCDetails
// -XX:+TraceClassLoading
public class ObjectGCTest01 {
	public static void main(String[] args) {
		Map<String, Object> beanPool = new HashMap<String, Object>();
		ClassA a = new ClassA();
		//beanPool.put("classA", a);
//		beanPool.clear();
	//	a = null;
		List<byte[]> list = new ArrayList<byte[]>();
		for (int j = 0; j < 10000000; j++) {
			byte[] c = new byte[1024];
			list.add(c);

		}
		System.gc();
	}
}

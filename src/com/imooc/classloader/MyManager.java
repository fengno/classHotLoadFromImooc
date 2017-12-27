package com.imooc.classloader;

/**
 * {@link BaseManager}的子类，此类需要实现Java类的热加载功能
 */
public class MyManager implements BaseManager {

	@Override
	public void logic() {
		System.out.println("test.......111");
		System.out.println("test2");
	}

}
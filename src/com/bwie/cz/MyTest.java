package com.bwie.cz;

public class MyTest {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		//实例化对象
		MyTest mt=new MyTest();
		mt.test();
		mt.test(20);
		mt.test("Hello World", 345);

	}
	//定义没有参数的方法
	public void test(){
		System.out.println("没有参数-------------");
	}
	//定义有一个参数的方法
	public void test(int num){
		System.out.println("传递过来一个参数: "+num);
	}
	//定义有两个参数的方法
	public void test(String a,int b){
		System.out.println("传递一个参数: "+a+"             第二个参数: "+b);
	}

}

package com.bwie.cz;

public class MyTest {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		//ʵ��������
		MyTest mt=new MyTest();
		mt.test();
		mt.test(20);
		mt.test("Hello World", 345);

	}
	//����û�в����ķ���
	public void test(){
		System.out.println("û�в���-------------");
	}
	//������һ�������ķ���
	public void test(int num){
		System.out.println("���ݹ���һ������: "+num);
	}
	//���������������ķ���
	public void test(String a,int b){
		System.out.println("����һ������: "+a+"             �ڶ�������: "+b);
	}

}

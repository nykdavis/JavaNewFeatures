package com.davis.java11.localVariableInLambada;

public class localVariableInLambadaPractice {

	public static void main(String[] args) {
		var x = 5;
		var y = 123;
		
		Add obj = (a,b)-> a+b;
		System.out.println(obj.operator(x, y));

	}

}

interface Add{
	 int operator(int a,int b);
}

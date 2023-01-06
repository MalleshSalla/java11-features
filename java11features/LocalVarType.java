package com.java11features;

public class LocalVarType {

	//var av = "asd";
	public static void main(String[] args) {
		
		var x = "avd98";
		var y = 123;
		var z = true;
		var c = 'a';
		
		FuncInter funObj = (var a,var b) -> a+b;
		System.out.println(funObj.operation(10,20));
	}

}

interface FuncInter {
	int operation(int a,int b);
}

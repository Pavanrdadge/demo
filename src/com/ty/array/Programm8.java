package com.ty.array;

import java.lang.reflect.Array;

public class Programm8 {

	public static void main(String[] args) {
		
		int[]a= {10,20,30,40};
		demo(a);
	}
	public static void demo(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

package com.ty.array;

import java.util.Scanner;

public class Programm7 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter a Array size:  ");
		int n=scn.nextInt();
		
		int[]a=new int[n];
		
          		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+ " element ");
			int value=scn.nextInt();
			a[i]=value;
		}
		System.out.println("thank you for entering the elements: ");
		System.out.println("Entered elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

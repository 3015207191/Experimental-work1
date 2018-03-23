package Homework1;

import java.util.function.IntConsumer;

import javax.print.attribute.standard.RequestingUserName;

public class triangle {
	public boolean isTriangle(int a,int b,int c){
		if((a+b>c)&&(a+c>b)&&(b+c>a))
		{
			return true;
		}
		else return false;
	}
	public boolean equilateral(int a,int b,int c){
		if(a==b && b==c && a==c) 
		{
			return true;
		}
		else return false;
	}
	public boolean isosceles(int a,int b,int c){
		if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a))
		{
			return true;
		}
		else return false;
	}
	public boolean scalene(int a,int b,int c){
		if((a!=b)&&(a!=c)&&(b!=c))
		{
			return true;
		}
		else return false;
	}
	public static void main(String args[]){
	}


}

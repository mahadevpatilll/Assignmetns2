package com.methodoverloading;

public class ExampleTwo {
	public void add(int x,int y) {
		System.out.println(x+y);
	}
public void add(int x,int y,int z) {
	System.out.println(x+y+z);
}

	public static void main(String[] args) {
		ExampleTwo exampleTwo = new ExampleTwo();
		exampleTwo.add(1, 9);
		exampleTwo.add(3,4 ,02);
}
	

}

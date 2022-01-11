package com.methodoverloading;

public class Example {
void login(String username,String password) {
	System.out.println("your username is "+username);
	System.out.println("your password "+password);
}
void login(String password,long phonenumber) {
	System.out.println("your username is "+password);
	System.out.println("your password "+phonenumber);
}
	public static void main(String[] args) {
Example o=new Example();
o.login("mahadev",829382838276l);
o.login("praveen","jnhdhybdh");
	}

}

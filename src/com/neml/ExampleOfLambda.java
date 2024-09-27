package com.neml;

public class ExampleOfLambda {

	public static void main(String[] args) {

	Foo foo = parameter -> parameter + " from lambda";
	useFoo ufoo = new useFoo();
	String result = ufoo.add("Message ", foo);
	System.out.println(result);
	}
}
class useFoo{
	public  String add(String string, Foo foo) {
	    return foo.method(string);
	}
}
@FunctionalInterface
 interface Foo {
    String method(String string);
}
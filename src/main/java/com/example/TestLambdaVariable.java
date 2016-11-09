package com.example;

import java.util.function.Function;

public class TestLambdaVariable {
	public static void main(String[] argv) {
		 String x = "Hello";
		Function<String, String> func1 = y -> {
			return y + " " + x;
		};
		System.out.println(func1.apply("test.com"));

	}
}
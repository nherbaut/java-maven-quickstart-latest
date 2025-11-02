package com.example;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		Optional<String> strArgs = Arrays.stream(args).reduce(new BinaryOperator<String>() {
			public String apply(String t, String u) {
				return t + " " + u;
			}
		});

		System.out.println("hello world, cli args were: " + strArgs.orElse("none"));
	}
}

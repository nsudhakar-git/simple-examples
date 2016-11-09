package com.example;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class TestPrime {

	public static final Logger log = LoggerFactory.getLogger(TestPrime.class);
	static boolean checkPrime(int number){
		IntPredicate isDiv = index -> number%index ==0;
		
		int t = number;
		t=(int) Math.round(Math.sqrt(number));
				
		return number>1&& IntStream.range(2, t).noneMatch(isDiv);
		
	}
	
	
	
	static void print(int num){
		
	}
	public static void main(String[] args) {
		
		
		log.info("40: "+checkPrime(40123333));
		log.info("43: "+checkPrime(72323));
		log.info("43: "+checkPrime(2232332));
		log.info("43: "+checkPrime(161231233));
	}
}

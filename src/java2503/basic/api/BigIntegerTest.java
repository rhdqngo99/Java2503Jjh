package java2503.basic.api;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		
		// long의 범위 : -2^63 ~ 2^63-1 (-9,223,372,036,854,775,808 ~ 
		BigInteger bi1 = new BigInteger("2390486548650052156489656684644852963258741125566338548499699199");
		BigInteger bi2 = new BigInteger("93997486548615005215648965668464485296325874112");
		
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		System.out.println(bi1.remainder(bi2));
	} // main

} // class

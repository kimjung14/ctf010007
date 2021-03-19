package com.buzzfreeze.helloWorld;

public class HelloWorld {
	public static void main(String [] args) {
		int num;
		num = 20;
		boolean is1sttime = true;
		String mystring = "Fighting!!!";
		short shortvar = 555;
		double doublevar = 555.55;
		float floatvar = 123466789.98756f;
		char charvar = 'A';
		int convf2int = (int) floatvar;
		float convint2f = num;
		float convd2f = (float) doublevar;
		int convc2int = charvar;
		final int finalvar = 8888;
		System.out.println("Hello World");
		System.out.println("*------------------ Lab 2.1 -------------------------**");
		System.out.println("This is a Integer: " + num);
		System.out.println("This is a boolean: " + is1sttime);
		System.out.println("This is a String: " + mystring);
		System.out.println("This is a Short: " + shortvar);
		System.out.println("This is a Double: " + doublevar);
		System.out.println("This is a Float: " + floatvar);
		System.out.println("*------------------ Lab 2.2 -------------------------**");
		bark();
		System.out.println("Convert float to int : " + convf2int);
		System.out.println("Convert int to float : " + convint2f);
		System.out.println("Convert double to float : " + convd2f);
		System.out.println("Convert char to int : " + convc2int);
		System.out.println("This is a Final var: " + finalvar);
		System.out.println("*------------------ Lab 3   -------------------------**");
		int i = 20;
		System.out.println("i = " + i);
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("i++ 5 times = " + i);
		i--;
		i--;
		i--;
		i--;
		i--;
		System.out.println("i-- 5 times = " + i);
		System.out.println("float = " + floatvar);
		if (floatvar > 0f && floatvar < 100f) {
			System.out.println("&& float is true");
		} else {
			System.out.println("&& float is false");
		};
		System.out.println("char = " + charvar);
		if (charvar == 'b' || charvar == 'A'){
			System.out.println("char is A or b");
		} else {
			System.out.println("char is not A or b");
		};
		System.out.println("int = " + i);
		if (i > 0 && i < 50) {
			System.out.println("i in Range 1 - 49");
		} else {
			System.out.println("i in Range > 50");
		};
		System.out.println("*------------------ Lab 4.1   -------------------------**");
		int score = 15;
		boolean isHandSome = true;
		if (isHandSome) {
			System.out.println("Good");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else if (score >= 50 && score < 80){
				System.out.println("normal");
			} else {
				System.out.println("fail");
			}	
		}		
		System.out.println("*------------------ Lab 4.3   -------------------------**");
		grade(80);
		grade(75);
		grade(70);
		grade(65);
		grade(60);
		grade(55);
		grade(50);
		grade(45);
		grade(40);
		grade(30);
	}

	public static void bark() {
		String dogName = "Begal";
		System.out.println(dogName + " bark");
	}
	
	public static void grade(int inscore) {
		switch (inscore) {
		case 80: 
			System.out.println("A"); break;
		case 70: 
			System.out.println("B"); break;
		case 60: 
			System.out.println("C"); break;
		case 50: 
			System.out.println("D"); break;
		case 40: 
			System.out.println("F"); break;
		default:
		    System.out.println("E");
		
		};
	}
	
}

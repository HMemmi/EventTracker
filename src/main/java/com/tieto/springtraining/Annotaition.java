package com.tieto.springtraining;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

enum os {
	android, symbian
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String os() default "symbian";

	int version() default 1;
}

@SmartPhone(os = "android", version = 6)
class NokiaAndroidSeries {

	String model;
	int size;

	public NokiaAndroidSeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

@SmartPhone
class NokiaSymbiaSeries {
	String model;
	int size;

	public NokiaSymbiaSeries(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

public class Annotaition {

	public static void main(String[] args) {
		NokiaAndroidSeries android = new NokiaAndroidSeries("Nokia s", 5);
		Class<? extends NokiaAndroidSeries> c = android.getClass();
		SmartPhone an = c.getAnnotation(SmartPhone.class);
		System.out.println(an.os());

		NokiaSymbiaSeries symbian = new NokiaSymbiaSeries("nokia 6610", 3);
		Class<? extends NokiaSymbiaSeries> classA = symbian.getClass();
		SmartPhone anS = classA.getAnnotation(SmartPhone.class);
		System.out.println(anS.os());

		if (anS.os().equals(os.symbian.toString())) {
			System.out.println("yes");
		}
	}

}

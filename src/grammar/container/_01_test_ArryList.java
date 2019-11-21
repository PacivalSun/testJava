package grammar.container;

import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Orange {
}

public class _01_test_ArryList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			System.out.println(((Apple) apples.get(i)).id());
		}
//		将Orange插入ArrayList时不会有问题但将其取出来的时候会报错
		
//		System.out.println(apples.size());
	}

}

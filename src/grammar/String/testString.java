package grammar.String;

public class testString {

	public testString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,3,5,3,2,5};
		String res1 = f1(list);
		System.out.println(res1);
		String res2 = f2(list);
		System.out.println(res2);
		
		String b1 = "asdf";
		String b2 = "ghjkl";
		System.out.println(b1.concat(b2));
		System.out.println(b1.replace("a", "1"));
		System.out.format("111" + b1 + "222");
				
	}

	public static String f1(int[] x) {
		String a = "[";
		for (int i:x) {
			a += i;
		}
		a += "]";
		return a;
	}
	
	public static String f2(int[] x) {
		StringBuilder a = new StringBuilder("[");
		for (int i:x) {
			a.append(i);
		}
		a.append("]");
		return a.toString();
	}

}

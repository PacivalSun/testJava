package grammar.regularExpression;

public class testRegularExpression {

	public testRegularExpression() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("1+".matches("\\d\\+"));
		System.out.println("a1+oisdhfua1+sdga1+".split("a\\d\\+"));
		System.out.println("a1+oisdhfua1+sdga1+".replaceAll("a\\d\\+", "123"));
		System.out.println("a1+oisdhfua1+sdga1+".replaceFirst("a\\d\\+", "123"));
		
	}
}

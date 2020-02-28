package rateCalc;

import java.math.BigDecimal;

public class Mortgage {
	public static void main(String[] args) {
		double basicRate = 4.9 / 100;  //基础年利率

		double total = 100 * 10000;  //总额
		double range = 30 * 12;  //周期数
		double percentage = 20 / 100;
		double rate = percentage * basicRate;
		
		BigDecimal perMonth = basicCalc(total, range, rate);
		System.out.println(perMonth);
	}
	
	//基础计算方法
	public static BigDecimal basicCalc(double a, double b, double c) {
//		double perMonth = total
//				* (rate / (1 + rate))
//				/ (1 - (Math.pow(1 / (1 + rate), 12 * range)));
		BigDecimal total = new BigDecimal(a);
		BigDecimal range = new BigDecimal(b);
		BigDecimal rate = new BigDecimal(c);
		
		BigDecimal perMonth = total.
				multiply(rate.divide(rate.add(new BigDecimal(1)))).
				divide(new BigDecimal(1).subtract((new BigDecimal(1).divide(rate.add(new BigDecimal(1))).pow(360))));
//		System.out.println(total);
//			
//		System.out.println(son);
//		double mom = 1 - (Math.pow(1 / (1 + rate), 12 * range));
//		System.out.println(mom);
//		double perMonth = total * son / mom;
//		
		
		System.out.println("子函数结束了");
		return perMonth;
		
	}
	
}

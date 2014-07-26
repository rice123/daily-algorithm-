package sunHui.IO流装饰者模式Mybatis中的装饰者模式.decorator.starbuzz;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}


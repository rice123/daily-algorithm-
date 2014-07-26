package sunHui.IO流装饰者模式Mybatis中的装饰者模式.decorator.starbuzz;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}


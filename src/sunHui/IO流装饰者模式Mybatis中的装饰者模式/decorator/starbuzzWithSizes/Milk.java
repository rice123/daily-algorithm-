package sunHui.IO流装饰者模式Mybatis中的装饰者模式.decorator.starbuzzWithSizes;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}

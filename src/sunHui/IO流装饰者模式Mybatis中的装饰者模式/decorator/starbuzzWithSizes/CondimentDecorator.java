package sunHui.IO流装饰者模式Mybatis中的装饰者模式.decorator.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}

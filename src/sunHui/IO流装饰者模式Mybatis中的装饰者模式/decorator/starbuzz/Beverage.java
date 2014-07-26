package sunHui.IO流装饰者模式Mybatis中的装饰者模式.decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}

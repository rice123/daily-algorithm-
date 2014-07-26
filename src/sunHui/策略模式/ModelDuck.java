package sunHui.策略模式;


public class ModelDuck extends Duck{
	public ModelDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auemto-generated method stub
		System.out.println("����ģ��Ѽ");
	}

}

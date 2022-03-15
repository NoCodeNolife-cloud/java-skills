package AspectJXML;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 15 星期二 上午 10:53
 * 描述:
 */
public class OrderDaoImpl implements OrderDao {
	@Override
	public void add() {
		System.out.println("正在执行 OrderDao 中的 add() 方法");
	}

	@Override
	public void delete() {
		System.out.println("正在执行 OrderDao 中的 delete() 方法");
	}

	@Override
	public Integer modify() {
		System.out.println("正在执行 OrderDao 中的 modify() 方法");
		return 1;
	}

	@Override
	public void get() {
		//异常
		int a = 10 / 0;
		System.out.println("正在执行 OrderDao 中的 get() 方法");
	}
}

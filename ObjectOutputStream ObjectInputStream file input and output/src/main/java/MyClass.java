import java.io.Serializable;

/**
 * 项目名:  ObjectOutputStream ObjectInputStream file input and output
 * 开发者:  Administrator
 * 创建于:  2022 一月 22 星期六 13:11
 * 描述:
 */
public class MyClass implements Serializable {

	private int value;

	public MyClass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

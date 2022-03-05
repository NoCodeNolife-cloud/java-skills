/**
 * 项目名:  JUnit
 * 开发者:  Administrator
 * 创建于:  2022 三月 03 星期四 16:26
 * 描述:
 */
public class MessageUtil {

	private String message;

	//Constructor
	//@param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}

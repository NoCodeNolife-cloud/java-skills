import java.sql.*;
import java.util.Vector;

/**
 * 项目名:  mysql
 * 开发者:  Administrator
 * 创建于:  2022 二月 02 星期三 20:20
 * 描述:
 */
public class MySQLtest {

	public static void main(String[] args) throws Exception {

		Connection connection;
		//jdbc驱动
		String driver = "com.mysql.cj.jdbc.Driver";
		//这里我的数据库是mydata
		String url = "jdbc:mysql://localhost:3306/mydata?&useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "123456";

		PreparedStatement preparedStatement = null;
		Vector rows = new Vector();// 结果集合必须每次打印后清零初始化
		String options;
		ResultSet resultSet;

		// 连接数据库
		//注册JDBC驱动程序
		Class.forName(driver);
		//建立连接
		connection = DriverManager.getConnection(url, user, password);
		if (!connection.isClosed()) {
			System.out.println("数据库连接成功");
		}

		// 得到和数据库表数据
		options = "select * from mytable";// 获取所有数据
		preparedStatement = connection.prepareStatement(options);
		resultSet = preparedStatement.executeQuery();

		ResultSetMetaData rsmd = resultSet.getMetaData();
		while (resultSet.next()) {
			Vector currentRow = new Vector();// 获得单行数据
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				currentRow.addElement(resultSet.getString(i));// 获得单行列数据
			}
			rows.addElement(currentRow);
		}
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i));
		}

		rows.clear();
		System.out.println("-----------");

		// 增加数据
		options = "insert into mytable values(25,'黄晓明')";
		Statement statement = connection.createStatement();
		statement.execute(options);// 执行指令

		// 打印结果
		options = "select * from mytable";// 获取所有数据
		preparedStatement = connection.prepareStatement(options);
		resultSet = preparedStatement.executeQuery();

		rsmd = resultSet.getMetaData();
		while (resultSet.next()) {
			Vector currentRow = new Vector();// 获得单行数据
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				currentRow.addElement(resultSet.getString(i));// 获得单行列数据
			}
			rows.addElement(currentRow);
		}
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i));
		}

		rows.clear();
		System.out.println("-----------");

		// 删除数据
		options = "delete from mytable where id='25'";
		statement = connection.createStatement();
		statement.execute(options);// 执行指令

		// 打印结果
		options = "select * from mytable";// 获取所有数据
		preparedStatement = connection.prepareStatement(options);
		resultSet = preparedStatement.executeQuery();

		rsmd = resultSet.getMetaData();
		while (resultSet.next()) {
			Vector currentRow = new Vector();// 获得单行数据
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				currentRow.addElement(resultSet.getString(i));// 获得单行列数据
			}
			rows.addElement(currentRow);
		}
		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i));
		}

		rows.clear();
		System.out.println("-----------");

		// 数据库关闭
		connection.close();
	}
}

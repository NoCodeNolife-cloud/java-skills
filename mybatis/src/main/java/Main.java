import com.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 项目名:  untitled
 * 开发者:  Administrator
 * 创建于:  2022 一月 30 星期日 21:09
 * 描述: URI格式:
 */
public class Main {

	public static void main(String[] args) {
		// 根据 config.xml 配置的信息得到 sqlSessionFactory
		String resource = "config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 然后根据 sqlSessionFactory 得到 session
		SqlSession session = sqlSessionFactory.openSession();
		// 最后通过 session 的 selectList() 方法调用 sql 语句 listStudent
		Student student = session.selectOne("selectByPrimaryKey", 1);
		System.out.println(student.toString());
	}
}

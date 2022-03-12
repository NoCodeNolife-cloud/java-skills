package RefCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 项目名:  Spring_demo
 * 开发者:  Administrator
 * 创建于:  2022 三月 12 星期六 上午 11:03
 * 描述:
 */
public class RefJavaCollection {
	//1 数组类型属性
	private RefCourse[] courses;
	//2 list 集合类型属性
	private List<String> list;
	//3 map 集合类型属性
	private Map<String, String> maps;
	//4 set 集合类型属性
	private Set<String> sets;

	public void setCourses(RefCourse[] courses) {
		this.courses = courses;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "JavaCollection{" +
				"courses=" + Arrays.toString(courses) +
				", list=" + list +
				", maps=" + maps +
				", sets=" + sets +
				'}';
	}
}

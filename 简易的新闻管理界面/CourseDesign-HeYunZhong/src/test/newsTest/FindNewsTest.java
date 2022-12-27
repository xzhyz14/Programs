package test.newsTest;

import java.util.ArrayList;

import bean.News;
import dao.NewsDao;

public class FindNewsTest {

	public static void main(String[] args) {
		//创建一个名称为usersDao的对象
		NewsDao newsDao = new NewsDao();
		//将UsersDao对象的findAll()方法执行后的结果放入List集合
		ArrayList<News> list = newsDao.findAll();
		for(int i =0;i<list.size();i++) {
			System.out.println("第" + (i + 1) + "条数据的News值为" + list.get(i).toString());
		}
		
		
	}

}
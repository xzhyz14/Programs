package test.newsTest;

import java.util.ArrayList;
import java.util.Date;

import bean.News;
import dao.NewsDao;

public class UpdateNewsTest {
	public static void main(String[] args) {
		// 创建一个名称为usersDao的对象
		NewsDao newsDao = new NewsDao();
		News news = newsDao.find(1);
//		System.out.println("更新前：" + news);
		news.setTitle("我爱中国");
		boolean re = newsDao.update(news);
//		System.out.println("更新后：" + news);
//		System.out.println(re);
		if(re) {
			System.out.println("更新成功！");
		}else {
			System.out.println("更新失败！");
		}
	}
}

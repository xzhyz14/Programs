package test.newsTest;

import java.util.Date;

import bean.News;
import dao.NewsDao;

public class InsertNewsTest {
	public static void main(String[] args) {
		NewsDao newsDao = new NewsDao();
		News news = new News(10,"1","1","1",new Date());
//		news.setId(1);
//		news.setTitle("1");
//		news.setSource("1");
//		news.setContent("1");
//		news.setDate(new Date());
		boolean re = newsDao.insert(news);
		System.out.println(re);
		if(re) {
			System.out.println("成功添加一条记录！");
		}else {
			System.out.println("添加记录失败！");
		}
	}
}

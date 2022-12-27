package test.newsTest;

import bean.News;
import dao.NewsDao;

public class FindByIdTest {
public static void main(String[] args) {
	NewsDao newsDao = new NewsDao();
	News news = newsDao.find(1);
	if(news !=  null) {
		System.out.println(news.toString());
	}else {
		System.out.println("未找到符合该要求的记录！");
	}
}
}

package test.newsTest;

import java.util.ArrayList;

import bean.News;
import dao.NewsDao;

public class FindByTitleTest {

	public static void main(String[] args) {
		NewsDao newsDao = new NewsDao();
		ArrayList<News> list = newsDao.findByTitle("1");
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.println("未找到符合该要求的记录！");
		}
	}

}

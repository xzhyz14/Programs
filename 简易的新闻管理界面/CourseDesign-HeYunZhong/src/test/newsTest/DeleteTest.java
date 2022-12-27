package test.newsTest;

import java.util.Date;

import bean.News;
import dao.NewsDao;

public class DeleteTest {
	public static void main(String[] args) {
		NewsDao newsDao = new NewsDao();
		boolean re = newsDao.delete(10);
		System.out.println(re);
		if(re) {
			System.out.println("成功删除一条记录！");
		}else {
			System.out.println("删除记录失败！");
		}
	}
}

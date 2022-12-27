package test.userTest;

import java.util.ArrayList;

import bean.User;
import dao.UserDao;


public class FindUserTest {
	public static void main(String[] args) {
		//创建一个名称为usersDao的对象
		UserDao uD = new UserDao();
		//将UsersDao对象的findAll()方法执行后的结果放入List集合
		ArrayList<User> list = uD.findAllUser();
		
		for(int i =0;i<list.size();i++) {
			System.out.println("第" + (i + 1) + "条数据的User值为" + list.get(i).toString());
		}
	}
}

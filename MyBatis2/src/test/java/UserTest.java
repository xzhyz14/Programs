import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.example.User;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTest {
    /**
     * 查询
     *
     * @throws IOException
     */
    @Test
    public void findByIdTest() throws IOException {
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;
        try {
            //读取mybatis-config.xml文件内容到reader对象中
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //初始化mybatis数据库，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        //创建SqlSession实例
        SqlSession session = sqlMapper.openSession();
        //传入参数查询，返回结果

        //查找一个
        User user = session.selectOne("findById", 1);
        System.out.println(user);
        System.out.println("=====================");
        //查找全部
        List<User> users = session.selectList("findAll");
        for (User u : users) {
            System.out.println(u);
        }


    }

    /**
     * 插入
     */
    @Test
    public void InsertUser() {
        try {
            //获取核心配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //创建SqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行sql语句
            int num = sqlSession.insert("insertUser", new User("王毅", 18));
            System.out.println(num);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 更新
     */
    @Test
    public void Update() {
        try {
            //获取核心配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //创建SqlSession对象
            SqlSession session = sqlSessionFactory.openSession();
            //执行SQL语句
            int num = session.update("updateByName", new User("张三", 19));
            System.out.println(num);
            session.commit();
            session.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 删除操作
     */
    @Test
    public void deleteByName(){
        try {
            //获取核心配置
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //创建SqlSession对象
            SqlSession session = sqlSessionFactory.openSession();
            //执行sql语句
            User user = new User();
            user.setUname("王毅");
            int num = session.delete("deleteByName",user);
            System.out.println(num);
            session.commit();
            session.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

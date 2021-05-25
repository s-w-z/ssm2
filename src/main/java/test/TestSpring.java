package test;

import hezeu.jsj.domain.Admin;
import hezeu.jsj.service.AccountService;
import hezeu.jsj.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testSpring(){
        //加载配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AdminService adminService = (AdminService) ac.getBean("adminServiceImpl");
        Admin admin = adminService.login("admin", "admin");
        System.out.println(admin);
    }
}

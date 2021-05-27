package hezeu.jsj.controller;

import hezeu.jsj.domain.Admin;
import hezeu.jsj.domain.Student;
import hezeu.jsj.service.AdminService;
import hezeu.jsj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("userInfo")
@RequestMapping("/")
public class LoginController {
    // 自动赋值，得到service
    @Autowired
    private AdminService adminService;
    @Autowired
    private StudentService studentService;

    // 登录检测
    @RequestMapping("login")
    public String login(Model model, String userName, String password, String status,Map<String,String> map){
        // 检查用户身份
        //1、用户为管理员
        if(status.equals("admin")){
            // 检查用户名密码是否正确
            Admin admin = adminService.login(userName, password);
            // 如果正确
            if(admin != null){
                // 放入session
                System.out.println("登录调用管理员登陆成功");
                model.addAttribute("userInfo",admin);
                return "admin/index";
            }else{
                map.put("msg","false");
                return "forward:/login.jsp";
            }
        }
        //2、用户为档案管理员
        if(status.equals("archivist")){

        }
        //3、用户为学生
        if(status.equals("student")){
            Student student = studentService.login(userName,password);
            // 如果正确
            if(student != null){
                // 放入session
                System.out.println("登录调用管理员登陆成功");
                model.addAttribute("userInfo",student);
                return "student/index";
            }else{
                map.put("msg","false");
                return "forward:/login.jsp";
            }
        }
        return null;
    }
}

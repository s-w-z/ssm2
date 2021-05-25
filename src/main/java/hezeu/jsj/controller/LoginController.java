package hezeu.jsj.controller;

import hezeu.jsj.domain.Admin;
import hezeu.jsj.service.AdminService;
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

    // 登录检测
    @RequestMapping("login")
    @ResponseBody
    public Map<String,String> login(Model model, String userName, String password, String status){
        // 检查用户身份
        //1、用户为管理员
        if(status.equals("admin")){
            // 检查用户名密码是否正确
            Admin admin = adminService.login(userName, password);
            Map<String,String> map = new HashMap();
            if(admin != null){
                // 放入session
                model.addAttribute("userInfo",admin);
                map.put("msg","true");
                return map;
            }else{
                map.put("msg","false");
                return map;
            }
        }
        //2、用户为档案管理员
        if(status.equals("archivist")){

        }
        //3、用户为学生
        if(status.equals("student")){

        }
        return null;
    }
}

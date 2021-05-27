package hezeu.jsj.service;

import hezeu.jsj.domain.Student;

public interface StudentService {

    /**
     * 通过学号和密码登录
     * @param stuNo 学号
     * @param password 密码
     * @return 登陆成功返回学生对象，失败返回null
     */
    Student login(String stuNo,String password);
}

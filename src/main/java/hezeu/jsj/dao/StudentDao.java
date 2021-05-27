package hezeu.jsj.dao;

import hezeu.jsj.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    /**
     * 通过学号和密码登录
     * @param stuNo 学号
     * @param password 密码
     * @return 登陆成功返回student对象
     */
    Student getStudentByUP(@Param("stuNo") String stuNo, @Param("password") String password);
}

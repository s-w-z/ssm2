package hezeu.jsj.service.impl;

import hezeu.jsj.dao.StudentDao;
import hezeu.jsj.domain.Student;
import hezeu.jsj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student login(String stuNo, String password) {
        Student student = studentDao.getStudentByUP(stuNo, password);
        return student;
    }
}

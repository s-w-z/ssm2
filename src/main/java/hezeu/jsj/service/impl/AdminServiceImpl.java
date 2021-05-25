package hezeu.jsj.service.impl;

import hezeu.jsj.dao.AdminDao;
import hezeu.jsj.domain.Admin;
import hezeu.jsj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin login(String username, String password) {
        Admin admin = adminDao.getAdminByUP(username, password);
        return admin;
    }
}

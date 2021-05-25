package hezeu.jsj.service;

import hezeu.jsj.domain.Admin;

public interface AdminService {
    /**
     * 用户登录验证，返回用户对象
     * @param username
     * @param password
     * @return
     */
    Admin login(String username,String password);
}

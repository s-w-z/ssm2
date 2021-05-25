package hezeu.jsj.dao;

import hezeu.jsj.domain.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    /**
     * 通过username和password查询
     * @param username
     * @param password
     * @return
     */
    Admin getAdminByUP(@Param("userName") String username, @Param("password") String password);
}

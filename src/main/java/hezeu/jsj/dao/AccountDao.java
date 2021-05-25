package hezeu.jsj.dao;

import hezeu.jsj.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
}

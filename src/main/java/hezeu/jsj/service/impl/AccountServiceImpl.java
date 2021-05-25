package hezeu.jsj.service.impl;

import hezeu.jsj.dao.AccountDao;
import hezeu.jsj.domain.Account;
import hezeu.jsj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("查询所有");
        List<Account> list = accountDao.findAll();
        for(Account account:list){
            System.out.println(account);
        }
        return null;
    }
}

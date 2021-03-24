package com.copasso.billbook.service;

import com.copasso.billbook.bean.Accounts;
import com.copasso.billbook.dao.AccountsMapper;
import com.copasso.billbook.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsMapper accountsMapper;

}

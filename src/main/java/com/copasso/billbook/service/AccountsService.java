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

    public String getMonthIncomeByUserIdWithYearMonth(Long uid, String date_year, String date_month) {
        return StringUtils.null2Zero(accountsMapper.getMonthIncomeByUserIdWithYearMonth(uid, date_year, date_month));
    }

    public String getMonthOutcomeByUserIdWithYearMonth(Long uid, String date_year, String date_month) {
        return StringUtils.null2Zero(accountsMapper.getMonthOutcomeByUserIdWithYearMonth(uid, date_year, date_month));
    }

    public List<String> selectAccountsDateByUserIdWithYearMonth(Long uid, String date_year, String date_month) {
        return accountsMapper.selectAccountsDateByUserIdWithYearMonth(uid, date_year, date_month);
    }

    public List<Accounts> selectAccountsByUserIdWithDate(Long uid, String date) {
        return accountsMapper.selectAccountsByUserIdWithDate(uid, date);
    }

    public String getDayIncomeByUserIdWithDate(Long uid, String date) {
        return StringUtils.null2Zero(accountsMapper.getDayIncomeByUserIdWithDate(uid, date));
    }

    public String getDayOutcomeByUserIdWithDate(Long uid, String date) {
        return StringUtils.null2Zero(accountsMapper.getDayOutcomeByUserIdWithDate(uid, date));
    }
}

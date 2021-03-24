package com.copasso.billbook.dao;

import com.copasso.billbook.bean.Accounts;

import java.util.List;

public interface AccountsMapper {
    String getMonthIncomeByUserIdWithYearMonth(Long uid, String date_year, String date_month);
    String getMonthOutcomeByUserIdWithYearMonth(Long uid, String date_year, String date_month);
    List<String> selectAccountsDateByUserIdWithYearMonth(Long uid, String date_year, String date_month);
    List<Accounts> selectAccountsByUserIdWithDate(Long uid, String date);
    String getDayIncomeByUserIdWithDate(Integer userid, String date);
    String getDayOutcomeByUserIdWithDate(Integer userid, String date);
}

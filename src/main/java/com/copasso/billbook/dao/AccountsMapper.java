package com.copasso.billbook.dao;

import com.copasso.billbook.bean.Accounts;

import java.util.List;

public interface AccountsMapper {
    String getMonthIncomeByUserIdWithYearMonth(Long uid, String date_year, String date_month);
    String getMonthOutcomeByUserIdWithYearMonth(Long uid, String date_year, String date_month);
    List<String> selectAccountsDateByUserIdWithYearMonth(Long uid, String date_year, String date_month);
    List<Accounts> selectAccountsByUserIdWithDate(Long uid, String date);
    String getDayIncomeByUserIdWithDate(Long uid, String date);
    String getDayOutcomeByUserIdWithDate(Long uid, String date);

    int deleteAccountsByCard(Long uid, String card);
    List<String> selectAccountsDateByUserIdWithCardYearMonth(Long uid, String card, String date_year, String date_month);
    int deleteAccountsByUserIdWithId(Long uid, Long id);
    List<Accounts> selectAccountsByUserIdWithCardYearMonth(Long uid, String card, String date_year, String date_month);
    List<Accounts> selectAccountsByUseIdWithCardDate(Long uid, String card, String date);
}

package com.copasso.billbook.controller;

import com.copasso.billbook.bean.Accounts;
import com.copasso.billbook.bean.MonthAccountsListBean;
import com.copasso.billbook.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @RequestMapping("user/{uid}/{yy}/{mm}")
    @ResponseBody
    public MonthAccountsListBean findDetailByUserIdWithYearMonth(@PathVariable("uid") Long uid,
                                                                 @PathVariable("yy") String date_year,
                                                                 @PathVariable("mm") String date_month) {
        MonthAccountsListBean monthAccountsListBean = new MonthAccountsListBean();
        List<MonthAccountsListBean.DayAccountsList> dayList = new ArrayList<>();

        monthAccountsListBean.setMonth_income(accountsService.getMonthIncomeByUserIdWithYearMonth(uid, date_year, date_month));
        monthAccountsListBean.setMonth_outcome(accountsService.getMonthOutcomeByUserIdWithYearMonth(uid, date_year, date_month));
        List<String> dateList = accountsService.selectAccountsDateByUserIdWithYearMonth(uid, date_year, date_month);
        for (String date : dateList) {
            MonthAccountsListBean.DayAccountsList dayAccountsList = new MonthAccountsListBean.DayAccountsList();
            dayAccountsList.setDate(date);
            dayAccountsList.setDay_income(accountsService.getDayIncomeByUserIdWithDate(uid, date));
            dayAccountsList.setDay_outcome(accountsService.getDayOutcomeByUserIdWithDate(uid, date));
            List<Accounts> list = accountsService.selectAccountsByUserIdWithDate(uid, date);
            dayAccountsList.setList(list);

            dayList.add(dayAccountsList);
        }

        monthAccountsListBean.setSuccess();
        if (dayList.size() == 0) monthAccountsListBean.setFail();

        monthAccountsListBean.setDayList(dayList);
        return monthAccountsListBean;
    }
}

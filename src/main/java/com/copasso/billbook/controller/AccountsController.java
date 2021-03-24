package com.copasso.billbook.controller;

import com.copasso.billbook.bean.Accounts;
import com.copasso.billbook.bean.MonthAccountsListBean;
import com.copasso.billbook.service.AccountsService;
import com.copasso.billbook.utils.DateUtils;
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

    @RequestMapping("user/{id}/{yy}/{mm}")
    @ResponseBody
    public MonthAccountsListBean findDetailByUserIdWithYearMonth(@PathVariable("id") Integer id,
                                                                 @PathVariable("yy") String year,
                                                                 @PathVariable("mm") String month) {
        MonthAccountsListBean monthAccountsListBean = new MonthAccountsListBean();
        List<MonthAccountsListBean.DayAccountsList> dayList = new ArrayList<>();



        monthAccountsListBean.setSuccess();
        if (dayList.size() == 0) monthAccountsListBean.setFail();

        monthAccountsListBean.setDayList(dayList);
        return monthAccountsListBean;
    }
}

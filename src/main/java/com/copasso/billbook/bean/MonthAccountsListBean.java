package com.copasso.billbook.bean;

import java.util.List;

public class MonthAccountsListBean extends BaseBean{
    private String month_income; // 本月总收入
    private String month_outcome; // 本月总支出
    private List<DayAccountsList> dayList; //本月的日记录

    public String getMonth_income() {
        return month_income;
    }

    public void setMonth_income(String month_income) {
        this.month_income = month_income;
    }

    public String getMonth_outcome() {
        return month_outcome;
    }

    public void setMonth_outcome(String month_outcome) {
        this.month_outcome = month_outcome;
    }

    public List<DayAccountsList> getDayList() {
        return dayList;
    }

    public void setDayList(List<DayAccountsList> dayList) {
        this.dayList = dayList;
    }

    public static class DayAccountsList {
        private String date; // 日期
        private String day_income; // 本日总收入
        private String day_outcome; // 本日总支出
        private List<Accounts> list; //本日记录

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDay_income() {
            return day_income;
        }

        public void setDay_income(String day_income) {
            this.day_income = day_income;
        }

        public String getDay_outcome() {
            return day_outcome;
        }

        public void setDay_outcome(String day_outcome) {
            this.day_outcome = day_outcome;
        }

        public List<Accounts> getList() {
            return list;
        }

        public void setList(List<Accounts> list) {
            this.list = list;
        }
    }
}

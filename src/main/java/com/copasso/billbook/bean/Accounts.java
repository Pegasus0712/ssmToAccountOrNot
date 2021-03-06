package com.copasso.billbook.bean;

public class Accounts {
    private long id; //账目专属id号
    private String first;   //一级分类
    private String second;  //二级分类
    private double price;    //账目金额
    //    private Date time;      //记账时间
    private String card;    //账户
    private String member;  //成员
    // 为测试流水新增的
    private String date;
    private String date_year;
    private String date_month;
    private String date_week;
    private String inorout; //收入支出类型
    private long uid; // 用户id

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate_year() {
        return date_year;
    }

    public void setDate_year(String date_year) {
        this.date_year = date_year;
    }

    public String getDate_month() {
        return date_month;
    }

    public void setDate_month(String date_month) {
        this.date_month = date_month;
    }

    public String getDate_week() {
        return date_week;
    }

    public void setDate_week(String date_week) {
        this.date_week = date_week;
    }

    public String getInorout() {
        return inorout;
    }

    public void setInorout(String inorout) {
        this.inorout = inorout;
    }
}

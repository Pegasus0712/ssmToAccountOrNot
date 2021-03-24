package com.copasso.billbook.bean;

public class Cards {
    private String cardName;    //账户名
    private String remark;  //备注
    private int image;     //图片
    private double income;     //收入
    private double outcome;    //支出
    private double surplus;    //结余
    private long uid; // 用户id

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        this.surplus = surplus;
    }
}

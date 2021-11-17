package policy.demo2.impl;

import policy.demo2.CashSuper;

/**
 * 返利收费子类
 * 返利活动，输入返利条件和返利值，比如满300返100，moneyCoditation为300，moneyReturn为100。
 */
public class CashReturn extends CashSuper {
    private double moneyConditation = 0.0;    //返利条件
    private double moneyReturn = 0.0d;    //返利值


    public CashReturn(double moneyConditation, double moneyReturn) {
        this.moneyConditation = moneyConditation;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyConditation) {
            result = money - Math.floor(money / moneyConditation) * moneyReturn;  //如果当前金额大于等于返利条件，则使用当前金额减去返利值。
        }
        return result;
    }
}

package policy.demo2.impl;

import policy.demo2.CashSuper;

/**
 * 正常收费子类
 * 没有任何活动的情况，正常收费，返回原价。
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

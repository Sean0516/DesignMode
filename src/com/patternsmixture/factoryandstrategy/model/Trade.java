package com.patternsmixture.factoryandstrategy.model;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public class Trade {
    private String tradeNo;
    private int amount;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeNo='" + tradeNo + '\'' +
                ", amount=" + amount +
                '}';
    }
}

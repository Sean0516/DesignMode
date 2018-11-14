package com.patternsmixture.factoryandstrategy.model;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public class Card {
    private String cardNo;
    private int stradyMoney;
    private int freeMoney;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getStradyMoney() {
        return stradyMoney;
    }

    public void setStradyMoney(int stradyMoney) {
        this.stradyMoney = stradyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo='" + cardNo + '\'' +
                ", stradyMoney=" + stradyMoney +
                ", freeMoney=" + freeMoney +
                '}';
    }
}

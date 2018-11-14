package com.patternsmixture.factoryandstrategy;

import com.patternsmixture.factoryandstrategy.model.Card;
import com.patternsmixture.factoryandstrategy.model.Trade;
import com.patternsmixture.factoryandstrategy.service.DeductionFacade;

/**
 * Created by Sean on 2018/11/14
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Card card=new Card();
        card.setCardNo("10010");
        card.setFreeMoney(1000);
        card.setStradyMoney(400);
        System.out.println("卡初始信息为：" +card.toString());
        Trade trade=new Trade();
        trade.setAmount(200);
        trade.setTradeNo("abc1200");
        System.out.println("交易信息为：" +trade.toString());
        DeductionFacade.deduct(card,trade);
        System.out.println("交易结束后卡的情况为: "+card.toString());
    }
}

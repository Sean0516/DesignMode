package com.patternsmixture.factoryandstrategy.service;

import com.patternsmixture.factoryandstrategy.model.Card;
import com.patternsmixture.factoryandstrategy.model.Trade;
import com.patternsmixture.factoryandstrategy.service.factory.StratrgyFactory;
import com.patternsmixture.factoryandstrategy.service.strategy.FreeDeduction;
import com.patternsmixture.factoryandstrategy.service.strategy.IDeduction;
import com.patternsmixture.factoryandstrategy.service.strategy.SteadyDeduction;

/**
 * Created by Sean on 2018/11/14
 *
 * @author Sean
 */
public class DeductionFacade {
    public static Card deduct(Card card, Trade trade){
        IDeduction strategy = StratrgyFactory.createStrategy(getDeductionType(trade));
        strategy.exec(card,trade);
        return card;
    }
    public static Class getDeductionType(Trade trade){
        if (trade.getTradeNo().contains("abc")){
            return FreeDeduction.class;
        }else {
            return SteadyDeduction.class;
        }
    }
}

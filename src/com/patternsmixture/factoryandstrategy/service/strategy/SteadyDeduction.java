package com.patternsmixture.factoryandstrategy.service.strategy;

import com.patternsmixture.factoryandstrategy.model.Card;
import com.patternsmixture.factoryandstrategy.model.Trade;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public class SteadyDeduction implements IDeduction {
    @Override
    public void exec(Card card, Trade trade) {
        int rint = (int) Math.rint(trade.getAmount() / 2.0);
        card.setStradyMoney(card.getStradyMoney()-rint);
        card.setFreeMoney(card.getFreeMoney()-rint);
    }
}

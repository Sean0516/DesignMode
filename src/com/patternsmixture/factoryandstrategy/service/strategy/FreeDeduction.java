package com.patternsmixture.factoryandstrategy.service.strategy;

import com.patternsmixture.factoryandstrategy.model.Card;
import com.patternsmixture.factoryandstrategy.model.Trade;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public class FreeDeduction implements IDeduction {
    @Override
    public void exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney()-trade.getAmount());
    }
}

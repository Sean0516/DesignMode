package com.patternsmixture.factoryandstrategy.service.strategy;

import com.patternsmixture.factoryandstrategy.model.Card;
import com.patternsmixture.factoryandstrategy.model.Trade;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public interface IDeduction {
     void exec(Card card, Trade trade);
}

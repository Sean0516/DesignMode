package com.patternsmixture.factoryandstrategy.service.strategy;

import com.patternsmixture.factoryandstrategy.model.Card;
import com.patternsmixture.factoryandstrategy.model.Trade;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public class DeductionContext {
    private IDeduction deduction;

    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }
    public void exec(Card card, Trade trade){
        this.deduction.exec(card,trade);
    }
}

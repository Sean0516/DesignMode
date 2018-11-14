package com.patternsmixture.factoryandstrategy.service.factory;

import com.patternsmixture.factoryandstrategy.service.strategy.IDeduction;

/**
 * Created by Sean on 2018/11/13
 *
 * @author Sean
 */
public class StratrgyFactory {
    public static <T extends IDeduction> T createStrategy(Class c) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) deduction;
    }
}

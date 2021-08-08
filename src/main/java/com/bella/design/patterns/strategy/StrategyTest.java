/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2021 All Rights Reserved.
 */
package com.bella.design.patterns.strategy;

/**
 * 策略模式Test
 *
 * @author linru.llr
 * @date 2021/08/08
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context strategyContext = new Context(new SubwayStrategy());
        String trans = strategyContext.selectTransToCompany("京杭大运河", "未来科技城");
        System.out.println(trans);

        strategyContext = new Context(new CarStrategy());
        trans = strategyContext.selectTransToCompany("老余杭", "未来科技城");
        System.out.println(trans);

        strategyContext = new Context(new BikeStrategy());
        trans = strategyContext.selectTransToCompany("未来科技城", "未来科技城");
        System.out.println(trans);
    }
}

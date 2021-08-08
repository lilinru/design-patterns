package com.bella.design.patterns.strategy;

/**
 * 上下文
 *
 * @author Bella酱
 * @date 2021/08/08
 */
public class Context {
    /**
     * 策略
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 选择去公司的交通方式
     *
     * @param home
     * @param company
     * @return
     */
    public String selectTransToCompany(String home, String company) {
        return strategy.selectTransportation(home, company);
    }
}

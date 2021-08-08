package com.bella.design.patterns.strategy;

/**
 * 策略类
 *
 * @author Bella酱
 * @date 2021/08/08
 */
public interface Strategy {
    /**
     * 选择从家去公司的交通方式
     *
     * @param home    家
     * @param company 公司
     * @return 交通方式
     */
    String selectTransportation(String home, String company);
}

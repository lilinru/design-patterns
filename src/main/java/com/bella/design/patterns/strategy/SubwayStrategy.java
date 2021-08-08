/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2021 All Rights Reserved.
 */
package com.bella.design.patterns.strategy;

import java.text.MessageFormat;

/**
 * 地铁策略
 *
 * @author linru.llr
 * @date 2021/08/08
 */
public class SubwayStrategy implements Strategy {

    /**
     * 选择从家去公司的交通方式
     *
     * @param home    家
     * @param company 公司
     * @return 交通方式
     */
    public String selectTransportation(String home, String company) {
        System.out.println(
                MessageFormat.format("家在-{0}, 公司在-{1}，建议您乘坐地铁出行！", home, company));
        return "Subway";
    }
}

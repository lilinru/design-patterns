/**
 * Alibaba.com Inc.
 * Copyright (c) 1999-2021 All Rights Reserved.
 */
package com.bella.design.patterns.strategy;

import java.text.MessageFormat;

/**
 * 自驾策略
 *
 * @author linru.llr
 * @date 2021/08/08
 */
public class CarStrategy implements Strategy {
    /**
     * 选择从家去公司的交通方式
     *
     * @param home    家
     * @param company 公司
     * @return 交通方式
     */
    public String selectTransportation(String home, String company) {
        System.out.println(
                MessageFormat.format("家在-{0}, 公司在-{1}，安全带已系好，秋名山车神准备出发啦！", home, company));
        return "Car";
    }
}

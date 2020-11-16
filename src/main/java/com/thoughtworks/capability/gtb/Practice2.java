package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

    public static LocalDate getNextWorkDate(LocalDate date) {
        switch (date.getDayOfWeek().getValue()) {
            case 5:
                return date.plusDays(3);
            case 6:
                return date.plusDays(2);
            default:
                return date.plusDays(1);
        }
    }
}

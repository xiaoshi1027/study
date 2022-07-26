package com.xiaoshi.basic.基本类型转换详解;

import org.junit.jupiter.api.Test;

/**
 * @Author xiaoshi
 * @Date 2022/7/26 21:47
 * @Version
 **/
public class _20220726 {
    /**
     * 基础数据类型：byte        default:0         size:8bits     range:-128 to 127
     */
    @Test
    public void testByte() {

        /*
            总结：超出range，会丢失精度，正数会显示-127，负数会显示127
            大小：8bit，意味着可以容纳 2^(8-1)个数
         */

        byte a = (byte) -129;   // result: 127
        Byte aa = new Byte((byte) -129);    // result: 127
        byte b = (byte) 129;    // result: -127
        Byte bb = new Byte((byte) 129);     // result: -127
        System.out.println(a);
        System.out.println(aa);
        System.out.println(b);
        System.out.println(bb);

    }

}

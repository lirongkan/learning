/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: E
 * Author:   Administrator
 * Date:     2019/3/10 11:15
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author Administrator
 * @create 2019/3/10
 * @since 1.0.0
 */
public class E {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednessday");
        dayNames.add("Thusday");
        dayNames.add("Friday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

    }

}

/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: A
 * Author:   Administrator
 * Date:     2019/3/10 14:27
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.next;

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
public class A {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        Vector v = new Vector(3, 2);
        dayNames.add("1");
        dayNames.add("2");
        dayNames.add("3");
        dayNames.add("4");
        dayNames.add("5");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }

}

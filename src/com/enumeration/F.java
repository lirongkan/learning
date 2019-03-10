/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: F
 * Author:   Administrator
 * Date:     2019/3/10 11:55
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
public class F {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> A = new Vector<>();
        A.add("1");
        A.add("2");
        A.add("3");
        A.add("4");
        A.add("5");
        days =A.elements();
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }

}

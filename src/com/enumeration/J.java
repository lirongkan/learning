/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: J
 * Author:   Administrator
 * Date:     2019/3/10 12:17
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
public class J {
    public static void main(String[] args) {
        Enumeration<String> A ;
        Vector<String> As = new Vector<>();
        As.add("1");
        As.add("2");
        As.add("3");
        As.add("4");
        As.add("5");
        A = As.elements();
        while (A.hasMoreElements()){
            System.out.println(A.nextElement());
        }
    }

}

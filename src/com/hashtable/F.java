/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: F
 * Author:   Administrator
 * Date:     2019/3/10 16:52
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

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
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;

        balance.put("Anne", 1000);
        balance.put("Bob", 2000);
        balance.put("Cathy", 300.1);
        balance.put("Doctor", 4444);

        names = balance.keys();
//      System.out.println(names.nextElement());

        while(names.hasMoreElements()){
            str = (String)names.nextElement();
            System.out.println(str + ":" + balance.get(str));
            System.out.println(str + "333333333");
        }
    }

}

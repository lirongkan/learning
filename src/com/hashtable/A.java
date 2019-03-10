/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: A
 * Author:   Administrator
 * Date:     2019/3/10 15:49
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
public class A {
    public static void main(String[] args) {
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", 3434.34);
        balance.put("Mahnaz", 123.22);
        balance.put("Ayan", 1378.00);
        balance.put("Daisy",  99.22);
        balance.put("Qadir", -19.08);

        //show all balances in hash table.
        names = balance.keys();
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }
        System.out.println();
        //Deposit 1000 into Zara'account
        bal = ((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new bbalance:" + balance.get("Zara"));
    }

}

/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: B
 * Author:   Administrator
 * Date:     2019/3/10 19:18
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.property;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author Administrator
 * @create 2019/3/10
 * @since 1.0.0
 */
public class B {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("A", "a");
        capitals.put("B", "b");
        capitals.put("C", "c");
        capitals.put("D", "d");
        capitals.put("E", "e");
        capitals.put("F", "f");

        states = capitals.keySet();
        Iterator itr = states.iterator();
        while(itr.hasNext()){
            str = (String)itr.next();
            System.out.println("The capital of " + str +"  is  :  "+ capitals.getProperty(str));
        }
       System.out.println();
        str = capitals.getProperty("F", "no f");
        System.out.println("The capital of F is " + str + ",");
    }

}

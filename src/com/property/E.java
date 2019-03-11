/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: E
 * Author:   Administrator
 * Date:     2019/3/11 8:49
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
 * @create 2019/3/11
 * @since 1.0.0
 */
public class E {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("A", "a");
        capitals.put("B", "b");
        capitals.put("C", "c");
        capitals.put("D", "d");
        capitals.put("E", "e");

        states = capitals.keySet();
        Iterator itr = states.iterator();
        while(itr.hasNext()){
            str = (String)itr.next();
            System.out.println("The capitals of " + str +"is: " + capitals.getProperty(str));
        }

    }

}

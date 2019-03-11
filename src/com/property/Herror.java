/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: H
 * Author:   Administrator
 * Date:     2019/3/11 9:30
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
public class H {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Chian", "Beijing");
        capitals.put("Japan", "Tokyo");
        capitals.put("USA", "Washimton");
        capitals.put("Keron", "Shouer");


        //使用states前未初始化变量states
        Iterator itr = states.iterator();
        states = capitals.keySet();
        while(itr.hasNext()){
            str = (String)itr.next();
            System.out.println(str + " is: " + capitals.getProperty(str));
        }
    }

}

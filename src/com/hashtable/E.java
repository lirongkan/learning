/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: E
 * Author:   Administrator
 * Date:     2019/3/10 16:48
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
public class E {
    public static void main(String[] args) {
        Hashtable a = new Hashtable();
        Enumeration b;
        String c;
        a.put("1", 111);
        a.put("2", 222);
        a.put("3", 333);
        a.put("4", 444);
        a.put("5", 555);
        b = a.keys();
        while(b.hasMoreElements()){
            c= (String)b.nextElement();
            System.out.println(c +  a.get(c));
        }
    }

}

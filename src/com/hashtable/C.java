/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: C
 * Author:   Administrator
 * Date:     2019/3/10 16:31
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
public class C {
    public static void main(String[] args) {
        Hashtable b = new Hashtable();
        Enumeration names;
        String str;

        b.put("1", 111.1);
        b.put("2", 222.2);
        b.put("3", 333.3);
        b.put("4", 444.4);
        b.put("5", 555.5);

        names = b.keys();
        while(names.hasMoreElements()){
            str = (String)names.nextElement();
            System.out.println(str + ";" +b.get(str));
        }
    }

}

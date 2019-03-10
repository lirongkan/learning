/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: B
 * Author:   Administrator
 * Date:     2019/3/10 16:20
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;

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
        Hashtable b = new Hashtable();
        Enumeration keys;
        String str;

        b.put("1", 1111);
        b.put("2", 2222);
        b.put("3", 3333);
        b.put("4", 4444);
        b.put("5", 5555);

        //show all balances in the table.
        keys = b.keys();
        while(keys.hasMoreElements()){
            str = (String)keys.nextElement();
            System.out.println(str + ":" +b.get(str));
        }
    }

}

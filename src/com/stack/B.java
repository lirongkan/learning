/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: B
 * Author:   Administrator
 * Date:     2019/3/10 15:07
 * Description: testt
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈testt〉
 *
 * @author Administrator
 * @create 2019/3/10
 * @since 1.0.0
 */
public class B {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }
    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("stack: "  + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        }catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }

}

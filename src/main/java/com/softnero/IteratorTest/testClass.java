package com.softnero.IteratorTest;

/**
 * @Author Martin Ma
 * @Date 2018/12/24
 **/
public class testClass {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList(2);
        linkList.add(5);
        linkList.add(2);
        for (int i : linkList) {
            System.out.println(i);
        }
    }

}

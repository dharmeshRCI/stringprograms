package com.dr.stringprogram;


public class StringWordsReverse {

    public static void main(String[] args)
    {
        String str = "java programming langauge";

        String[] aryOfStr = str.split(" ");

        for(String s:aryOfStr)
        {
            char[] ch = s.toCharArray();

            for(int i=ch.length-1; i>=0; i--)
            {
                System.out.print(ch[i]);
            }
            System.out.print(" ");
        }

    }
}
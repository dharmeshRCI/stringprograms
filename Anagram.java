package com.dr.stringprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    public static boolean isAnagram(String s1,String s2)
    {

        if(s1.length()!=s2.length())
            return false;

        char[] str1  = s1.toCharArray();
        char[] str2  = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0; i<str1.length; i++)
            if(str1[i]!=str2[i])
                return false;



        return true;

    }




    public static void main(String[] args)
    {
        String str1,str2;
        //  Scanner obj = new Scanner(System.in);

      //  System.out.println("Enter the String to find the Anagram  :\n\n");

        str1 = "silent";
        str2 = "listen";


        if(isAnagram(str1,str2))
            System.out.println("Given strings are anagrams");
        else
            System.out.println("Given strings are not anagrams");


    }

}
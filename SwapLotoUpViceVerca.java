package com.dr.stringprogram;
import java.util.Scanner;

public class SwapLotoUpViceVerca {

    public static void main(String[] args) {

   //     Scanner scanner = new Scanner(System.in);
        String str = "wWW.tekLeads.coM";
        char[] ch  = str.toCharArray();

        for (int i = 0; i <ch.length ; i++) {

            if(Character.isUpperCase(ch[i]))
            {
                ch[i] = Character.toLowerCase(ch[i]);
            }
            else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}
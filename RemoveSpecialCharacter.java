package com.dr.stringprogram;

public class RemoveSpecialCharacter
{
    public static void main(String args[])
    {
        String str= "$ja!va$&st%ar";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
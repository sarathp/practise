package com.practise.test.re;

import java.util.regex.Pattern;

public class PatternCompileTest {
    static Pattern USERNAME_PATTERN = Pattern.compile("[\\w@.-]+");

    public static void main(String[] args) {
        System.out.println(isValidUserName("sarath-babu.polavarapu@gmail.com"));

    }
    
    static boolean isValidUserName(String userName) {
       return  USERNAME_PATTERN.matcher(userName).matches();
    }

}

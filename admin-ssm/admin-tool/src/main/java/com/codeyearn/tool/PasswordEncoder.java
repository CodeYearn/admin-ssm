package com.codeyearn.tool;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author CaiYu
 * @Data 2019/5/9 20:41
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class PasswordEncoder {

    private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encode(String password){
        return passwordEncoder.encode(password);
    }

    public static void main(String[] args) {
        System.out.println(PasswordEncoder.encode("CaiYu"));
    }

}

package com.op;

import java.util.Optional;

/**
 * @Author YZK
 * @Date 2024/8/31
 * @Desc
 */
public class Op {
    public static void main(String[] args) {
        User user = null;

        UserInfo userInfo = null;
//        user.setInfo(userInfo);
//        userInfo.setAddress("test");
//        user.setInfo(userInfo);
//        String s = Optional.ofNullable(user)
//                .map(User::getInfo)
//                .map(UserInfo::getAddress)
//                .orElse("null-test");
        boolean present = Optional.ofNullable(user)
                .map(User::getInfo)
                .map(UserInfo::getAddress)
                .isPresent();
        System.out.println(present);
    }
}

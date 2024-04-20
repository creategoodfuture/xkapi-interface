package com.xk.xkapiinterface;

import com.xk.xkapiinterface.client.XkapiClient;
import com.xk.xkapiinterface.model.User;

public class Main1 {
    public static void main(String[] args) {
        XkapiClient xkapiClient=new XkapiClient();
        String result1=xkapiClient.getNameByGet("星空");
        String result2=xkapiClient.getNameByPost("辛苦了");
        User user=new User();
        user.setUsername("空");
        String result3=xkapiClient.getUsernameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}

package com.ljf.springboot.mybaits.demos.controller;

import com.ljf.springboot.mybaits.demos.model.UserDomain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[]) {
      List<UserDomain> udList=new ArrayList<UserDomain>();
        UserDomain ud=new UserDomain();
        ud.setUserId(123);
        ud.setUserName("liu");
        UserDomain ud2=new UserDomain();
        ud2.setUserId(1234);
        ud2.setUserName("jian");
        UserDomain ud3=new UserDomain();
        ud3.setUserId(1236);
        ud3.setUserName("f");
        udList.add(ud);
        udList.add(ud2);
        udList.add(ud3);
       List<String> nameList= udList.stream().map(UserDomain::getUserName).collect(Collectors.toList());
       for(String s:nameList){
           System.out.println("s:"+s);
       }
        System.out.println("ud:"+ud.getUserName());


    }
}


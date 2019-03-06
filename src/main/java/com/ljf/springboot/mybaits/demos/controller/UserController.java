package com.ljf.springboot.mybaits.demos.controller;

import com.ljf.springboot.mybaits.demos.model.UserDomain;
import com.ljf.springboot.mybaits.demos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    // @PostMapping("/add")
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(UserDomain user){
        System.out.println("进入controoler........"+user.getUserName());
        int flag=userService.addUser(user);
        System.out.println("controller返回状态........"+flag);
        return "添加成功！！！，返回状态:"+flag+"";

    }
    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        System.out.println("进入查询......");
        return userService.queryAllUser(pageNum,pageSize);
    }


}

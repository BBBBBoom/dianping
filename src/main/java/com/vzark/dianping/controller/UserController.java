package com.vzark.dianping.controller;

import com.vzark.dianping.common.*;
import com.vzark.dianping.model.UserModel;
import com.vzark.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author pzx
 * @date 2020/5/26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/getUserById")
    @ResponseBody
    public CommonResult getUserById(@RequestParam(name= "id") Integer id) throws BusinessException {
        UserModel user = userService.getUserById(id);
        if (user == null) {
            throw new BusinessException(CommonErrorCodeEnum.NO_OBJECT_FOUND);
        }

        return  CommonResult.create(user);
    }
}

package com.tianjian.web.propertycommunal.common;

import com.tianjian.web.entity.common.LoginUser;
import com.tianjian.web.entity.common.Result;
import com.tianjian.web.entity.exception.ForbiddenException;
import com.tianjian.web.entity.exception.NotExistedException;
import com.tianjian.web.entity.exception.ParamErrorException;
import com.tianjian.web.propertycommunal.security.utils.common.ResultEnum;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:RestfullController
 * @Description: 异常控制器
 *  * 用于测试统一异常处理
 * @author:liangxiaolei
 * @date:2019/5/24 14:47
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "/exception")
public class ExceptionController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录",produces = MediaType.APPLICATION_JSON_VALUE,
            notes = "登录异常测试统一异常处理,username请传入param,notexist,runtime,admin进行测试")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="username",value = "登录名",dataType = "String",defaultValue = "admin",required = true),
            @ApiImplicitParam(paramType = "query",name="password",value = "密码",dataType = "String",defaultValue = "123456",required = true),
    })
    public Result login(@RequestParam(value = "username",required = true) String usernmae,
                        @RequestParam(value = "password",required = true) String password){
        if(usernmae.equals("param")){
            throw new ParamErrorException("用户名错误，请输入admin");
        }
        if(usernmae.equals("notexist")){
            throw new NotExistedException("用户不存在");
        }
        if(usernmae.equals("runtime")){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(usernmae.equals("admin")&&!password.equals("123456")){
            throw new ForbiddenException("用户名或密码错误");
        }

        LoginUser user = new LoginUser(1,usernmae,password,1);

        return Result.builder()
                .code(ResultEnum.SUCCESS.getCode())
                .message("登录成功")
                .data(user)
                .build();
    }

}

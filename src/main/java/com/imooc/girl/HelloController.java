package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;
    /**
     * value可以写成集合的形式，那么可以访问集合内的任意一个皆可。
     */
//    @RequestMapping(value = {"/say", "/hi"}, method = RequestMethod.GET )
    @GetMapping(value = {"/say", "/hi"})
    /**
     * @RequestParam
     * value:指的是url中的参数
     * requires : 是否必须传入
     * defaultValue:默认值
     */
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){

        return "id:" + id;
//        return girlProperties.getCupSize();
    }
}

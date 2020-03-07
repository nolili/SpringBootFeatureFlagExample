package com.noritakakamiya.propertyendpointdemo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {
    @RequestMapping("/")
    @ResponseBody
    fun index(): String {
        return "Hello!"
    }
}

package com.noritakakamiya.propertyendpointdemo

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@ConditionalOnProperty(prefix = "com.noritakakamiya", name = ["feature-flag"], havingValue = "true")
@Controller
class FeatureFlagController {
    @RequestMapping("/new-feature")
    @ResponseBody
    fun index(): String {
        return "This is new feature!"
    }
}

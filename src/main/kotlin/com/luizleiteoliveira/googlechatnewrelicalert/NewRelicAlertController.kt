package com.luizleiteoliveira.googlechatnewrelicalert

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/alerts")
class NewRelicAlertController {

    @PostMapping
    fun alertFromNewRelic(@RequestBody newRelicAlert: NewRelicAlert) {
        println(newRelicAlert.callbackUrl)
    }
}
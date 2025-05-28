package md.utm.cloudapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun main(): String {
        return "Hello World!"
    }

    @GetMapping("/test")
    fun test(): String {
        return "This is a test endpoint!"
    }
}

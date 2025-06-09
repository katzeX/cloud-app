package md.utm.cloudapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant.now
import kotlin.math.sqrt

@RestController
class MainController {

    @GetMapping("/")
    fun main(): String {
        println("Hello world request")
        return "Hello World!"
    }

    @GetMapping("/test")
    fun test(): String {
        println("Test request")

        return "This is a test endpoint!"
    }

    @GetMapping("/test-time")
    fun testTime(): String {
        println("Test time request")

        return now().toString()
    }


    @GetMapping("/cpu-test")
    fun cpuTesting(): String {
        println("CPU request")
        val start = System.currentTimeMillis()
        while (System.currentTimeMillis() - start < 10000) {
            sqrt(Math.random())
        }
        return "done"
    }
}

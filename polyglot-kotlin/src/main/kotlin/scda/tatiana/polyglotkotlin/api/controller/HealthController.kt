package scda.tatiana.polyglotkotlin.api.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class HealthController {

    @GetMapping("/health")
     fun getHealthCheck(): ResponseEntity<*> =
        ResponseEntity("It's alive and running!", HttpStatus.OK)
}

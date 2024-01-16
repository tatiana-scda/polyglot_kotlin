package scda.tatiana.polyglotkotlin.api.controller

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import scda.tatiana.polyglotkotlin.api.request.User
import scda.tatiana.polyglotkotlin.domain.service.UserService

@RestController
@RequestMapping("/v1/user")
class UserController(val service: UserService) {

    @PostMapping(produces = [APPLICATION_JSON_VALUE], consumes = [APPLICATION_JSON_VALUE])
    fun createUser(
        @RequestBody user: User
    ): ResponseEntity<*> {
        val result = service.createUser(user)

        return ResponseEntity(result, HttpStatus.CREATED)
    }
}
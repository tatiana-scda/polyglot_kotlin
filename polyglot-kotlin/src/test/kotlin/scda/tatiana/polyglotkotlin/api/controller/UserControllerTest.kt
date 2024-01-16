package scda.tatiana.polyglotkotlin.api.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import scda.tatiana.polyglotkotlin.api.request.User

@WebMvcTest
internal class UserControllerTest(@Autowired val client: MockMvc) {

    @Test
    fun `create - when valid request is made - returns correct code`() {
        val user = User(
            name = "name",
            password = "pass",
            email = "mail@mail.com"
        )
        val userString = jsonAsString(user)

        client.perform(post("/v1/user")
            .contentType(MediaType.APPLICATION_JSON)
            .content(userString))
            .andExpect(status().isCreated)
    }
        private fun jsonAsString (user: User): String {
            try { return ObjectMapper().writeValueAsString(user) }
            catch (ex: Exception) { throw RuntimeException(ex) }
        }
}


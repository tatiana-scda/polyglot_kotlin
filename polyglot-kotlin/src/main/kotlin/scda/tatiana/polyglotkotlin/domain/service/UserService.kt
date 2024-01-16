package scda.tatiana.polyglotkotlin.domain.service

import org.springframework.stereotype.Service
import scda.tatiana.polyglotkotlin.api.request.User
import scda.tatiana.polyglotkotlin.domain.model.UserEntity
import scda.tatiana.polyglotkotlin.domain.repository.UserRepository

@Service
class UserService(var repository: UserRepository) {

    fun createUser(user: User): UserEntity {
        return repository.save(userToEntity(user))
    }

    companion object {
        fun userToEntity(user: User) = UserEntity(
            id = null,
            name = user.name,
            email = user.email,
            password = user.password
        )
    }
}
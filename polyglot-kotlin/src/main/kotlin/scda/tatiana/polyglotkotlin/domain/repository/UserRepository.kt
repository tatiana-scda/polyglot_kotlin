package scda.tatiana.polyglotkotlin.domain.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import scda.tatiana.polyglotkotlin.domain.model.UserEntity

@Repository
interface UserRepository : CrudRepository<UserEntity, Long>
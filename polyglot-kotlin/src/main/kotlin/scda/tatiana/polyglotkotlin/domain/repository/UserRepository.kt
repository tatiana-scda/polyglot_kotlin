package scda.tatiana.polyglotkotlin.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import scda.tatiana.polyglotkotlin.domain.model.UserEntity

@Repository
interface UserRepository : JpaRepository<UserEntity, Long>
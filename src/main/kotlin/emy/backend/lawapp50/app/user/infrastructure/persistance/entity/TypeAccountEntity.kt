package emy.backend.lawapp50.app.user.infrastructure.persistance.entity

import org.springframework.data.annotation.*
import org.springframework.data.relational.core.mapping.*

@Table(name = "type_accounts")
class TypeAccountEntity(
    @Id
    @Column("id")
    val id: Long? = null,
    @Column("name")
    val name: String
)
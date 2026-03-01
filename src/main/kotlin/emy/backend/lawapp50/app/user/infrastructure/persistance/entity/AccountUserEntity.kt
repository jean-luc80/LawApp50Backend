package emy.backend.lawapp50.app.user.infrastructure.persistance.entity

import emy.backend.lawapp50.app.user.domain.model.*
import org.springframework.data.annotation.*
import org.springframework.data.relational.core.mapping.*

@Table(name = "account_users")
class AccountUserEntity(
    @Id
    @Column("id")
    val id: Long? = null,
    @Column("account_id")
    val accountId: Long,
    @Column("user_id")
    val userId: Long
)

fun AccountUserEntity.toDomain() = AccountUser(
    id = this.id,
    accountId = this.accountId,
    userId = this.userId,
)
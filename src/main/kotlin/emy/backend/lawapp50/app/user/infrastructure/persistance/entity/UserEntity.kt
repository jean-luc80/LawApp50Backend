package emy.backend.lawapp50.app.user.infrastructure.persistance.entity

import com.fasterxml.jackson.annotation.*
import org.springframework.data.annotation.*
import org.springframework.data.relational.core.mapping.*
import java.time.*

@Table(name = "users")
class UserEntity(
    @Id
    @Column("id")
    val userId: Long? = null,
    @Column("city")
    var city: String? = null,
    @JsonIgnore
    @Column("password")
    var password: String? = "",
    @Column("email")
    var email: String? = null,
    @Column("pseudo")
    var pseudo: String? = null,
    @Column("is_premium")
    var isPremium: Boolean = false,
    @Column("is_certified")
    var isCertified: Boolean = false,
    @Column("is_lock")
    var isLock: Boolean = false,
    @Column("phone")
    var phone: String?=null,
    @Column("created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),
)
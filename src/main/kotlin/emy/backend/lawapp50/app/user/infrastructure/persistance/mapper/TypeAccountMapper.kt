package emy.backend.lawapp50.app.user.infrastructure.persistance.mapper

import emy.backend.lawapp50.app.user.domain.model.*
import emy.backend.lawapp50.app.user.infrastructure.persistance.entity.*

fun TypeAccountEntity.toDomain(): TypeAccount {
    val e = this
    return TypeAccount(
        typeAccountId = e.id,
        name = e.name,
    )
}

fun TypeAccount.toEntity(): TypeAccountEntity {
    val e = this
    return TypeAccountEntity(
        id = e.typeAccountId,
        name = e.name
    )
}
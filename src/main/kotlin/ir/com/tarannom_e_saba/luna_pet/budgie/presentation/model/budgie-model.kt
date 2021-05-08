package ir.com.tarannom_e_saba.luna_pet.budgie.presentation.model

import org.jetbrains.annotations.NotNull
import java.util.*

data class Chick(
    var id: UUID? = null,
    @get:NotNull
    val dateOfBirth: Date,
    @get:NotNull
    val fatherId: UUID,
    @get:NotNull
    val motherId: UUID
)

data class Adult(
    var id: UUID? = null,
    @get:NotNull
    val dateOfBirth: Date
)
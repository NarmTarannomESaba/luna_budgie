package ir.com.tarannom_e_saba.luna_pet.budgie.persistence.repository

import ir.com.tarannom_e_saba.luna_pet.budgie.persistence.entity.Budgie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BudgieRepository: JpaRepository<Budgie, UUID> {
}
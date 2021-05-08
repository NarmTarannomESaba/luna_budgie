package ir.com.tarannom_e_saba.luna_pet.budgie.business

import ir.com.tarannom_e_saba.luna_pet.budgie.persistence.entity.Budgie
import ir.com.tarannom_e_saba.luna_pet.budgie.persistence.repository.BudgieRepository
import ir.com.tarannom_e_saba.luna_pet.budgie.presentation.model.Adult
import ir.com.tarannom_e_saba.luna_pet.budgie.presentation.model.Chick
import org.springframework.stereotype.Service

@Service
class BudgieService(
    val budgieRepository: BudgieRepository
) {
    fun addNewBorn(chick: Chick): Chick {
        val budgie = Budgie(
            chick.dateOfBirth,
            budgieRepository.findById(chick.fatherId).get(),
            budgieRepository.findById(chick.motherId).get()
        )
        budgieRepository.saveAndFlush(budgie).also { chick.id = it.id!! }
        return chick
    }

    fun addAdult(adult: Adult): Adult {
        val budgie = Budgie(
            adult.dateOfBirth
        )
        budgieRepository.saveAndFlush(budgie).also { adult.id = it.id!! }
        return adult
    }

    fun getAdults(): List<Adult> {
        return budgieRepository.findAll().map { budgie -> Adult(budgie.id, budgie.dateOfBirth) };
    }
}
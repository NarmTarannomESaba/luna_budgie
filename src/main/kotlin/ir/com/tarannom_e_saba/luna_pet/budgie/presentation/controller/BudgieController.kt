package ir.com.tarannom_e_saba.luna_pet.budgie.presentation.controller

import ir.com.tarannom_e_saba.luna_pet.budgie.business.BudgieService
import ir.com.tarannom_e_saba.luna_pet.budgie.presentation.model.Adult
import ir.com.tarannom_e_saba.luna_pet.budgie.presentation.model.Chick
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/budgie", produces = ["application/json"])
@CrossOrigin
class BudgieController(
    val budgieService: BudgieService
) {
    @PostMapping("/chick")
    fun addNewBorn(
        @Validated
        @RequestBody
        chick: Chick
    ): Chick {
        return budgieService.addNewBorn(chick)
    }

    @PostMapping
    fun addAdult(
        @Validated
        @RequestBody
        adult: Adult
    ): Adult {
        return budgieService.addAdult(adult)
    }

    @GetMapping
    fun getAdults(
    ): List<Adult> {
        return budgieService.getAdults()
    }
}
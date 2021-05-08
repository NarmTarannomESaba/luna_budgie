package ir.com.tarannom_e_saba.luna_pet.budgie.persistence.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
data class Budgie(
    @Temporal(value = TemporalType.DATE)
    @Column(nullable = false)
    val dateOfBirth: Date,
    @ManyToOne
    val father: Budgie? = null,
    @ManyToOne
    val mother: Budgie? = null
) {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    val id: UUID? = null
}

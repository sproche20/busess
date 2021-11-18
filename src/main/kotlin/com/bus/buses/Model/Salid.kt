package com.bus.buses.Model
import javax.persistence.*

@Entity
@Table(name = "Salid")
class Salid {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var horasal: String? = null

}
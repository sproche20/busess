package com.bus.buses.Model
import javax.persistence.*
@Entity
@Table(name = "Buses")
class Buses {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var marca: String? = null

}
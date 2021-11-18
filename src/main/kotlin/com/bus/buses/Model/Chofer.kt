package com.bus.buses.Model

import javax.persistence.*

@Entity
@Table(name = "Chofer")
class Chofer{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var chofer: String? = null

}
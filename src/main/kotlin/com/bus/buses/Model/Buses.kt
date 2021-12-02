package com.bus.buses.Model
import javax.persistence.*
@Entity
@Table(name = "Buses")
class Buses {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var pasageros:Long?=null
    var marcas: String? = null
    var placas: String?= null



}
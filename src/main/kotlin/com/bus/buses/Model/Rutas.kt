package com.bus.buses.Model
import javax.persistence.*

@Entity
@Table(name = "Rutas")
class Rutas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var ruta: String? = null
    var tiempo: String? =null

}
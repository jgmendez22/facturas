package com.example.demo.model


import javax.persistence.*

@Entity
@Table(name="product")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var code:String? = null
    var create:String? = null
    var total:Number? = null
}
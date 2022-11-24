package com.example.demo.model
import javax.persistence.*
import javax.persistence.Table
import javax.validation.constraints.NotBlank

@Entity
@Table(name="client")
class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @NotBlank(message="Campo obligatorio") //validate
    var nui: String? = null
    @NotBlank(message="Campo obligatorio")  //validate
    var fullname: String? = null
    var address: String? = null
}
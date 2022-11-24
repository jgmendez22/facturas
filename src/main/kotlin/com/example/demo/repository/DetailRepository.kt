package com.example.demo.repository

import com.example.demo.model.Invoice
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DetailRepository:JpaRepository<Invoice, Long> {

    fun findById(id: Long?): Invoice?
}
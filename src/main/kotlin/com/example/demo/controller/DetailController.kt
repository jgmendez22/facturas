package com.example.demo.controller

import com.example.demo.model.Detail
import com.example.demo.service.DetailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping( "/detail")
class DetailController {
    @Autowired
    lateinit var detailService: DetailService

    @GetMapping
    fun list():List<Detail>{
        return detailService.list()
    }

    @PostMapping
    fun save(@RequestBody detail: Detail): Detail {
        return detailService.save(detail)
    }

    @PutMapping
    fun update (@RequestBody detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.update(detail), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.updateName(detail), HttpStatus.OK)
    }
}
package com.example.demoapp.demorestapi.controller

import com.example.demoapp.demorestapi.model.Bank
import com.example.demoapp.demorestapi.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BankController(private val service: BankService) {

    @GetMapping("/banks")
    fun getAllBanks(): Collection<Bank> = service.getBanks()
}
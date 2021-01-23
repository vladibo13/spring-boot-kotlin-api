package com.example.demoapp.demorestapi.service

import com.example.demoapp.demorestapi.datasource.BankDataSource
import com.example.demoapp.demorestapi.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.getBanks()
}
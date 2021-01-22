package com.example.demoapp.demorestapi.datasource

import com.example.demoapp.demorestapi.model.Bank

interface BankDataSource {
    fun getBanks(): Collection<Bank>
}
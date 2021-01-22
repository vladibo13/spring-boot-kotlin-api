package com.example.demoapp.demorestapi.datasource.mock

import com.example.demoapp.demorestapi.datasource.BankDataSource
import com.example.demoapp.demorestapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("1234", 1.0, 1),
        Bank("1233", 3.0, 2),
        Bank("1134", 2.0, 3)

    )

    override fun getBanks(): Collection<Bank> = banks
}
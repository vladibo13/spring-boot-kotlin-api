package com.example.demoapp.demorestapi.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        //given

        //when
        val banks = mockDataSource.getBanks()

        //then
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        //given

        //when
        val banks = mockDataSource.getBanks()

        //then
        Assertions.assertThat(banks).allMatch{it.accountNumber.isNotBlank()}
        Assertions.assertThat(banks).anyMatch{it.trust != 0.0}
        Assertions.assertThat(banks).allMatch{it.transactionFee != 0}
    }
}
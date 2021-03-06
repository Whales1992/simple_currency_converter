package com.android.pay_baymax.repository

import com.android.pay_baymax.room.AppDatabase
import com.android.pay_baymax.room.entities.RateEntity

class RoomRepository(private val appDatabase: AppDatabase){
    fun loadRateList(): List<RateEntity> = appDatabase.rateDao().getAllRates()
    fun updateAllRate(saveList: List<RateEntity>) = appDatabase.rateDao().updateAllRates(saveList)
}
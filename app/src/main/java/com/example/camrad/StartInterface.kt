package com.example.camrad

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface StartInterface {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStart(run: Start )


    @Delete
    suspend fun delStart(run: Start)




    @Query("SELECT * FROM RUN_TABLE ORDER BY timestamp DESC")
    fun getAllRuns(): LiveData<List<Start>>

    @Query("SELECT * FROM RUN_TABLE ORDER BY timeInMillis DESC")
    fun RunsMlSEC(): LiveData<List<Start>>

    @Query("SELECT * FROM RUN_TABLE ORDER BY caloriesBurned DESC")
    fun CALLORIES(): LiveData<List<Start>>

    @Query("SELECT * FROM RUN_TABLE ORDER BY avgSpeedInKMH DESC")
    fun avgSpeed(): LiveData<List<Start>>

    @Query("SELECT * FROM RUN_TABLE ORDER BY distanceInMeters DESC")
    fun RunsDistance(): LiveData<List<Start>>


//ВСЕГО TOTAL
    @Query("SELECT SUM(timeInMillis) FROM run_table ")
    fun getTotalTimeMS():LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM run_table ")
    fun getTotalCall():LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) FROM run_table ")
    fun getTotalDistance():LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM run_table ")
    fun getTotalSpeed():LiveData<Float>


}
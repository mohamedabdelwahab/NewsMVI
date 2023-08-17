package com.mohamed.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mohamed.data.entity.SearchKey

@Dao
interface SearchKeyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRemoteKey(remoteKey: SearchKey)

    @Query("SELECT * FROM search_keys WHERE searchQuery = :searchQuery")
    suspend fun getRemoteKey(searchQuery: String): SearchKey
}
package com.count.data

data class Count(
    val id: Long = System.currentTimeMillis(), // Unique for now
    val name: String,
    val count: Int = 0,
    val target: Int? = null,
    val period: CountPeriod = CountPeriod.NEVER,
    val createdAt: Long = System.currentTimeMillis()
)

enum class CountPeriod{
    DAY, WEEK, MONTH, YEAR, NEVER
}
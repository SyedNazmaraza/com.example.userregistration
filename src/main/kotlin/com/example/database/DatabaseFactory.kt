package com.example.database

import com.example.entity.UsersTable
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory{
    fun init(){
        var db = Database.connect(hikari())
        transaction {
            SchemaUtils.create(UsersTable)
        }
    }
    private fun hikari(): HikariDataSource {

        val config = HikariConfig()
        config.driverClassName = "org.postgresql.Driver"
        config.jdbcUrl = "jdbc:postgresql:myapp"
        config.username = "postgres"
        config.password = "root"
        config.maximumPoolSize = 3
        config.isAutoCommit =  false
        config.transactionIsolation= "TRANSACTION_REPEATABLE_READ"
        config.validate()

        return HikariDataSource(config)
    }
    suspend fun <T> dbQuery(): T = 

}
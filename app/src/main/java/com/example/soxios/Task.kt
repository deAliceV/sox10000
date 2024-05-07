package com.example.soxios

sealed class Task {
    object Ventas : Task()
    object Compras : Task()

}
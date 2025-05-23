package com.trivaris.datatypes

interface Collection<T> {
    fun pop(): T?
    fun push(vararg items: T)
    fun peek(): T?
}
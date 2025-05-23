package com.trivaris.datatypes

class Stack<T>: LinkedList<T>(), Collection<T> {
    override fun pop(): T? {
        val node = head?.item
        head = head?.next
        return node
    }

    override fun push(vararg items: T) {
        var newHead = head
        for (item in items)
            newHead = Node(item, newHead)
        head = newHead
    }

    override fun peek(): T? =
        head?.item
}
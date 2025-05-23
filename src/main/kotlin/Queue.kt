package com.trivaris.datatypes

class Queue<T>: DoublyLinkedList<T>(), Collection<T> {
    override fun pop(): T? {
        val node = head
        if (head == tail) {
            head = null
            tail = null
            return node?.item
        }
        head = head?.next
        return node?.item
    }

    override fun push(vararg items: T) {
        for (item in items) {
            val node = DoublyNode(item, tail)

            if (head == null) {
                head = node
                tail = node
            } else {
                tail?.next = node
                node.prev = tail
                tail = node
            }
        }
    }

    override fun peek(): T? =
        head?.item
}
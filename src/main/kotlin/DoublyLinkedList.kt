package com.trivaris.datatypes

open class DoublyLinkedList<T>: LinkedList<T>() {
    internal var tail: DoublyNode<T>? = null

    override fun add(item: T): DoublyLinkedList<T> {
       val node = DoublyNode(
           item,
           null,
           tail
       )
        tail = node
        return this
    }

    internal class DoublyNode<T>(
        item: T?,
        next: Node<T>? = null,
        var prev: DoublyNode<T>? = null
    ) : Node<T>(item, next)
}
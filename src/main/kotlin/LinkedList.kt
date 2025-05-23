package com.trivaris.datatypes

open class LinkedList<T> {
    internal var head: Node<T>? = null

    open fun add(item: T): LinkedList<T> {
        val node = Node(
            item = item,
            next = head
        )
        head = node
        return this
    }

    fun remove(item: T): LinkedList<T> {
        if (head == null) return this
        val node = findNodeBefore(item, Node(null, head)) ?: return this
        val next = node.next?.next
        node.next = next
        return this
    }

    operator fun get(item: T): T? =
        findNodeBefore(item, Node(null, head))?.next?.item

    internal fun findNodeBefore(item: T, node: Node<T>): Node<T>? =
        when {
            (node.next == null) -> null
            (node.next!!.item == item) -> node
            else -> findNodeBefore(item, node.next!!)
        }

    internal open class Node<T>(
        val item: T?,
        var next: Node<T>? = null
    )
}
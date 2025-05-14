class Stack<T>: Collection<T> {
    private var head: StackItem<T>? = null

    override fun pop(): T? {
        val node = head?.item
        head = head?.next
        return node
    }

    override fun push(vararg items: T) {
        var newHead = head
        for (item in items)
            newHead = StackItem(item, newHead)
        head = newHead
    }

    override fun peek(): T? =
        head?.item

    private data class StackItem<T> (
        var item: T,
        var next: StackItem<T>? = null
    )
}
class Queue<T>: Collection<T> {
    private var tail: QueueNode<T>? = null
    private var head: QueueNode<T>? = null

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
            val node = QueueNode(item, tail)

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

    private data class QueueNode<T> (
        var item: T,
        var prev: QueueNode<T>? = null,
        var next: QueueNode<T>? = null
    )
}
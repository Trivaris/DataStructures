package com.trivaris.datatypes

import org.junit.jupiter.api.Test

class QueueTest {

    @Test
    fun testQueue() {
        val queue: Collection<Int> = Queue()

        // Test push
        queue.push(1, 2, 3)
        assert(queue.peek() == 1)

        // Test pop
        assert(queue.pop() == 1)
        assert(queue.pop() == 2)
        assert(queue.pop() == 3)
        assert(queue.pop() == null) // Empty

        // Test reusability
        queue.push(99)
        assert(queue.peek() == 99)
        assert(queue.pop() == 99)
    }
}
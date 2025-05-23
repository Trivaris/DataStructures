package com.trivaris.datatypes

import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun testStack() {
        val stack: Collection<Int> = Stack()

        // Test push
        stack.push(1, 2, 3)
        assert(stack.peek() == 3)

        // Test pop
        assert(stack.pop() == 3)
        assert(stack.pop() == 2)
        assert(stack.pop() == 1)
        assert(stack.pop() == null) // Empty

        // Test reusability
        stack.push(42)
        assert(stack.peek() == 42)
        assert(stack.pop() == 42)
    }
}
fun main() {
    queue()
    stack()
}

fun stack() {
    // Last In, first Out
    println("Stack")

    val stack = Stack<String>()
    stack.push("World")
    stack.push("Hello")
    println(stack.pop())
    println(stack.pop())
    println()
}

fun queue() {
    // First In, first Out
    println("Queue")

    val q = Queue<String>()
    q.push("Hello", "Hallo", "SDFadf")
    q.push("World")
    println(q.pop())
    println(q.peek())
    println(q.pop())
    println()
}
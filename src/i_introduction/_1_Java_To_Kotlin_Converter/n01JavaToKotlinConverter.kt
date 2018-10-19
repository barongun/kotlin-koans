package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): String {
    var sb = StringBuilder()
    sb.append("{")
    val iterator: Iterator<Int> = collection.iterator()
    while (iterator.hasNext()) {
        var element: Int = iterator.next()
        sb.append(element)
        if (iterator.hasNext()) {
            sb.append(", ")
        }
    }
    sb.append("}")
    return sb.toString()
}

fun task1(collection: Collection<Int>): String {
    return todoTask1(collection)
}
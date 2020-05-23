fun main(args: Array<String>) {
    torT()
}

inline fun torT(){
    val list = readLine()!!.split(" ").map(String::toInt)
    val max = if (list[0] * list[1] < list[2]) list[0] * list[1] else list[2]
    println(max)
}

fun main(args: Array<String>) {
    rollerCoaster()
}

inline fun rollerCoaster(){
    val list = readLine()!!.split(" ").map(String::toInt)
    val n = list[0]
    val limit = list[1]
    val member = readLine()!!.split(" ").map(String::toInt).sorted()

    if(member[0] >= limit){
        println(n)
    } else if(member[member.size-1] < limit){
        println(0)
    } else {
        var start: Int = 0
        var end: Int = member.size
        var center: Int = (start + end) / 2
        do {
            if(member[center] >= limit){
                if(member[center-1] < limit)
                    break
                end = center
                center = (start + end)/ 2
            }else{
                start = center
                center = (start + end) / 2
            }
        } while(!(member[center] >= limit && member[center-1] < limit))
        if (member.size == center+1){
            println(1)
        } else{
            println(member.size-center)
        }
    }
}

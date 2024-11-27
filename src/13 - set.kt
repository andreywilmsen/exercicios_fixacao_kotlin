fun setFunc(){

    var listSet = mutableSetOf<Int>(1,2,3,5)

    listSet.add(5)
    listSet.add(5)

    println(listSet.sorted())

    listSet.remove(2)
    println(listSet)

    println(listSet.contains(1))

}
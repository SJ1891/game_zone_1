package ListOperations

object ListMain {


  def main(args: Array[String]) {
    val list1: List[Int] = List(1, 2, 3, 4)
    println(ListFunctions.prettyPrintList(list1))
    val list2: List[String] = List("a", "b")
    ListFunctions.prettyPrintList(list2)
    println("Filter even")
    println(ListFunctions.multiplyByTenEven(list1))
    println("multiplyByTen")
    println(ListFunctions.multiplyByTen(list1))
    println("multiplyByHundred")
    println(ListFunctions.multiplyByHunderdOdd(list1))
    val list3: List[String] = List("abc","123","fc", "abc")
    ListFunctions.count(list3)
    println(ListFunctions.sum(list1))
  }
}



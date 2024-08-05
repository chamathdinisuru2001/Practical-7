object SquareCalculate{
    def squareCalculate(numbers: List[Int]):List[Int] ={
        numbers.map(number => number * number)
    }

    def main(args : Array[String]): Unit ={
        val numbers = List(1,2,3,4,5)

        val squares = squareCalculate(numbers)
        println(s"$squares")
    }
}
fun main() {
    println("Enter a number: ")
   val num1:Int=Integer.valueOf(readLine())
    val result=if(num1%2==0)
    {
        print("even no")
    }else
    {
        print("odd no")
    }
    println(result)
}
fun main() {
    print("Enter no: ")
    val num:Int=Integer.valueOf(readLine())
    val r=if(num>0)
    {
        println("positive")
    }
    else if(num<0)
    {
      println("negative")
    }
    else
    {
       println("zero")
    }
    println(r)
}


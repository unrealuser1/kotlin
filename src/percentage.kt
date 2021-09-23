fun main() {
    print("Enter your marks: ")
    val marks:Int = Integer.valueOf(readLine())

    val res = if(marks>=75 && marks<100)
    {
        println("Distinction")
    }
    else if(marks>=60 && marks<75){
        println("First class")
    }
    else if(marks>=40 && marks<60){
        println("Pass class")
    }
    else{
        println("Fail")
    }

    println(res)
}
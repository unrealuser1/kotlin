fun main() {

    println("Enter number 1: ")
    val num1:Int = Integer.valueOf(readLine())
    println("Enter number 2: ")
    val num2 = Integer.valueOf(readLine())
    val r=if(num1>num2)
    {
        print("num1 greater than num2");
    }
    else
    {
        print("num1 is less than num2");
    }
    print(r)
}
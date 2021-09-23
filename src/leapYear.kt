fun main() {
    println("Enter a year: ")
    val year:Int = Integer.valueOf(readLine())
    val leapYearCheck = if(year%4==0){println("Leap year.")}else{println("Not a leap year.")}

    print(leapYearCheck)

}
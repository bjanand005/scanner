import java.util.Scanner
fun main()
{
  var input=Scanner(System.`in`)
  println("enter a number")
  if (input.hasNextInt()) {
        val integer = input.nextInt()
        println("You entered: $integer")
    }
  
}

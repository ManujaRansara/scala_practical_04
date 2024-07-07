object Patternmatching{

     def input():Int = {
     println("Enter the integer:")
     var num = scala.io.StdIn.readInt()
     num 
    }

     def compare():Any = {
        var num = input()
        if(num <= 0){
            println("Negative/Zero")
        }else if(num % 2 == 0){
            println("Even number")
        }else{
            println("odd")
        }        
     }

     def main(args:Array[String]):Unit = {
         compare()
     }
     
}
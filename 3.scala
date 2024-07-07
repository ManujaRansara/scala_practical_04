object format{
     def toUpper(name:String):String = {
           name.toUpperCase()
     }
     def toLower(name:String):String = {
           name.toLowerCase()
     }
     def formatNames(name:String)(formatFunction:String => String):String = {
           formatFunction(name)
     }

     def main(args:Array[String]):Unit = {
         val names = List("Benny","Niroshan","Saman","Kumara")
          println(toUpper(names(0))) 
          println(formatNames(names(1))(name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)) 
          println(toLower(names(2))) 
          println(formatNames(names(3))(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase)) 
     }
}
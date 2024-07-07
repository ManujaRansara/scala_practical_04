object inventory{

     val inventory=Array("camera","computer","mouse","keyboard","monitor","headphone","ups")
     var quantity=Array(10,20,50,4,5,78,65)

     def print(i:Int):Any = {
          if(i<0){
             
          }else{
               println("inventory:"+inventory(i)+"  quantity:"+quantity(i))
               print(i-1)
          }
     }

     def find(good:String,i:Int):Int = {
              if (i < 0) {
               -1 
               } else if (inventory(i) == good) {
               i 
               } else {
               find(good, i - 1) 
               }
     }

     def restockItem(good:String,newitems:Int):Any= {
         var num : Int= find(good,6)
         if (num == -1){
            println("\ninvalid inventory\n")
         }else{
              quantity(num)+=newitems
              println("\nItem restock successfull\n")
         }
       
     }

     def sellItem(good:String,newitems:Int):Any= {
          var num : Int= find(good,6)
             if (num == -1){
             println("\ninvalid inventory\n")
         }else{
              quantity(num)-=newitems
              println("\nItem sell successfull\n")
         }
       
     }

     def main(args:Array[String]):Unit= {
            print(6)
            restockItem("mouse",5)
            sellItem("headphone",8)
            print(6)
            restockItem("touchpad",9)
            sellItem("touchpad",15)

     }
}
//Tempat pemula
fun main() {
    println("Hello, Android ATC") //print dan enter new line
    //print - print biasa
        
    //creating constant variable // Pemalar
    val x = 1
    val y = 3
    
    //println(x) //1
    val z = x+y
    println(z) //4
    
    //Implicit declaration, Explicit declaration
    //Tidak perlu specify dta type (imply - agak)
    //Explicit - kita akan specify
    
    
    //Constant vs variable
    //Pemalar vs Pemboleh ubah
    //Constant (val) -> Once dah declare it, cannot change the value anymore
    val name = "Sahyro"
    //name = "Sahyro Safuan"
    //println(name)
    
    var fullName = "Sahyro"
    //println(fullName)
    fullName = "Sahyro Safuan"
    //println(fullName)
    
    // Data type | Jenis Data
    //String -> Perkataan, ayat | ""
    //Char -> Karakter huruf | ''
    //Boleh specify data type yg digunakan
    
    // : (of type)
    
    //Ayat pakai String
    val address:String = "Shah Alam"
    //println(address)
    
    //Huruf pakai Char
    val jantina:Char = 'L'
    //println(jantina)
    
    //Operasi
    // +
    val message = "My name is " +name
    //println(message)
    
    //String interpolation
    //$ -> akan cari variable yang ditetapkan name
    val anotherMessage = "My name is $name and I live is $address"
    //println(anotherMessage)
    
    //Bermula dengan huruf kecil, untuk perkataan seterusnya besarkan
    //anotherMessage
    
    // Number
    // Kalau declare Double, kene specify . walaupun 0
    // Double + Int boleh, tapi hasil akan jadi Double
    // In case saya nak hasil Int, round ..
    
    var num1:Double = 9.5
    var num2:Int = 5
    
     //operasi + , - , * , / , %
    
    var sum = num1 + num2
    //println(sum)
    
    var minus = num1 - num2
    //println(minus)
    
    var product = num1 * num2
    //println(product)
    
    var division = num1 / num2 // Integer Division / Intiger divide by Integer = Integer = 9/5 = 1
    //salah satu kena double untuk dapatkan double division
    println(division)
    
    //%ganjil genap , num 5 % 2 == 0 (genap) | num % 2 == 1 (ganjil)
    var modulo = num1 % num2 // baki operasi bahagi 9/5 bakinya adalah 1 | 9/5, bakinya 4
    println(modulo)
    
    //Boolean (true or false)
    //Boleean data type is normally use for logic, ex when using if else statement
    var eaten = true;
    var tired:Boolean = false
    
    //Boolean operation : && (AND), || (OR), ! (Reverse)
    println(eaten && tired) //both kena true baru result true
    println(eaten || tired) //any true result true
    println(!eaten)//reverse, kalau true result false, kalau false result true
    
    //Nullable ?
    //null (tiada value)
    
    var profession = null //(tiada value) / Bayangkan dalam form tak wajib isi
    					  //& nak retrieve value
    					  //To declare a variable as nullable the data type needs
    					  //add '?'
    
    var newProfession:String? = null //question means it can be null or it can be a value
    println(newProfession)
    println(profession)
    newProfession = "Student"
    println(newProfession)
    
    var tinggi = 170
    var berat = 70
    var bmi = berat/((tinggi/100)*(tinggi/100)) //Int
    println(bmi)
    
    //Array
    //Is a data type to store a collection of repeated item
    //I create a variable to store a collection of scores
    //Index of an array start from 0
    
    var scores = arrayOf(70,90,100,80,85,60)
    println(scores[0]) //to retrieve the first item in the array (array start with 0)
    println(scores[1])
    println(scores.size) //How many item in the array (length)
    
 //Function is a group expression that an be reusable in our code
    sayHello()
    sayGoodbye("Sahyro")
    calculateBMI(170.0,60.0)
  	println(calculateBMI(180.0,90.0))
    println(sum(3,4))
}

fun sum(a:Int, b:Int): Int{
    return a+b
}

//Funtion with return and argument
fun calculateBMI(height:Double, weight:Double): Double{
    return weight/((height/100)*(height/100))
}

fun sayHello(){
        println("Hello World") //Declaring a fucntion name sayHello, this function
        					   //will just print "Hello World"
    }
//Funtion with argument/parameter
fun sayGoodbye(name:String){
    println("Goodbye $name")
}

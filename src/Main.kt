@file:JvmName("Main")
import java.util.TreeMap

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args:Array<String>) {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!");

//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
    val elephant : Animal? = Animal();

    elephant?.diet = "Herbivore";
    println("The diet is ${elephant?.diet}")
    var indianElephant : Elephant? = Elephant();
    indianElephant?.nativity = "Mudhumalai";
    println(indianElephant?.nativity);
    var num1 : Int = 10;
    var num2 : Double = 12.5;
    var num3 = num1+num2;
    println(num3)
    var result : Double=
    if(num2<num1)
        num2;
    else
        num1.toDouble();
    println(result)
    var s1 : String = "hello";
    var s2 : String = "Hello";
    if(s1.equals(s2,true))
        println("equal")
    else
        println("not equal");
    indianElephant = Elephant();
    println(indianElephant.nativity?.length)
    indianElephant = null;
    println(indianElephant?.nativity);
    var num : String =
        when(num1){
            10->"It's ten"
            20->"It's twenty"
            else->"It's not among both"
        }

    println(num)
    for(a in 50.downTo( 39) step 3)
        println(a)
    for(b in 14..<17)
        println(b)
    var arr : IntProgression = 10..70 step 5;
    for(a in arr.reversed())
        println(a)
    var chararr : CharProgression = 'A'..'z';
    for(c in chararr.reversed())
        print("$c,")
    println()
    var list = listOf(1,3,4,5)
    for((i,e) in list.withIndex().reversed())
        println("$i:$e")
    var map:TreeMap<String,Int> = TreeMap<String,Int>()
    map["Mr.X"]=21
    map["Mr.Y"]=24
    for((name,age) in map)
        println("$name:$age")
    var ans=add(10,20);
    println(ans)
    var oans=onelineAdd(10,22);
    println(oans)
    println(onelineMax(10,11))
    var amt=billAfterGST(interest = 50.0, a = 490)
    println("The bill : $amt")


}
@JvmOverloads
fun billAfterGST(a:Int,interest:Double=5.0):Int{
    return (a+a*interest/100).toInt()
}
fun add(a:Int,b:Int): Int {
    return a+b;
}
fun onelineAdd(a:Int,b:Int):Int = a+b;

fun onelineMax(a:Int,b:Int):Int = if(a>b) a else b
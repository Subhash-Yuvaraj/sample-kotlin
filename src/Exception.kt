import java.lang.NumberFormatException

fun main(){
    var num:Int;
    try{
        num="7b".toInt();
    }
    catch (e:NumberFormatException){
        num=-1;
    }
    println(num)
    //assign direct
    var num2 : Int =
        try{
            "79".toInt()
        }
        catch (e:NumberFormatException){
            -1;
        }
    println(num2)
}
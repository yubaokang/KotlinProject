package demo23.yubaokang.com.kotlindemo.test

/**
 * Created by yubao on 2017/5/20.
 */
class Test {
    fun sum(a: Int, b: Int) = a + b;

    fun sum1(a: Int, b: Int): Int {
        return a + b
    }


    fun sum2(a: Int, b: Int) {
        println("sum $a and $b is ${a + b}")
    }

    fun sum3(a: Int, b: Int): Unit {
        println("sum $a and $b is ${a + b}")
    }

    fun sum4() {
        val a: Int = 1
        val b = "bbbbb"
        val c: Double
        c = 1.2222222
        var x = 5
        x += 1
    }

    fun maxOf(a:Int,b:Int,c:Int,d:Int):Int{
        var max:Int=a
        if (a<b){
            max=b
        }
        if (max<c){
            max=c
        }
        if (max<d){
            max=d
        }
        return max
    }

   fun paserInt(str:String){
       var a:Int=Integer.parseInt(str)
       print(a)
   }

}
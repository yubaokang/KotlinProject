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

    fun maxOf(a: Int, b: Int, c: Int, d: Int): Int {
        var max: Int = a
        if (a < b) {
            max = b
        }
        if (max < c) {
            max = c
        }
        if (max < d) {
            max = d
        }
        return max
    }

    fun paserInt(str: String) {
        val a: Int = Integer.parseInt(str)
        print(a)
    }

    fun for1() {
        val items = listOf("aa", "bb", "cc");
        for (item in items) {
            println(item)
        }
    }

    fun while1() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7);
        var index = 0;
        while (index < 7) {
            println(items[index])
            index++
        }
    }

    fun describe(obj: Any): String = when (obj) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "UnKnow"
    }


}
package demo23.yubaokang.com.kotlindemo

/**
 * Created by ybk on 2017/6/19.
 */
class HaHa {
    var name: String? = null
    var age: Int = 0

    init {
        name = "yubaokang"
        age = 26
    }

    constructor(name: String) : this(name, 0)

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    val aa: String
        get() = "哈哈哈哈"
}

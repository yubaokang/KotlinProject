package demo23.yubaokang.com.kotlindemo

/**
 * Created by ybk on 2017/6/19.
 */
class KTest() : KClass(), KClass2 {
    override fun kk(name: String) {
        super<KClass>.kk(name)
    }

    override fun aa(age: Int) {
        super<KClass2>.aa(age)
    }
}
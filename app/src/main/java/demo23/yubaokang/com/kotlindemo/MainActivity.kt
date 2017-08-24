package demo23.yubaokang.com.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        button1.text = "1111"
    }

    fun click(view: View) {
        when (view.id) {
            R.id.button1 -> {
                Toast.makeText(this, "111", Toast.LENGTH_LONG).show()
            }

            R.id.button2 -> Toast.makeText(this, "222", Toast.LENGTH_LONG).show()
            R.id.button3 -> Toast.makeText(this, "333", Toast.LENGTH_LONG).show()
        }
    }

    fun test() {
        var haha = HaHa("aaaaa", 1)
        haha.name
        haha.aa
        println("------->>>" + haha.aa)
    }
}

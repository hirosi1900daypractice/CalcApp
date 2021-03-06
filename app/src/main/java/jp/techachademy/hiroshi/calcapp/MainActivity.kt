package jp.techachademy.hiroshi.calcapp


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Float.parseFloat


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            this.plus()
        }
        button2.setOnClickListener{
            this.minus()
        }
        button3.setOnClickListener{
            this.times()
        }
        button4.setOnClickListener{
            this.divided()
        }
    }
    private fun plus(){
        val a1 = editText1.text.toString()
        val a2 = editText2.text.toString()

        if(a1 != "" && a2 != "") {
        var num1 = a1.toDouble()
        var num2 = a2.toDouble()

        var sum = num1 + num2

            val intent = Intent(this, second::class.java)
            intent.putExtra("RESULT", sum)

            startActivity(intent)

        }else{
            return
        }
    }
    private fun minus() {
        val a1 = editText1.text.toString()
        val a2 = editText2.text.toString()

        if(a1 != "" && a2 != "") {
            var num1 = a1.toDouble()
            var num2 = a2.toDouble()
            var sum = num1 - num2

            val intent = Intent(this, second::class.java)
            intent.putExtra("RESULT", sum)

            startActivity(intent)

        } else {
            return
        }
    }
    private fun times(){
        val a1 = editText1.text.toString()
        val a2 = editText2.text.toString()

        if(a1 != "" && a2 != "") {
            var num1 = a1.toDouble()
            var num2 = a2.toDouble()
            var sum = num1 * num2
            val intent = Intent(this, second::class.java)
            intent.putExtra("RESULT", sum)
            startActivity(intent)
            Log.d("test","test")
        }else{
            return
        }
    }
    private fun divided(){
        val a1 = editText1.text.toString()
        val a2 = editText2.text.toString()

        if(a1 != "" && a2 != "" && a2 != "0") {
            var num1 = a1.toDouble()
            var num2 = a2.toDouble()
            var sum = num1 / num2

            val intent = Intent(this, second::class.java)
            intent.putExtra("RESULT", sum)

            startActivity(intent)

        }else{
            return
        }
    }

}






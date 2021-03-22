package jp.techachademy.hiroshi.calcapp


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



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
        var num1 = Integer.parseInt(a1)
        var num2 = Integer.parseInt(a2)

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
        var num1 = Integer.parseInt(a1)
        var num2 = Integer.parseInt(a2)
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
        var num1 = Integer.parseInt(a1)
        var num2 = Integer.parseInt(a2)
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

        if(a1 != "" && a2 != "") {
        var num1 = Integer.parseInt(a1)
        var num2 = Integer.parseInt(a2)
        var sum = num1 / num2

            val intent = Intent(this, second::class.java)
            intent.putExtra("RESULT", sum)

            startActivity(intent)

        }else{
            return
        }
    }

}






package co.`in`.techarius.parkify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class registerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun onclicksubmit(view: View)
    {
        val intent= Intent(applicationContext, otpActivity::class.java)
        startActivity(intent)
    }
    fun onclicklogin(view: View)
    {
        val intent=Intent(applicationContext, loginActivity::class.java)
        startActivity(intent)
    }
}
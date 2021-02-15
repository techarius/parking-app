package co.`in`.techarius.parkify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun onclickregister(view: View)
    {
        val intent=Intent(applicationContext, registerActivity::class.java)
        startActivity(intent)
    }
    fun onclicksubmit(view: View)
    {
        val intent=Intent(applicationContext, homeActivity::class.java)
        startActivity(intent)
    }
}

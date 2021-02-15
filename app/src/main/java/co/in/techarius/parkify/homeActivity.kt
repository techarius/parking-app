package co.`in`.techarius.parkify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.String

class homeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("FIREBASE","DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("FIREBASE", "Error adding document", e)
            }
//        db.collection("users")
//            .get()
//            .addOnSuccessListener { result ->
//                for (document in result) {
//                    Log.d("IMPORTANT", "${document.id} => ${document.data}")
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.w("IMPORTANT", "Error getting documents.", exception)
//            }
    }
    fun onclicksignout(view: View)
    {
        val intent= Intent(applicationContext, loginActivity::class.java)
        startActivity(intent)
    }
    val db = Firebase.firestore
    val user = hashMapOf(
        "name" to "Amit Samui",
        "password" to "amit",
        "email" to "alan.math@gmail.com",
        "contact" to "93820984092"
    )

}
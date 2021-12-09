package example.vifox.mypoem

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"У врат обители святой\n Стоял просящий подаянья")

    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Бедняк иссохший, чуть живой\n От глада, жажды и страданья.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Куска лишь хлеба он просил,\n И взор являл живую муку,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"И кто-то камень положил\n В его протянутую руку.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Так я молил твоей любви\n С слезами горькими, с тоскою;")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Так чувства лучшие мои\n Обмануты навек тобою!")
    }
}
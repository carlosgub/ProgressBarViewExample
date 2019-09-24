package progressbar.carlos.com.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mProgress:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bActivityNext.setOnClickListener {
            mProgress+=25
            ccActivty.setProgress(mProgress%125)
        }
    }
}

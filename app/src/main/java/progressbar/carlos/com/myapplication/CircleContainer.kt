package progressbar.carlos.com.myapplication

import android.animation.ObjectAnimator
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import androidx.core.animation.doOnEnd
import kotlinx.android.synthetic.main.circle_layout.view.*


class CircleContainer(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    private var listener:Listener? = null

    interface Listener{

    }


    init {
        View.inflate(context, R.layout.circle_layout, this@CircleContainer)
    }

    fun setProgress(percent:Int){
        ObjectAnimator.ofInt(pbCircle,"progress",percent).setDuration(250).apply {
            doOnEnd{
                when {
                    percent>=75 -> {
                        ivCircleFirst.alpha = 1f
                        ivCircleSecond.alpha = 1f
                        ivCircleThird.alpha = 1f
                        ivCircleFourth.alpha = 1f
                    }
                    percent>=50 -> {
                        ivCircleFirst.alpha = 1f
                        ivCircleSecond.alpha = 1f
                        ivCircleThird.alpha = 1f
                    }
                    percent>=25 -> {
                        ivCircleFirst.alpha = 1f
                        ivCircleSecond.alpha = 1f
                    }
                    else -> ivCircleFirst.alpha = 1f
                }
            }
        }.start()
    }

}
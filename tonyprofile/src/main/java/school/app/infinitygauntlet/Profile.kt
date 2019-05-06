package school.app.infinitygauntlet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        ivPoster.scaleAnimation()
    }
}

fun ImageView.scaleAnimation() {
    startAnimation(AnimationUtils.loadAnimation(context, R.anim.scale))
}
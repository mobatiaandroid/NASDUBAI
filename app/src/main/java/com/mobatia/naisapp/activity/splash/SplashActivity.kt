package com.mobatia.naisapp.activity.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.mobatia.naisapp.R
import com.mobatia.naisapp.constants.PreferenceManager

class SplashActivity : AppCompatActivity() {
    lateinit var mContext: Context
    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mContext=this

        Handler().postDelayed({
            if (PreferenceManager.getIsFirstLaunch(mContext))
            {
//                val intent = Intent(mContext, TutorialActivity::class.java)
//                PreferenceManager.setIsFirstLaunch(mContext,false)
//                startActivity(intent)
//                finish()
            }
            else{
                if (PreferenceManager.getaccesstoken(mContext).equals(""))
                {
                    // Login

                }
                else
                {
                    //Home

                }
            }




        }, SPLASH_TIME_OUT)
    }


}
package com.km.nithin.assignment1.util

import android.content.Context
import com.google.android.gms.iid.InstanceID
import android.provider.Settings.Secure





/**
 * Created by bineesh on 22/11/17.
 */
class SystemUtil {
    companion object {
        fun  getInstanceId(context:Context):String{
            var instanceId = InstanceID.getInstance(context)
            val android_id=Secure.getString(context.contentResolver , Secure.ANDROID_ID)
            return android_id
        }


    }


}
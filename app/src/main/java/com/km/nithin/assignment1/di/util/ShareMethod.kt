package com.km.nithin.assignment1.util

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import java.util.regex.Pattern


/**
 * Created by bineesh on 26/10/17.
 */
object ShareMethod {
    fun isValidMobile(phone: String?): Boolean {
        var check: Boolean
        if (!Pattern.matches("[a-zA-Z]+", phone)) {
            check = !(phone?.length?:0 < 10 || phone?.length?:0 > 10)
        } else {
            check = false
        }
        return check
    }

    fun isValidEmail(email: String?): Boolean {
        var check: Boolean
        if (Pattern.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+", email)) {
            check = email?.length != 0
        } else {
            check = false
        }
        return check
    }


    fun showMyQuestionAlert(context: Context, message: String, yes: String,
                            onYesClick: () -> Unit, title: String) {
        val builder = AlertDialog.Builder(context)
        builder.setCancelable(false)
        builder.setPositiveButton(yes, DialogInterface.OnClickListener { arg0, arg1 ->
            onYesClick
            arg0.dismiss()
        })
        val alert = builder.create()
        alert.setTitle(title)
        alert.setMessage(message)
        alert.show()
    }
    fun showMyQuestionAlert(context: Context, message: String) {
        val builder = AlertDialog.Builder(context)
        builder.setPositiveButton("Ok", DialogInterface.OnClickListener { arg0, arg1 ->
            arg0.dismiss()
        })
        val alert = builder.create()
        alert.setMessage(message)
        alert.show()
    }

}
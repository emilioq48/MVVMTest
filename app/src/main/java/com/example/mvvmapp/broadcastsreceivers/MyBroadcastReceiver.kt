package com.example.mvvmapp.broadcastsreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage
import android.util.Log
import android.widget.Toast
import com.example.mvvmapp.Constants.BROADCAST_RECEIVER_EXTRA_STRING


class MyBroadcastReceiver : BroadcastReceiver() {

    companion object {
        val SMS_BUNDLE = "pdus"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
//        val bundle = intent?.getBundleExtra(SMS_BUNDLE) as Array<Any>

//        if (bundle != null) {
////            val sms = bundle.get(SMS_BUNDLE) as Array<Any>
//            var smsMessageStr = ""
//            for (i in bundle.indices) {
//                val smsMessage = SmsMessage.createFromPdu(bundle[i] as ByteArray)
//
//                val smsBody = smsMessage.getMessageBody().toString()
//                val address = smsMessage.getOriginatingAddress()
//
//                smsMessageStr += "SMS From: $address\n"
//                smsMessageStr += smsBody + "\n"
//            }
            Log.d("emi","asd")
            Toast.makeText(context, "ASD", Toast.LENGTH_SHORT).show()
//            Toast.makeText(context, smsMessageStr, Toast.LENGTH_SHORT).show()
//        }
    }

}
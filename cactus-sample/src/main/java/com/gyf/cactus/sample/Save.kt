package com.gyf.cactus.sample

import android.annotation.SuppressLint

/**
 * @author geyifeng
 * @date 2019-09-03 13:55
 */
@SuppressLint("StaticFieldLeak")
object Save {
    var timer by preference(0L)
    var lastTimer by preference(0L)
    var date by preference("0000-01-01 00:00:00")
    var endDate by preference("0000-01-01 00:00:00")
}
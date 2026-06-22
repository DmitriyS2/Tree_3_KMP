package com.sdv.tree3.shared.com.sdv.tree3.common

import java.math.BigInteger
import java.security.MessageDigest

actual fun encrypt(input: String): String {
    val md = MessageDigest.getInstance("SHA-1")
    val messageDigest = md.digest(input.toByteArray())
    val no = BigInteger(1, messageDigest)
    var hashText = no.toString(16)
    while (hashText.length < 20) {
        hashText = "0$hashText"
    }
    return hashText.substring(0, 19)
}
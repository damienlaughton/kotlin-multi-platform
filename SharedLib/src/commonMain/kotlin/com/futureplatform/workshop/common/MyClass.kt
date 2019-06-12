package com.futureplatform.workshop.common

class MyClass {
    fun getMyPlatformName() {
        val message = returnsAString()
        print(message)
    }
}

expect fun returnsAString(): String
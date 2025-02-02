package com.github.XIXaa.kernelflasher

internal class MainListener(private val callback: () -> Unit) {
    fun resume() {
        callback.invoke()
    }
}

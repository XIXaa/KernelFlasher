package com.github.rimuruchan.kernelflasher

internal class MainListener(private val callback: () -> Unit) {
    fun resume() {
        callback.invoke()
    }
}

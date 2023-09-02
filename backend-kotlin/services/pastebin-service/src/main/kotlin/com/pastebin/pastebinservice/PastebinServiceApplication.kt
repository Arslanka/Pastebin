package com.pastebin.pastebinservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PastebinServiceApplication

fun main(args: Array<String>) {
    runApplication<PastebinServiceApplication>(*args)
}

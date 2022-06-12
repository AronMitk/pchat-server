package com.harrontech.pchat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PchatApplication

fun main(args: Array<String>) {
	runApplication<PchatApplication>(*args)
}

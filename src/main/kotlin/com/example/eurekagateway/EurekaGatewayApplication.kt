package com.example.eurekagateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaGatewayApplication

fun main(args: Array<String>) {
    runApplication<EurekaGatewayApplication>(*args)
}

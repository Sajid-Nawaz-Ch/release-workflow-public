package com.dvag.api.releaseworkflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReleaseWorkflowApplication

fun main(args: Array<String>) {
    runApplication<ReleaseWorkflowApplication>(*args)
    // Test Release
}

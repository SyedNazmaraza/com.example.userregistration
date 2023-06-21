package com.example.controller

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.userRouting(){
    routing {
        route("/user"){
            get ("/register"){


            }
            get ("/login"){

            }
        }
    }
}
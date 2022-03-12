package com.backend.route

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

import java.io.File

fun Route.DownloadImage(){
    get ("/download"){
        val image = File("file/flower.jpg")

        call.response.header(
            HttpHeaders.ContentDisposition,
            ContentDisposition.Attachment.withParameter(ContentDisposition.Parameters.FileName, "flowers.jpg").toString()
        )
        call.respondFile(image)
    }
}
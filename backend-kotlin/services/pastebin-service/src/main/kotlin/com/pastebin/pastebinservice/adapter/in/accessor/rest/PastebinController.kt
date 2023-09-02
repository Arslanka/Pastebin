package com.pastebin.pastebinservice.adapter.`in`.accessor.rest

import com.pastebin.pastebinservice.application.`in`.port.PasteTextUseCase
import io.pastebin.SwaggerCodgen.api.PastebinApi
import io.pastebin.SwaggerCodgen.model.PasteAddRequest
import io.pastebin.SwaggerCodgen.model.PasteGetResponse
import mu.KLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PastebinController(
    private val pasteTextUseCase: PasteTextUseCase,
): PastebinApi {
    private companion object : KLogging(){}

    override fun addPaste(pasteAddRequest: PasteAddRequest): ResponseEntity<Unit> {
        return super.addPaste(pasteAddRequest)
    }

    override fun deletePaste(pasteId: String): ResponseEntity<Unit> {
        return super.deletePaste(pasteId)
    }

    override fun getPaste(pasteId: String): ResponseEntity<PasteGetResponse> {
        return super.getPaste(pasteId)
    }
}
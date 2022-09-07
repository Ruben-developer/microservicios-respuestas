package com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.exception;

import com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.ApiStatus;

/**
 * @author ock
 */
public class BadRequestException extends ApiException {
    /**
     *
     */
    public BadRequestException() {
        super(ApiStatus.BAD_REQUEST, "");
    }

    /**
     * @param message
     */
    public BadRequestException(String message) {
        super(ApiStatus.BAD_REQUEST, message);
    }
}

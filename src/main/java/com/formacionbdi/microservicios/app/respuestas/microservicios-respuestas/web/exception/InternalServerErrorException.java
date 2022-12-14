package com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.exception;

import com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.ApiStatus;

/**
 * @author ock
 */
public class InternalServerErrorException extends ApiException {
    /**
     *
     */
    public InternalServerErrorException() {
        super(ApiStatus.INTERNAL_SERVER_ERROR, "");
    }

    /**
     * @param message
     */
    public InternalServerErrorException(String message) {
        super(ApiStatus.INTERNAL_SERVER_ERROR, message);
    }
}

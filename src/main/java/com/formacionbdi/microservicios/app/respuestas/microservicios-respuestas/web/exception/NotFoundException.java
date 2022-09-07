package com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.exception;


import com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.ApiStatus;

/**
 * @author ock
 */
public class NotFoundException extends ApiException {
    /**
     *
     */
    public NotFoundException() {
        super(ApiStatus.NOT_FOUND, "");
    }

    /**
     * @param message
     */
    public NotFoundException(String message) {
        super(ApiStatus.NOT_FOUND, message);
    }
}

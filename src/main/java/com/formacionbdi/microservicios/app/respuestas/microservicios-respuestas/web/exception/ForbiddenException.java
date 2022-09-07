package com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.exception;

import com.formacionbdi.microservicios.app.respuestas.microservicios-respuestas.web.ApiStatus;

/**
 * @author ock
 */
public class ForbiddenException extends ApiException {
    /**
     *
     */
    public ForbiddenException() {
        super(ApiStatus.FORBIDDEN, "");
    }

    /**
     * @param message
     */
    public ForbiddenException(String message) {
        super(ApiStatus.FORBIDDEN, message);
    }
}

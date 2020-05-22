package SumService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import SumService.entity.StatusInfo;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoSuchNumberException.class)
    protected ResponseEntity<StatusInfo> handleNoSuchNumberException() {
        return new ResponseEntity<>(new StatusInfo(404, "Not found"), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    protected ResponseEntity<StatusInfo> handleBadRequestException() {
        return new ResponseEntity<>(new StatusInfo(400, "Bad Request"), HttpStatus.BAD_REQUEST);
    }
}
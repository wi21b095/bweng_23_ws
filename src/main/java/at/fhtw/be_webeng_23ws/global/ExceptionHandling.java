package at.fhtw.be_webeng_23ws.global;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(NoSuchElementException.class)
    public String handleNoSuchElementException() {
        return "redirect:/books";
    }
}

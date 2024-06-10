package top.dribles.backend.exceptions;

import java.util.Arrays;
import java.util.List;

public class ApiException extends RuntimeException {
    private List<String> errorList;

    public ApiException(String message) {
        super(message);
        errorList = Arrays.asList(message);
    }

    public ApiException(List<String> errorList) {
        super(String.join(", ", errorList));
        this.errorList = errorList;
    }

    public List<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }
}
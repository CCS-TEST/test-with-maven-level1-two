package ccs.test.mvn.level1.two;

public class BadArgumentException extends RuntimeException {

    public BadArgumentException() {
    }

    public BadArgumentException(String message) {
        super(message);
    }
}

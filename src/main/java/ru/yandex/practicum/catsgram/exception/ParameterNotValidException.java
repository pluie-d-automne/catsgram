package ru.yandex.practicum.catsgram.exception;

public class ParameterNotValidException extends IllegalArgumentException {
    String parameter;
    String reason;

    public ParameterNotValidException(String message) {
        super(message);
    }

    public ParameterNotValidException(String parameter, String reason) {
        super("Некорректное значение параметра "  + parameter + ": " + reason);
        this.parameter = parameter;
        this.reason = reason;
    }
}

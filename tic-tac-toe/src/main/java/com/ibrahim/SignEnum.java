package com.ibrahim;

public enum SignEnum {
    X ('X'),
    O ('O');

    char sign;

    SignEnum(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}

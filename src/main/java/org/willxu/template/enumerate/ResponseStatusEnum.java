package org.willxu.template.enumerate;

public enum ResponseStatusEnum {
    SUCCESS("success"),
    FAIL("fail"),
    EXCEPTION("exception");

    private final String STATUS;

    ResponseStatusEnum(String status) {
        this.STATUS = status;
    }

    public String getStatus() {
        return STATUS;
    }
}

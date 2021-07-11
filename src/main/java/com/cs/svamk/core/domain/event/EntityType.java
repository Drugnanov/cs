package com.cs.svamk.core.domain.event;

public enum EntityType {
    COMMENT(0),
    COMPETENCE(1),
    PATH(2),
    EMPLOYEE_COMPETENCE(3);

    private final int index;

    EntityType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

package com.dokev.gold_dduck.event.domain.status;

import com.dokev.gold_dduck.event.domain.Event;

public interface EventStatus {

    default void renew(Event event) {

    }

    default boolean canChange(Event event) {
        return false;
    }

}

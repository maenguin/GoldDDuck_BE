package com.dokev.gold_dduck.event.domain.status;

import static com.dokev.gold_dduck.event.domain.EventProgressStatus.CLOSED;
import static com.dokev.gold_dduck.event.domain.EventProgressStatus.RUNNING;

import com.dokev.gold_dduck.event.domain.Event;

public class ReadyStatus implements EventStatus {

    @Override
    public void renew(Event event) {
        if (CLOSED.getEventStatus().canChange(event)) {
            event.closeEvent();
            return;
        }
        if (RUNNING.getEventStatus().canChange(event)) {
            event.runEvent();
        }
    }

}

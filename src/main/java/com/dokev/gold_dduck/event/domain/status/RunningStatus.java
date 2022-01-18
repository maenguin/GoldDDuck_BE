package com.dokev.gold_dduck.event.domain.status;

import static com.dokev.gold_dduck.event.domain.EventProgressStatus.CLOSED;

import com.dokev.gold_dduck.event.domain.Event;
import java.time.LocalDateTime;

public class RunningStatus implements EventStatus {

    @Override
    public void renew(Event event) {
        if (CLOSED.getEventStatus().canChange(event)) {
            event.closeEvent();
        }
    }

    @Override
    public boolean canChange(Event event) {
        return event.getStartAt().isEqual(LocalDateTime.now()) || (event.getStartAt().isBefore(LocalDateTime.now())
            && event.getEndAt().isAfter(LocalDateTime.now()));
    }
}

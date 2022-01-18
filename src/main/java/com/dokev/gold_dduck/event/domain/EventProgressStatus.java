package com.dokev.gold_dduck.event.domain;

import com.dokev.gold_dduck.event.domain.status.ClosedStatus;
import com.dokev.gold_dduck.event.domain.status.EventStatus;
import com.dokev.gold_dduck.event.domain.status.ReadyStatus;
import com.dokev.gold_dduck.event.domain.status.RunningStatus;
import lombok.Getter;

@Getter
public enum EventProgressStatus {
    READY(new ReadyStatus()),
    RUNNING(new RunningStatus()),
    CLOSED(new ClosedStatus());

    private final EventStatus eventStatus;

    EventProgressStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }
}

package com.dokev.gold_dduck.event.domain.status;

import com.dokev.gold_dduck.event.domain.Event;
import com.dokev.gold_dduck.event.domain.GiftChoiceType;
import java.time.LocalDateTime;

public class ClosedStatus implements EventStatus {

    @Override
    public boolean canChange(Event event) {
        return checkGiftStock(event) || checkCloseTime(event);
    }

    private boolean checkGiftStock(Event event) {
        boolean isFifoGiftSoldOut = event.getGiftChoiceType() == GiftChoiceType.FIFO && event.getLeftGiftCount() <= 0;
        boolean isRandomGiftSoldOut = event.getGiftChoiceType() == GiftChoiceType.RANDOM
            && event.getLeftGiftCount() + event.getLeftBlankCount() <= 0;
        return isFifoGiftSoldOut || isRandomGiftSoldOut;
    }

    private boolean checkCloseTime(Event event) {
        return event.getEndAt().isEqual(LocalDateTime.now()) || event.getEndAt().isBefore(LocalDateTime.now());
    }

}

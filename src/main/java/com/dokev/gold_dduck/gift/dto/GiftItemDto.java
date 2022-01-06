package com.dokev.gold_dduck.gift.dto;

import com.dokev.gold_dduck.gift.domain.GiftType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class GiftItemDto {

    private Long id;

    private GiftType giftType;

    private String content;

    private boolean used;

    public GiftItemDto(Long id, GiftType giftType, String content, boolean used) {
        this.id = id;
        this.giftType = giftType;
        this.content = content;
        this.used = used;
    }
}

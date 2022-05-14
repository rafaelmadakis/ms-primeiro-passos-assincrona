package com.ead.course.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @Author: Rafael Madakis
 */
@Data
public class SubscriptionDto {

    @NotNull
    private UUID userId;
}

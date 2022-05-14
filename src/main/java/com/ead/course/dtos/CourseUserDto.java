package com.ead.course.dtos;

import lombok.Data;

import java.util.UUID;

/**
 * @Author: Rafael Madakis
 */
@Data
public class CourseUserDto {

    private UUID courseId;

    private UUID userId;
}

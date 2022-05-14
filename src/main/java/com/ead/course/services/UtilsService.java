package com.ead.course.services;

import org.springframework.data.domain.Pageable;

import java.util.UUID;

/**
 * @Author: Rafael Madakis
 */
public interface UtilsService {

    String createUrlGetAllCoursesByUser(UUID courseId, Pageable pageable);

}

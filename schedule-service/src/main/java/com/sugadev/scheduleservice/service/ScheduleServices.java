package com.sugadev.scheduleservice.service;

import com.sugadev.scheduleservice.dto.ResponseDTO;
import com.sugadev.scheduleservice.dto.ScheduleDTO;

import java.util.List;

public interface ScheduleServices {

    ScheduleDTO saveSchedule(ScheduleDTO scheduleDTO);

    ResponseDTO getScheduleById(Integer sheduleID);

    void deleteById(Integer sheduleID);

    List<ScheduleDTO> findAll();

    ScheduleDTO updateSchedule( int sheduleID,ScheduleDTO scheduleDTO);
}

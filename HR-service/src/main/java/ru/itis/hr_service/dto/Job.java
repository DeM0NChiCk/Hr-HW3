package ru.itis.hr_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Job {
    private String name;
    private Integer experience;
    private List<String> skills;
    private String description;
    private String city;

}

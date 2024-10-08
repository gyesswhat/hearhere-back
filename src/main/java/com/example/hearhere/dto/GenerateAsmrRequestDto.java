package com.example.hearhere.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenerateAsmrRequestDto {
    private String userPrompt;
    private String isMusicIncluded;
}

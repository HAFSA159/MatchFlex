package com.matchflex.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
    private Long smartBandId;
}


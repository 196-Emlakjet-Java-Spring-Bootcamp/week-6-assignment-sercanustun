package com.emlakjet.advertisement.dto.request;

import lombok.Data;

@Data
public class AdvertisementRequest {
    private String title;
    private String description;
    private long price;
    private Long userId;
}

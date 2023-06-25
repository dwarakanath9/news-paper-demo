package com.news.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Newspaper {
    private int id;
    private String lccn;
    private String url;
    private String state;
    private String title;
    private String language;
    private Long audienceCount;
    private String country;
    private Float revenue;
}

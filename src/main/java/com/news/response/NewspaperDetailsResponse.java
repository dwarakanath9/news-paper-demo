package com.news.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewspaperDetailsResponse {
    private String place_of_publication;
    private String lccn;
    private String start_year;
    private List<String> place;
    private String name;
    private String publisher;
    private String url;
    private String end_year;
    private List<Issue> issues;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Issue {
        private String url;
        private String date_issued;

        // Getters and Setters
    }
}


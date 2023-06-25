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
public class Pagesresp {

    private List<Pages> pages;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Pages {
        private  String url;
        private  String sequence;
    }
}

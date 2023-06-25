
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
public class NewspaperStateResponse {

    private String state;
    private List<Stateinfo> stateinfo;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Stateinfo{
        private int id;
        private String lccn;
        private String url;
        private String country;
        private NewspaperDetailsResponse newspaperDetailsResponse;

    }
}

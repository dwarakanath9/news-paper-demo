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
public class NewsPaperResp {
    private long totalCountries;
    private long totalStates;
    private long totalNewspapers;
    private List<String> countries;
    private List<String> states;
    List<NewspaperStateResponse> statewiseNewspapers;
}

package com.news.service;

import com.news.model.Newspaper;
import com.news.response.NewspaperResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class NewsPaperServiceImpl implements NewspaperService{
    public List<Newspaper> getAllNewspapersFromWeb() {
        String DATA_URL = "https://chroniclingamerica.loc.gov/newspapers.json";
        RestTemplate restTemplate = new RestTemplate();

        try {
            ResponseEntity<NewspaperResponse> response = restTemplate.exchange(DATA_URL, HttpMethod.GET, null, NewspaperResponse.class);
            if (response.getStatusCode().is2xxSuccessful()) {
                NewspaperResponse newspaperResponse = response.getBody();
                if (newspaperResponse != null) {
                    return newspaperResponse.getNewspapers();
                }
            }
        } catch (HttpClientErrorException ex) {
            // Handle exception or error status codes
            ex.printStackTrace();
        }

        return new ArrayList<>();
    }
}


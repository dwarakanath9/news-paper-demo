package com.news.service;

import com.news.model.Newspaper;
import java.util.List;

public interface NewspaperService {

    public List<Newspaper> getAllNewspapersFromWeb();
}
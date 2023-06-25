package com.news.response;

import com.news.model.Newspaper;

import java.util.List;

public class NewspaperResponse {
    private List<Newspaper> newspapers;
    public List<Newspaper> getNewspapers() {
        return newspapers;
    }

    public void setNewspapers(List<Newspaper> newspapers) {
        this.newspapers = newspapers;
    }
}


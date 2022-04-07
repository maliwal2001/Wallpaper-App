package com.example.wallpaperapplication.Listeners;


import com.example.wallpaperapplication.Models.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response, String message);
    void onError(String message);
}
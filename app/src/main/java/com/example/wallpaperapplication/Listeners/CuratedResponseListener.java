package com.example.wallpaperapplication.Listeners;


import com.example.wallpaperapplication.Models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
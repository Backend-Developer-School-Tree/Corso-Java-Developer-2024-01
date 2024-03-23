package com.opinno.esempio_api.utility;

import com.google.gson.JsonElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResponse {

    @NonNull
    private String statusResponse;
    private String description;
    private JsonElement data;

    public HttpResponse(String statusResponse, JsonElement data){
        this.statusResponse = statusResponse;
        this.data = data;
    }
    public HttpResponse(String statusResponse, String description){
        this.statusResponse = statusResponse;
        this.description = description;
    }

}

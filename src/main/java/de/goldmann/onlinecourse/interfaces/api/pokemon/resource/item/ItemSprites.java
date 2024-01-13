package de.goldmann.onlinecourse.interfaces.api.pokemon.resource.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemSprites {

    private String imageUrl;

    @JsonProperty("default")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("default")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

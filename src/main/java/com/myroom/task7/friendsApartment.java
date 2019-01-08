package com.myroom.task7;

public class friendsApartment implements IBeer {
    private Beer favouriteBeer;

    public void setFavouriteBeer(Beer favouriteBeer) {
        this.favouriteBeer = favouriteBeer;
    }

    public Beer getBeer() {
        return this.favouriteBeer;
    }
}

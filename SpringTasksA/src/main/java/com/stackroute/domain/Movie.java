package com.stackroute.domain;

public class Movie {

    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public Actor getActor1() {
        return actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public Actor getActor3() {
        return actor3;
    }
}

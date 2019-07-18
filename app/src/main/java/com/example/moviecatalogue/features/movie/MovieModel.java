package com.example.moviecatalogue.features.movie;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {

    private String title;
    private String cover;
    private String year;
    private String duration;
    private String category;
    private String release;
    private String rate;
    private String vote;
    private String description;
    private String director;
    private String writers;
    private String stars;

    public MovieModel() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.cover);
        dest.writeString(this.year);
        dest.writeString(this.duration);
        dest.writeString(this.category);
        dest.writeString(this.release);
        dest.writeString(this.rate);
        dest.writeString(this.vote);
        dest.writeString(this.description);
        dest.writeString(this.director);
        dest.writeString(this.writers);
        dest.writeString(this.stars);
    }

    protected MovieModel(Parcel in) {
        this.title = in.readString();
        this.cover = in.readString();
        this.year = in.readString();
        this.duration = in.readString();
        this.category = in.readString();
        this.release = in.readString();
        this.rate = in.readString();
        this.vote = in.readString();
        this.description = in.readString();
        this.director = in.readString();
        this.writers = in.readString();
        this.stars = in.readString();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel source) {
            return new MovieModel(source);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };
}

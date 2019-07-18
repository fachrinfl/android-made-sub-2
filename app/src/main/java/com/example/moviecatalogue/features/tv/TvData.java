package com.example.moviecatalogue.features.tv;

import java.util.ArrayList;

public class TvData {
    public static String[][] tvData = new String[][] {
            {
                    "Chernobyl",
                    "https://m.media-amazon.com/images/M/MV5BNTEyYmIzMDUtNWMwNC00Y2Q1LWIyZTgtMGY1YzUxOTAwYTAwXkEyXkFqcGdeQXVyMjIyMTc0ODQ@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "5h 30min ",
                    "Drama, History",
                    "TV Mini-Series (2019)",
                    "9.5/10",
                    "310,109",
                    "In April 1986, an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics becomes one of the world's worst man-made catastrophes.",
                    "Craig Mazin",
                    "",
                    "Jessie Buckley, Jared Harris, Stellan Skarsgård"
            },
            {
                    "Planet Earth II",
                    "https://m.media-amazon.com/images/M/MV5BZWYxODViMGYtMGE2ZC00ZGQ3LThhMWUtYTVkNGE3OWU4NWRkL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjYwNDA2MDE@._V1_SY1000_CR0,0,666,1000_AL_.jpg",
                    "2016",
                    "4h 58min ",
                    "Documentary",
                    "TV Mini-Series (2016)",
                    "9.5/10",
                    "76,230",
                    "David Attenborough returns in this breathtaking documentary showcasing life on Planet Earth.",
                    "",
                    "",
                    "David Attenborough"
            },
            {
                    "Band of Brothers ",
                    "https://m.media-amazon.com/images/M/MV5BMTI3ODc2ODc0M15BMl5BanBnXkFtZTYwMjgzNjc3._V1_.jpg",
                    "2001",
                    "9h 54min",
                    "Action, Drama, History",
                    "TV Mini-Series (2001)",
                    "9.5/10",
                    "327,342",
                    "The story of Easy Company of the U.S. Army 101st Airborne Division, and their mission in World War II Europe, from Operation Overlord, through V-J Day.",
                    "",
                    "",
                    "Scott Grimes, Damian Lewis, Ron Livingston"
            },
            {
                    "Planet Earth",
                    "https://m.media-amazon.com/images/M/MV5BNmZlYzIzMTItY2EzYS00YTEyLTg0ZjEtMDMzZjM3ODdhN2UzXkEyXkFqcGdeQXVyNjI0MDg2NzE@._V1_SY1000_CR0,0,666,1000_AL_.jpg",
                    "2006",
                    "8h 58min ",
                    "Documentary",
                    "TV Mini-Series (2006)",
                    "9.4/10",
                    "150,586",
                    "Emmy Award-winning, 11 episodes, five years in the making, the most expensive nature documentary series ever commissioned by the BBC, and the first to be filmed in high definition.",
                    "",
                    "",
                    "David Attenborough, Sigourney Weaver, Huw Cordey"
            },
            {
                    "Game of Thrones",
                    "https://m.media-amazon.com/images/M/MV5BMjA5NzA5NjMwNl5BMl5BanBnXkFtZTgwNjg2OTk2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2011",
                    "57min",
                    "Action, Adventure, Drama",
                    "TV Series (2011–2019)",
                    "9.4/10",
                    "1,566,176",
                    "Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years.",
                    "David Benioff, D.B. Weiss",
                    "",
                    "Emilia Clarke, Peter Dinklage, Kit Harington"
            },
            {
                    "The Wire ",
                    "https://m.media-amazon.com/images/M/MV5BNjc1NzYwODEyMV5BMl5BanBnXkFtZTcwNTcxMzU1MQ@@._V1_SY1000_CR0,0,735,1000_AL_.jpg",
                    "2002",
                    "59min",
                    "Crime, Drama, Thriller",
                    "TV Series (2002–2008)",
                    "9.3/10",
                    "249,102",
                    "Baltimore drug scene, seen through the eyes of drug dealers and law enforcement.",
                    "David Simon",
                    "",
                    "Dominic West, Lance Reddick, Sonja Sohn"
            },
            {
                    "Cosmos",
                    "https://m.media-amazon.com/images/M/MV5BZTk5OTQyZjYtMDk3Yy00YjhmLWE2MTYtZmY4NTg1YWUzZTQ0XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_.jpg",
                    "2014",
                    "9h 17min",
                    "Documentary",
                    "TV Series (2014– )",
                    "9.3/10",
                    "98,113\n",
                    "An exploration of our discovery of the laws of nature and coordinates in space and time.",
                    "",
                    "",
                    "Neil deGrasse Tyson, Stoney Emshwiller, Piotr Michael"
            },
            {
                    "Blue Planet II",
                    "https://m.media-amazon.com/images/M/MV5BYjg2ODk0MjUtNmMzZS00MjY0LWI1YWMtN2JhMjRmZGUwY2I3XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
                    "2017",
                    "6h 4min",
                    "Documentary ",
                    "TV Mini-Series (2017–2018)",
                    "9.3/10",
                    "21,571",
                    "David Attenborough returns to the world's oceans in this sequel to the acclaimed documentary filming rare and unusual creatures of the deep, as well as documenting the problems our oceans face.",
                    "",
                    "",
                    "David Attenborough, Peter Drost, Roger Munns"
            },
            {
                    "Our Planet",
                    "https://m.media-amazon.com/images/M/MV5BN2I1ZjA5YjQtYmQ0ZS00ZmE1LTk1ZjktNTQ5ODIzY2JiZDdhXkEyXkFqcGdeQXVyNjg2NjQwMDQ@._V1_SY1000_CR0,0,675,1000_AL_.jpg",
                    "2019",
                    "6h 43min",
                    "Documentary ",
                    "TV Mini-Series (2019)",
                    "9.3/10",
                    "14,460",
                    "Documentary series focusing on the breadth of the diversity of habitats around the world, from the remote Arctic wilderness and mysterious deep oceans to the vast landscapes of Africa and diverse jungles of South America.",
                    "",
                    "",
                    "David Attenborough"
            },
            {
                    "Rick and Morty ",
                    "https://m.media-amazon.com/images/M/MV5BMjRiNDRhNGUtMzRkZi00MThlLTg0ZDMtNjc5YzFjYmFjMmM4XkEyXkFqcGdeQXVyNzQ1ODk3MTQ@._V1_.jpg",
                    "2013",
                    "23min",
                    "Animation, Adventure, Comedy",
                    "TV Series (2013– )",
                    "9.3/10",
                    "281,550",
                    "An animated series that follows the exploits of a super scientist and his not-so-bright grandson.",
                    "Dan Harmon, Justin Roiland",
                    "",
                    "Justin Roiland, Chris Parnell, Spencer Grammer"
            }
    };

    public static ArrayList<TvModel> getListTv() {
        ArrayList<TvModel> list = new ArrayList<>();
        for (String[] data: tvData) {
            TvModel tvModel = new TvModel();
            tvModel.setTitle(data[0]);
            tvModel.setCover(data[1]);
            tvModel.setYear(data[2]);
            tvModel.setDuration(data[3]);
            tvModel.setCategory(data[4]);
            tvModel.setRelease(data[5]);
            tvModel.setRate(data[6]);
            tvModel.setVote(data[7]);
            tvModel.setDescription(data[8]);
            tvModel.setDirector(data[9]);
            tvModel.setWriters(data[10]);
            tvModel.setStars(data[11]);

            list.add(tvModel);
        }
        return list;
    }
}

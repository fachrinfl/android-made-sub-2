package com.example.moviecatalogue.features.movie;

import java.util.ArrayList;

public class MovieData {
    public static String[][] movieData = new String[][]{
            {
                    "Spider-Man: Far from Home",
                    "https://m.media-amazon.com/images/M/MV5BMGZlNTY1ZWUtYTMzNC00ZjUyLWE0MjQtMTMxN2E3ODYxMWVmXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "2h 9min",
                    "Action, Adventure, Sci-Fi",
                    "2 July 2019",
                    "8.1/10",
                    "52,278",
                    "Following the events of Avengers: Endgame (2019), Spider-Man must step up to take on new threats in a world that has changed forever.",
                    "Jon Watts",
                    "Chris McKenna, Stan Lee (based on the Marvel comic book by)",
                    "Tom Holland, Samuel L. Jackson, Jake Gyllenhaal"
            },
            {
                    "Toy Story 4",
                    "https://m.media-amazon.com/images/M/MV5BMTYzMDM4NzkxOV5BMl5BanBnXkFtZTgwNzM1Mzg2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "1h 40min",
                    "Animation, Adventure, Comedy",
                    "21 June 2019",
                    "8.3/10",
                    "52,781",
                    "When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
                    "Josh Cooley",
                    "John Lasseter (original story by), Andrew Stanton (original story by)",
                    "Tom Hanks, Tim Allen, Annie Potts"
            },
            {
                    "Aladdin",
                    "https://m.media-amazon.com/images/M/MV5BMjQ2ODIyMjY4MF5BMl5BanBnXkFtZTgwNzY4ODI2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "2h 8min",
                    "Adventure, Comedy, Family",
                    "24 May 2019",
                    "7.4/10",
                    "77,902",
                    "A kind-hearted street urchin and a power-hungry Grand Vizier vie for a magic lamp that has the power to make their deepest wishes come true.",
                    "Guy Ritchie",
                    "John August (screenplay by), Guy Ritchie (screenplay by)",
                    "Will Smith, Mena Massoud, Naomi Scott"
            },
            {
                    "Men in Black: International",
                    "https://m.media-amazon.com/images/M/MV5BMDZkODI2ZGItYTY5Yi00MTA4LWExY2ItM2ZmNjczYjM0NDg1XkEyXkFqcGdeQXVyMzY0MTE3NzU@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "1h 54min",
                    "Action, Adventure, Comedy",
                    "14 June 2019",
                    "5.7/10",
                    "25,096",
                    "The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest threat to date: a mole in the Men in Black organization.",
                    "F. Gary Gray",
                    "Matt Holloway, Art Marcum",
                    "Chris Hemsworth, Tessa Thompson, Kumail Nanjiani"
            },
            {
                    "Midsommar",
                    "https://m.media-amazon.com/images/M/MV5BMzQxNzQzOTQwM15BMl5BanBnXkFtZTgwMDQ2NTcwODM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "2h 27min",
                    "Drama, Horror, Mystery",
                    "3 July 2019",
                    "7.8/10",
                    "7,707",
                    "A couple travels to Sweden to visit a rural hometown's fabled mid-summer festival. What begins as an idyllic retreat quickly devolves into an increasingly violent and bizarre competition at the hands of a pagan cult.",
                    "Ari Aster",
                    "Ari Aster",
                    "Florence Pugh, Jack Reynor, William Jackson Harper"
            },
            {
                    "Marianne & Leonard: Words of Love ",
                    "https://m.media-amazon.com/images/M/MV5BYTU2N2I4OWUtNmIxNy00YmM5LWJkYzItOWE4NTc5ODczNzUwXkEyXkFqcGdeQXVyODAzODU1NDQ@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "1h 42min",
                    "Documentary, Music",
                    "5 July 2019",
                    "6.6/10",
                    "49",
                    "An in-depth look at the relationship between the late musician Leonard Cohen and his Norwegian muse Marianne Ihlen.",
                    "Nick Broomfield",
                    "",
                    "Leonard Cohen, Judy Collins, Helle Goldman "
            },
            {
                    "Phil",
                    "https://m.media-amazon.com/images/M/MV5BZGY2MDQ4MTYtMDgxOC00NTI4LWIyYWQtNDM5MjFiMmY3NTM2XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SY1000_CR0,0,692,1000_AL_.jpg",
                    "2019",
                    "1h 46min",
                    "Comedy, Drama",
                    "5 July 2019",
                    "5.6/10",
                    "87",
                    "A depressed dentist in mid life crisis tries to learn why one of his happiest patients suddenly commits suicide, and a dark comedic adventure ensues.",
                    "Greg Kinnear",
                    "Stephen Mazur",
                    "Greg Kinnear, Emily Mortimer, Bradley Whitford"
            },
            {
                    "Yesterday",
                    "https://m.media-amazon.com/images/M/MV5BMjQ0NTI0NjkyN15BMl5BanBnXkFtZTgwNzY0MTE0NzM@._V1_SY1000_CR0,0,675,1000_AL_.jpg",
                    "2019",
                    "1h 56min",
                    "Comedy, Fantasy, Music",
                    "28 June 2019",
                    "7.1/10",
                    "12,445",
                    "A struggling musician realizes he's the only person on Earth who can remember The Beatles after waking up in an alternate timeline where they never existed.",
                    "Danny Boyle",
                    "Jack Barth (story by), Richard Curtis (screenplay)",
                    "Himesh Patel, Lily James, Sophia Di Martino"
            },
            {
                    "The Secret Life of Pets 2",
                    "https://m.media-amazon.com/images/M/MV5BMzdlMWQzZmItMDA5Ny00MGFjLTk0MDAtYjgzMmMyNTEwMzdhXkEyXkFqcGdeQXVyODQzNTE3ODc@._V1_SY1000_CR0,0,631,1000_AL_.jpg",
                    "2019",
                    "1h 26min",
                    "Animation, Adventure, Comedy",
                    "7 June 2019",
                    "6.6/10",
                    "8,965",
                    "Continuing the story of Max and his pet friends, following their secret lives after their owners leave them for work or school each day.",
                    "Chris Renaud, Jonathan del Val (co-director)",
                    "Brian Lynch",
                    "Patton Oswalt, Kevin Hart, Harrison Ford"
            },
            {
                    "Avengers: Endgame",
                    "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "3h 1min",
                    "Action, Adventure, Sci-Fi",
                    "26 April 2019",
                    "8.7/10",
                    "468,520",
                    "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                    "Anthony Russo, Joe Russo",
                    "Christopher Markus (screenplay by), Stephen McFeely (screenplay by)",
                    "Robert Downey Jr., Chris Evans, Mark Ruffalo"
            }
    };

    public static ArrayList<MovieModel> getListMovie() {
        ArrayList<MovieModel> list = new ArrayList<>();
        for (String[] data: movieData) {
            MovieModel movie = new MovieModel();
            movie.setTitle(data[0]);
            movie.setCover(data[1]);
            movie.setYear(data[2]);
            movie.setDuration(data[3]);
            movie.setCategory(data[4]);
            movie.setRelease(data[5]);
            movie.setRate(data[6]);
            movie.setVote(data[7]);
            movie.setDescription(data[8]);
            movie.setDirector(data[9]);
            movie.setWriters(data[10]);
            movie.setStars(data[11]);

            list.add(movie);
        }

        return list;
    }
}

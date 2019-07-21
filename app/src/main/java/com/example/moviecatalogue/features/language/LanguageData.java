package com.example.moviecatalogue.features.language;

import java.util.ArrayList;

public class LanguageData {
    public static String[][] langData = new String[][]{
            {
                    "English",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1280px-Flag_of_the_United_Kingdom.svg.png",
                    "en"
            },
            {
                    "Indonesian",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/2000px-Flag_of_Indonesia.svg.png",
                    "in"
            },
            {
                    "Japan",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/1280px-Flag_of_Japan.svg.png",
                    "ja"
            }
    };

    public static ArrayList<LanguageModel> getListLang() {
        ArrayList<LanguageModel> list = new ArrayList<>();
        for (String[] data: langData) {
            LanguageModel languageModel = new LanguageModel();
            languageModel.setLangName(data[0]);
            languageModel.setLangImage(data[1]);
            languageModel.setLangCode(data[2]);
            list.add(languageModel);
        }
        return list;
    }
}

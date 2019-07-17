package com.example.moviecatalogue.features.language;

import java.util.ArrayList;

public class LanguageData {
    public static String[][] langData = new String[][]{
            {
                    "English",
                    "http://flags.fmcdn.net/data/flags/w580/gb.png",
                    "en"
            },
            {
                    "Indonesian",
                    "http://flags.fmcdn.net/data/flags/w580/id.png",
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

package com.example.user.history;


public class QuestionLibrary_3 {

    private String mQuestions [] = {
            "Перша поетична зірка Олександра Олеся ",
            "Виберіть зайве. Олександр Олесь з приходом до влади більшовиків виїхав з України і проживав у",
            "Виберіть зайве. Олександр Олесь ",
            "Вірш \"З журбою радість обнялась...\" належить до",
            "У творі \"Чари ночі\" \"сміються, плачуть ...\"",
            "\"Бенкет справляє\" у романсі \"Чари ночі\"",

            "Якого героя твору зарубіжної літератури згадано у творі \"Чари ночі\"? ",
            "Зайвим мотивом у творі \"Чари ночі\" є ",
            "У вірші \"Чари ночі\" можна аргументувати ",
            "Виберіть зайве. Олександр Олесь \", ",
            "Образ якого птаха поет використав на позначення рідного слова у вірші \"О слово рідне!..\"? ",
            "Основний вид лірики вірша \"О слово рідне!..\" ",



            "Основний вид лірики вірша \"О слово рідне!..\" "


    };


    private String mChoices [][] = {
            {"З журбою радість обнялась", "Чужиною", "Кому повім печаль мою"},
            {"Празі", "Будапешті", "Петербурзі"},
            {"писав твори як українською, так і російською мовою", "працював ветеринарним лікарем", "писав під літературним псевдонімом - Олександр Кандиба"},
            {"пейзажної лірики", "філософської лірики", "інтимної лірики"},
            {"молоді", "солов'ї", "закохані"},
            {"осінь", "весна", "літо"},

            {"Фауста", "Ромео", "Гамлета"},
            {"важливість кохання", "гімн порі року", "осмислення ролі митця"},
            {"інтимну лірику", "інтимну, пейзажну лірики", "пейзажну, філософську"},
            {"писав твори як українською, так і російською мовою", "працював ветеринарним лікарем", "писав під літературним псевдонімом - Олександр Кандиба"},
            {"солов'я", "орла", "журавля"},
            {"особиста", "громадянська", "медитативна"},




            {"особиста", "громадянська", "медитативна"}
    };



    private String mCorrectAnswers[] = {
            "Кому повім печаль мою",
            "Будапешті",
            "працював ветеринарним лікарем",
            "інтимної лірики",
            "молоді",
            "осінь",

            "Гамлета",
            "гімн порі року",
            "інтимну, пейзажну лірики",
            "працював ветеринарним лікарем",
            "солов'я",
            "особиста",






            "особиста"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
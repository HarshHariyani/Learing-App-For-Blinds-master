package com.TheVision.tv;

public class QMathHindi {

    public String questions[] = {
            "पूर्णांक की एक जोड़ी लिखें जिसमें: सम -6 है",
            "पूर्णांक की एक जोड़ी को लिखें जिसमें: -8 अंतर है",
            "पूर्णांक की एक जोड़ी लिखें जिसमें: योग 1 है",
            "नकारात्मक पूर्णांक की एक जोड़ी लिखें जिसका अंतर 7 देता है",
            "एक नकारात्मक पूर्णांक और एक सकारात्मक पूर्णांक लिखें जिसका योग -6 है",
            "एक नकारात्मक पूर्णांक और एक सकारात्मक पूर्णांक लिखें जिसका अंतर -7 है",
            "एक नकारात्मक पूर्णांक और एक सकारात्मक पूर्णांक लिखिए जिसका अंतर ए-क्विज़ था जिसमें टीम ए ने -35, 12, 0 और टीम बी ने तीन क्रमिक राउंड में 12, 8, -30 स्कोर किए। अधिक अंक प्राप्त करके क्विज किसने जीता? क्या पूर्णांकों को किसी भी तरीके से जोड़ा जा सकता है 7?",
            " [कम्यूटेटिव प्रॉपर्टी का उपयोग करना] (-4) + (-6) =",
            "-34 + 0 = ",
            "18 + (-18) =",
            "पहले पाँच पूरे संख्याओं के माध्य की गणना करें",
            "एक क्रिकेटर आठ पारियों में निम्नलिखित रन बनाता है: 58, 56, 89, 69, 76, 78, 44, 90. औसत स्कोर की गणना करें.",
            "10 लड़कों की ऊंचाई (सेमी में) निम्नानुसार थी: 130, 150, 145, 165, 150, 143, 146, 123, 128, 136 सबसे छोटे लड़के की ऊंचाई का पता लगाएं",
            "a + 4 =  तथा  a = – 4",
            "a + 5 = ,तथा  a = 0",
            "a + 4 = ,तथा a = 4",
            "a – 8 = ,तथा a = 8",
            "a – 8 = ,तथा a = -9",
            "5a = ,तथा a = 5",
            "x/3 = ,तथा  x = – 9",
            "5m + 1 = 11 इसलिए m=",
            "3p – 15 = 6 इसलिए p=",
            "अंक p और 5 का योग 10 है.",
            "6 से घटाया गया ९ है",
            "4k = 20 फिर k="
    };

    public String choices[][] = {
            {"-5 + (-1)", "-6 + 5", "5+(-5)", "1+5"},
            {"5 + (-4)", "-5 + (-1)", "-9 – (-1) =", " कुछ भी नहीं"},
            {"-6 + 5", "-9 + 8", "-5 + (-1) = -6", "5 + (-4)"},
            {"-2 - 9", "(-2) – (-9)", "2 - 9", "5-(-3)"},
            {"(-7) + 1", "(7) + 1", "5 + 1", "4 + 2"},
            {"(-9) + 2", "(-4) – 3", "(4) + 3", "(-4) + 3"},
            {"टीम A", "टीम B", "दोनों टीम समान स्कोर", "कुछ भी नहीं"},
            {"(-6) +(-5)", " (-6) -(-5)", "(6) +(-5) ", "सब"},
            {"35", "34", "-34", "0"},
            {"18", "0", "36", "-18"},
            {"2", "5", "10", "120"},
            {"70", "80", "90", "100"},
            {"175 cm", "100 cm", "163 cm", "123 cm"},
            {"0", "4", "8", "-4"},
            {"0", "5", "-5", "10"},
            {"8", "-4", "4", "0"},
            {"8", "-8", "0", "4"},
            {"15", "-15", "1", "कुछ भी नहीं"},
            {"5", "25", "-5", "-25"},
            {"3", "0", "1", "-3"},
            {"0", "1", "2", "4"},
            {"5", "1", "6", "7"},
            {"p - 5 = 10", "-p + 5 = 10", "p + 5 = -10", "p + 5 = 10"},
            {"q– 6 = -9", "q– 6 = 9", "-q– 6 = 9", "कुछ भी नहीं"},
            {"5", "6", "7", "8"}
    };

    public String correctAnswer[] = {
            "-5 + (-1)",
            "-9 – (-1)",
            "5 + (-4)",
            "(-2) – (-9)",
            "(-7) + 1",
            "(-9) + 2",
            "टीम B",
            "(-6) +(-5)",
            "-34",
            "0",
            "2",
            "70",
            "123 cm",
            "0",
            "5",
            "8",
            "0",
            "-15",
            "25",
            "-3",
            "2",
            "7",
            "p + 5 = 10",
            "q– 6 = 9",
            "5"

    };

    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a) {
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a) {
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a) {
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a) {
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswer[a];
        return answer;
    }


}

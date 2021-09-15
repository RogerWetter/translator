package ch.translate;

import ch.translate.language.Language;
import ch.translate.translator.Translator;

public class Main {
    public static void main(String[] args) throws Exception{
        Translator translator = new Translator("9afb67b1-b8e3-71eb-fd45-51b659629d18:fx");
        translator.translate("Dieser Text sollte übersetzt werden.", Language.EN);
    }
}

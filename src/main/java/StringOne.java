/**
 * Created by mykhail on 7/8/19.
 */
public class StringOne {

    public static void main(String[] args) {
        String sentence = "Обожаю Java";
        System.out.println(sentence.length());

        String sentenceOn ="У меня есть цель на ближайший год. ";
        sentenceOn = sentenceOn.concat("Я должен (-на) стать Java разработчиком.");
        System.out.println(sentenceOn);

        String sentenceTW = "Обожаю язык программирования Java";
        char ch1 = sentenceTW.charAt(0);
        char ch2 = sentenceTW.charAt(5);
        char ch3 = sentenceTW.charAt(9);
        System.out.println("Буква 0 индекса это: " + ch1);
        System.out.println("Буква 5 индекса это: " + ch2);
        System.out.println("Буква 9 индекса это: " + ch3);

        String sentenceTh ="Обожаю язык программирования Java";
        System.out.println(sentenceTh.substring(6));
        System.out.println(sentenceTh.substring(6,11));

        String sentence1 ="    Java - очень крутой язык программирования.    ";
        String sentence2 ="    Java - очень крутой язык программирования.    ";
        System.out.println(sentence1);
        System.out.println(sentence2.trim());

        String line = "Good morning";
        boolean b1 = line.endsWith("morning");
        boolean b2 = line.endsWith("evening");
        System.out.println("String " + line + " ends with 'morning'?  " + b1);
        System.out.println("String " + line + " ends with 'evening'?  " + b2);
    }
}

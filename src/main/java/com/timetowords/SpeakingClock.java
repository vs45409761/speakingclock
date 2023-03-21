package com.timetowords;

public class SpeakingClock {

    public static void main(String[] args) {
        SpeakingClock t = new SpeakingClock();
       String s =  t.convertTimeToWords("14:34");

    }
    public  String  convertTimeToWords(String time){
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        if(hours < 0 || hours > 24)
            return "Time mentioned is not in Time format";

        String hourWord = getHourWord(hours);
        String minuteWord = getMinuteWord(minutes);

        return "It's " + hourWord + " " + minuteWord;
//        System.out.println(timeInWords);
//        String s = "Midday and Midnight";
//        String[] s1 = s.split(" ");
//        return "\"It's "+s1[0]+"\" and \"It's "+s1[2]+"\"";
    }

    private String getMinuteWord(int minutes) {
        String minuteWord;
        if (minutes == 0) {
            minuteWord = "o'clock";
        } else if (minutes < 10) {
            minuteWord = "oh " + convertNumberToWord(minutes);
        } else {
            minuteWord = convertNumberToWord(minutes);
        }
        return minuteWord;
    }

    private String getHourWord(int hours) {
        String hourWord = "";
        if (hours == 0) {
            hourWord = "twelve";
        } else {
            hourWord = convertNumberToWord(hours);
        }
        return hourWord;
    }

    private String convertNumberToWord(int number) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty"};

        if (number < 20) {
            return ones[number];
        } else {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            return tens[tensDigit] + (onesDigit > 0 ? " " + ones[onesDigit] : "");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //calls method with given parameters
        System.out.println(getDurationString(39425));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds) {
        //checks to make sure the wanted values are given
        if (seconds >= 0) {
            int minutes = seconds / 60;
            //all the necessary code is in the 2nd method so just pass the value and do the calculations there
            return getDurationString(minutes, seconds);
        } else {
            //if error return this message
            return "Invalid value " + seconds + " should be positive";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        //gets the modulus which is the remainder of seconds after division
        int remainingSeconds = seconds % 60;
        //checks to make sure the wanted values are given
        if (minutes >= 0 && remainingSeconds >= 0 && remainingSeconds <= 59) {
            int hour = minutes / 60;
            //no error display this message
            return hour + "h " + (minutes - ((minutes / 60) * 60)) + "m " + remainingSeconds + "s";
        } else {
            //if error return this message
            return "Invalid values, make sure both " + minutes + " and " + seconds + " are positive";
        }
    }
}
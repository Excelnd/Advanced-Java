package com.ihs.DisplaySeasonUsingSwitchCase;

public class Switches {

    public static void main(String[] args) {
        int month = 3;
        String season;

        switch(month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                season = "Monsoon";
                break;
            case 10:
            case 11:
                season = "Post-Monsoon";
                break;

            default:
                season = "Invalid Month";
        }
        System.out.println("March is in the " + season + " season.");
    }
}

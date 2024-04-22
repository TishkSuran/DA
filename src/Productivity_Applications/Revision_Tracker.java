package Productivity_Applications;

import java.util.ArrayList;
import java.util.Scanner;

public class Revision_Tracker {
    private static class StudyDetails {
        private String subject;
        private int hoursStudied;
        private int minutesStudied;

        public StudyDetails(String subject, int hoursStudied, int minutesStudied) {
            this.subject = subject;
            this.hoursStudied = hoursStudied;
            this.minutesStudied = minutesStudied;
        }

        public String getSubject() {
            return subject;
        }

        public int getHoursStudied() {
            return hoursStudied;
        }

        public int getMinutesStudied() {
            return minutesStudied;
        }
    }

    private ArrayList<StudyDetails> studyList;

    public Revision_Tracker() {
        studyList = new ArrayList<>();
    }

    public void inputStudyDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects you have studied today: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the subject: ");
            String subject = scanner.nextLine();

            System.out.println("Enter the hours studied on " + subject + " today.");
            int hoursStudied = scanner.nextInt();

            System.out.println("Enter the minutes studied on " + subject + " today.");
            int minutesStudied = scanner.nextInt();
            scanner.nextLine();

            studyList.add(new StudyDetails(subject, hoursStudied, minutesStudied));
        }
    }

    public void displayStudyDetails() {
        System.out.println("\nStudy Details:");
        for (StudyDetails study : studyList) {
            System.out.println("Subject: " + study.getSubject());
            System.out.println("Time studied: " + study.getHoursStudied() + " hours " + study.getMinutesStudied() + " minutes\n");
        }
    }
}
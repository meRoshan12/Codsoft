package codeSoft;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input : Take marks obtained in each subject
		
		System.out.print("Enter maks obtained in each subject (out of 100: )");
		int subjects = 0;
		int totalMarks = 0;
		
		while(true) {
			System.out.print("Subject "+ (subjects +1) + ": ");
			int marks = scanner.nextInt();
			
			// check if he input is valid (between 0 and 100)
			if (marks < 0 || marks > 100) {
				System.out.println("Invalid input! Marks should be between 0 and 100.");
				continue;
			}
			
			totalMarks += marks;
			subjects++;
			
			//Ask if the user wants to input marks for another subject?
			System.out.print("Do you want to enter marks for another subject (yes/no): ");
			String choice = scanner.next().toLowerCase();
			
			if(choice.equals("no")) {
				break;	
			}	
		}
		
		// Calculate total marks
		double averagePercentage = (double) totalMarks / subjects;
		
		//
		char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results: Show the total marks, average percentage, and the corresponding grade
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
		
	}
	

}

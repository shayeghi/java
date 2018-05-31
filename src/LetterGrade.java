
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LetterGrade {
	public static void main(String[] args) throws InterruptedException {
		int grade_number=1;
		int a_Grade=0;
		int b_Grade=0;
		int c_Grade=0;
		int d_Grade=0;
		int f_Grade=0;
	
		int sum =0;
	
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n%s%n%s%n",
				"1-Enter grade student between 0-100",
				"2-Type the end of your file indicator to termin your input:",
				"3-On UNIX/LINUX/MAC OS type <ctrl> d then  press enter",
				"4-On WINDOWS type <ctrl> z then press enter ");
		System.out.println("-------------------------------------------------------");
		System.out.println("Give first Student Grade in Number?");
		System.out.print("1-");
		while (input.hasNext() ) {
			int Grade = input.nextInt();
			switch (Grade/10) {
			case 9:    //grade between 90 and 100 inclusive
			case 10:
				++a_Grade;
				break;
			case 8:
				++b_Grade;
				break;
			case 7:
				++c_Grade;
				break;
			case 6:
				++d_Grade;
				break;

			default:
				++f_Grade;
				break;
			}
			++grade_number;
			sum+=Grade;
			System.out.println("Give next Student Grade in Number?");
			System.out.print(grade_number+"-");
			
			
		}
		System.out.println();
		System.out.println("Grade reaport: ");
		System.out.println("-------------------------------------------------------");

        TimeUnit.SECONDS.sleep(1);
        System.out.print("runing... "); //do some funny work runing... ;)
        System.out.print("-");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("-");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("-");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("-");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(">");
		System.out.println("-------------------------------------------------------");
		

       
        System.out.println("Total of the "+ --grade_number + " enterd is "+ sum);
		System.out.println("-------------------------------------------------------");

        System.out.println("Class average is "+(double)sum/grade_number);
		System.out.println("-------------------------------------------------------");

        System.out.println("Number of student who recieved eche grade:");
        System.out.println("Grade A: "+a_Grade);
        System.out.println("Grade B: "+b_Grade);
        System.out.println("Grade C: "+c_Grade);
        System.out.println("Grade D: "+d_Grade);
        System.out.println("Grade F: "+f_Grade);
		System.out.println("-------------------------------------------------------");

		
        input.close();
	}

}

import java.util.Scanner;

public class PolticsQuiz {
    public static void main(String[] args) {
    
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Welcome to Unofficial Politics Activism Program!");

        // Ask for length of quiz
        System.out.println("How many questions would you like to answer (1-10 questions)");
        int length = sc.nextInt();

        int score = 0;
        int choice;
        
        // Iterate through quiz
        for (int i = 1; i <= length; i++) {
           
            choice = (int)(Math.random() * 2);
            if (choice == 0) {
                // Ouputs the corresponding score based on their answer
                score += checkAnswer(multipleChoice(i));
            }
            else {
                // Ouputs the corresponding score based on their answer
                score += checkScale(likertScale(i));
            }
        }
        
        // Outputs final score
        evalscore(score);

        sc.close();
    }

    // 10 questions
    // Choice: 0
    public static String multipleChoice(int question) {
        Scanner sc = new Scanner(System.in);
        String answer;
        System.out.println("'A', 'B', 'C'");
        switch(question) {
            case 1: 
                System.out.println("What is your stance on healthcare?\nA) The government should provide universal healthcare for all citizens.\nB) The government should regulate healthcare but allow for private insurance options.\nC) The healthcare system should be primarily privatized with minimal government involvement.");
                answer = sc.nextLine();
                return answer;
            case 2:
                System.out.println("How should the U.S. address climate change?\nA) The U.S. should prioritize aggressive action on climate change, including transitioning to 100% renewable energy.\nB) The U.S. should invest in cleaner energy but balance it with economic growth and job security.\nC) The U.S. should focus on energy independence through natural resources like oil and gas while investing minimally in renewable energy.");
                answer = sc.nextLine();
                return answer;
            case 3:
                System.out.println("How should the U.S. approach foreign policy?\nA) The U.S. should focus on diplomacy and humanitarian aid, reducing military involvement abroad.\nB) The U.S. should balance diplomacy with military strength, using force when necessary but cautiously.\nC) The U.S. should maintain a strong military presence to protect its interests and allies.");
                answer = sc.nextLine();
                return answer;

            case 4:
                System.out.println("What is your position on the U.S. Supreme Court?\nA) Expand the Supreme Court to ensure a more balanced representation of ideologies.\nB) Leave the Supreme Court structure as it is, but enforce term limits or age limits for justices.\nC) Keep the Supreme Court as it is to preserve judicial independence and tradition.");
                answer = sc.nextLine();
                return answer;
            case 5:
                System.out.println("What is your view on campaign finance reform?\nA) Implement strict limits on campaign donations and eliminate super PACs to reduce corporate influence.\nB) Increase transparency in donations while allowing candidates to raise necessary funds.\nC) Keep campaign finance laws as they are to protect free speech and individual political contributions.");
                answer = sc.nextLine();
                return answer;   
            case 6:
                System.out.println("What is your view on taxation?\nA) Increase taxes on the wealthy and corporations to fund social programs and reduce income inequality.\nB) Keep a balanced tax system with moderate adjustments to ensure fairness.\nC) Lower taxes across the board to stimulate economic growth and reduce government spending.");
                answer = sc.nextLine();
                return answer;
            case 7:
                System.out.println("What should be the U.S. policy on immigration?\nA) The U.S. should provide a pathway to citizenship for undocumented immigrants and welcome more refugees.\nB) The U.S. should reform immigration to ensure both border security and fair treatment for immigrants.\nC) The U.S. should tighten border security and limit immigration to protect jobs and national security.");
                answer = sc.nextLine();
                return answer;
            case 8:
                System.out.println("How do you feel about gun control?\nA) Implement stricter gun control laws, including universal background checks and an assault weapons ban.\nB) Support reasonable regulations such as background checks but uphold the right to own firearms.\nC) Protect the Second Amendment and oppose additional gun control measures.");
                answer = sc.nextLine();
                return answer;
            case 9:
                System.out.println("What should be done about the federal minimum wage?\nA) Raise the federal minimum wage to $15 or more per hour to ensure a living wage for all workers.\nB) Adjust the minimum wage to keep pace with inflation, but allow states to set their own levels.\nC) Leave minimum wage decisions to states and businesses; government mandates harm small businesses.");
                answer = sc.nextLine();
                return answer;
            case 10:
                System.out.println("What is your stance on student loan debt?\nA) Cancel all student loan debt and provide free public college education.\nB) Implement reforms like loan forgiveness for certain groups and cap interest rates on student loans.\nC) Oppose broad debt cancellation; focus on job creation to help graduates pay off their loans.");
                answer = sc.nextLine();
                return answer;
        }
        
        return "";
    }
    
     
    // 10 questions
    // Choice: 1
    public static int likertScale(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int number;

        System.out.println("5 = Strongly Agree, 4 = Agree, 3 = Neutral, 2 = Disagree, 1 = Strongly Disagree");
        
        switch(num)
        {
            case 1: 
                System.out.println("The government should prioritize funding for social welfare programs such as healthcare and education.");
                number = sc.nextInt();
                return number;
            case 2:
                System.out.println("Climate change is a serious threat, and the government should take immediate action to address it.");
                number = sc.nextInt();
                return number;
            case 3:
                System.out.println("The U.S. economy benefits from immigration and should adopt policies that make it easier for immigrants to contribute");
                number = sc.nextInt();
                return number;
            case 4:
                System.out.println("The government should increase taxes on the wealthy to reduce income inequality.");
                number = sc.nextInt();
                return number;
            case 5:
                System.out.println("There should be stricter regulations on firearms to reduce gun violence.");
                number = sc.nextInt();
                return number;
            case 6:
                System.out.println("The U.S. should reduce its military presence abroad and focus more on diplomacy and international cooperation.");
                number = sc.nextInt();
                return number;
            case 7:
                System.out.println("The government should play a more active role in regulating large corporations to prevent monopolies and protect consumers");
                number = sc.nextInt();
                return number;
            case 8:
                System.out.println("Higher education should be free for all students in public universities and colleges.");
                number = sc.nextInt();
                return number;
            case 9:
                System.out.println("The government should protect LGBTQ+ rights and ensure equal treatment under the law.");
                number = sc.nextInt();
                return number;
            case 10:
                System.out.println("Policing in the U.S. requires significant reforms to address issues of racial bias and excessive use of force.");
                number = sc.nextInt(); 
                return number;   
        }
        
            return 0;
    }
    
    // A --> Democratic
    // B --> Republican
    public static int checkAnswer(String answer)
    {
        if (answer.equals("A") || answer.equals("a")) {
            return 1;
        }
        else if (answer.equals("B") || answer.equals("b")) {
            return 0;
        }
        else {
            return -1;
        }
    }

    // Agree --> Democratic
    // Disagree --> Republican
     public static int checkScale(int scale)
    {
        // Strongly Agree
        if (scale == 5) {
            return 3;
        }
        // Agree
        else if (scale == 4) {   
            return 1;   
        }
        // Neutral
        else if (scale == 3) {
            return 0;
        }
        // Disagree
        else if (scale == 2) {
            return -1;
         } 
         // Strongly Disagree
         else  {
            return -3;
        }
    }

    public static void evalscore(int score) {
        if (score >= 10) {
            System.out.println("Strongly Leaning Left");
        }
        else if (score >= 5) {
            System.out.println("Left");
        }
        else if (score <= 4 && score >= -4) {
            System.out.println("Moderate");

        }
         else if (score <= -5) {
            System.out.println("Right");
        }
         else {
            System.out.println("Strongly Leaning Right");
        }

    }
    
}
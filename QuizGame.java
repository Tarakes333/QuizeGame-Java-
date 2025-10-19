import java.util.*;

public class QuizGame {

    static class Question {
        String question;
        String[] options;
        char correctOption;

        Question(String question, String[] options, char correctOption) {
            this.question = question;
            this.options = options;
            this.correctOption = correctOption;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = createQuestions();

        int prize = 0;
        int[] prizeLevels = {1000, 2000, 5000, 10000, 20000, 40000, 80000, 160000, 320000, 640000,
                             1250000, 2500000, 5000000, 7500000, 10000000};

        System.out.println("Welcome to KBC Quiz Game");
        System.out.println("Answer all 15 questions correctly to win 1 Crore\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + q.question);
            System.out.println("A. " + q.options[0]);
            System.out.println("B. " + q.options[1]);
            System.out.println("C. " + q.options[2]);
            System.out.println("D. " + q.options[3]);
            System.out.print("Enter your answer (A, B, C, or D): ");

            char answer = Character.toUpperCase(sc.next().charAt(0));

            if (answer == q.correctOption) {
                prize = prizeLevels[i];
                System.out.println("Correct.. You have won:" + prize + "\n");
            } else {
                System.out.println("Wrong answer. The correct answer was " + q.correctOption);
                System.out.println("You leave with " + (i >= 5 ? prizeLevels[((i + 1) / 5) * 5 - 1] : 0));
                sc.close();
                return;
            }
        }

        System.out.println("Congratulations! You are the Crorepati!");
        sc.close();
    }

    static List<Question> createQuestions() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("Which planet is known as the Red Planet?",
                new String[]{"Earth", "Venus", "Mars", "Jupiter"}, 'C'));

        questions.add(new Question("Who was the first Prime Minister of India?",
                new String[]{"Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Patel", "Subhas Chandra Bose"}, 'A'));

        questions.add(new Question("What is the national flower of India?",
                new String[]{"Rose", "Lotus", "Sunflower", "Marigold"}, 'B'));

        questions.add(new Question("Which is the largest ocean on Earth?",
                new String[]{"Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"}, 'C'));

        questions.add(new Question("Who discovered gravity?",
                new String[]{"Albert Einstein", "Isaac Newton", "Galileo Galilei", "Nikola Tesla"}, 'B'));

        questions.add(new Question("What is the capital of Australia?",
                new String[]{"Sydney", "Melbourne", "Canberra", "Perth"}, 'C'));

        questions.add(new Question("In which year did India get independence?",
                new String[]{"1942", "1945", "1947", "1950"}, 'C'));

        questions.add(new Question("Which gas do plants absorb during photosynthesis?",
                new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"}, 'B'));

        questions.add(new Question("Who is known as the Father of the Nation in India?",
                new String[]{"Jawaharlal Nehru", "Dr. B.R. Ambedkar", "Mahatma Gandhi", "Bhagat Singh"}, 'C'));

        questions.add(new Question("Which is the smallest continent in the world?",
                new String[]{"Africa", "Australia", "Europe", "South America"}, 'B'));

        questions.add(new Question("Who invented the telephone?",
                new String[]{"Alexander Graham Bell", "Thomas Edison", "Nikola Tesla", "James Watt"}, 'A'));

        questions.add(new Question("What is the chemical symbol of water?",
                new String[]{"O2", "CO2", "H2O", "NaCl"}, 'C'));

        questions.add(new Question("Which Indian festival is also known as the Festival of Lights?",
                new String[]{"Holi", "Diwali", "Pongal", "Dussehra"}, 'B'));

        questions.add(new Question("Who wrote the Indian National Anthem?",
                new String[]{"Bankim Chandra Chatterjee", "Rabindranath Tagore", "Sarojini Naidu", "Aurobindo Ghosh"}, 'B'));

        questions.add(new Question("Which metal is liquid at room temperature?",
                new String[]{"Mercury", "Iron", "Aluminium", "Gold"}, 'A'));

        return questions;
    }
}

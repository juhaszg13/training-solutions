package week15d02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Quiz {
    List<Question> questions = new ArrayList<>();

    public void addQuestion(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tmp = reader.readLine().split(" ");
                questions.add(new Question(line, tmp[0], Integer.parseInt(tmp[1]), tmp[2]));
            }
        } catch (IOException ioe) {
            new IOException("Cannot open file", ioe);
        }
    }


    public List<String> getQuestionsBySubject(String subject) {
        List<String> result = new ArrayList<>();
        for (Question q : questions) {
            if (subject.equals(q.getSubject())) {
                result.add(q.getQuestion());
            }
        }
        return result;
    }

    public Question randomQuestion() {
        Random rnd = new Random();
        int questionNumber = rnd.nextInt(questions.size());
        return questions.get(questionNumber);
    }

    public Map<String, List<String>> questionsBySubject() {
        Map<String, List<String>> result = new HashMap<>();
        for (Question q : questions) {
            if (!result.containsKey(q.getSubject())) {
                result.put(q.getSubject(), new ArrayList<>());
            }
            result.get(q.getSubject()).add(q.getQuestion());
        }

        return result;
    }

    public Map<String, Integer> scoreSumBySubject() {
        Map<String, Integer> tmp = new HashMap<>();
        for (Question q : questions) {
            if (!tmp.containsKey(q.getSubject())) {
                tmp.put(q.getSubject(), 0);
            }
            tmp.put(q.getSubject(), tmp.get(q.getSubject()) + q.getScore());
        }
        return tmp;
    }

    public String highestScoreBySubject() {
        int max = 0;
        String subject = null;
        Map<String, Integer> scoreBySubject = new HashMap<>(scoreSumBySubject());
        for (Map.Entry<String, Integer> m : scoreBySubject.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                subject = m.getKey();
            }
        }

        return subject;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        BufferedReader reader = new BufferedReader(new InputStreamReader(Quiz.class.getResourceAsStream("questions.txt")));
        quiz.addQuestion(reader);
        System.out.println(quiz.getQuestionsBySubject("tortenelem"));
        System.out.println(quiz.randomQuestion().toString());
        System.out.println(quiz.scoreSumBySubject());
        System.out.println(quiz.highestScoreBySubject());
    }
}

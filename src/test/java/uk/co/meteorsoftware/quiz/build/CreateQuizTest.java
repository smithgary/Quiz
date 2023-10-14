package uk.co.meteorsoftware.quiz.build;

import org.junit.jupiter.api.Test;
import uk.co.meteorsoftware.quiz.model.Question;
import uk.co.meteorsoftware.quiz.model.Round;

import java.util.ArrayList;
import java.util.List;

public class CreateQuizTest {
    @Test
    public void testABuild() {
        Question q1 = new Question();
        q1.setQuestion("How big is Ballymena");
        q1.setCorrectAnswer("Massive");

        Question q2 = new Question();
        q2.setQuestion("How big is Portglenone");
        q2.setCorrectAnswer("Small but Massive");

        Question q3 = new Question();
        q3.setQuestion("How big is Ahoghill");
        q3.setCorrectAnswer("Tiny");
        List<Question> questionsR1 = List.of(q1, q2, q3);

        Round r1 = new Round();
        r1.setQuestions(questionsR1);

        Question qb1 = new Question();
        q1.setQuestion("How big is Coleraine");
        q1.setCorrectAnswer("Massive");

        Question qb2 = new Question();
        q2.setQuestion("How big is Portstewart");
        q2.setCorrectAnswer("Small but Massive");

        Question qb3 = new Question();
        q3.setQuestion("How big is Agivey");
        q3.setCorrectAnswer("Tiny");
        List<Question> questionsR2 = List.of(qb1, qb2, qb3);


        Round r2 = new Round();
        r2.setQuestions(questionsR2);

        // etc.




    }
}

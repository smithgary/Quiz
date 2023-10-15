package uk.co.meteorsoftware.quiz.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Question {
    private String question;
    private String imageLink;
    private Boolean isPictureQuestion;
    private String correctAnswer;
    private Boolean isRevealed;

}

package uk.co.meteorsoftware.quiz.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Quiz {
    List<String> users;
    List<String> markers;
    List<Round> rounds;
}

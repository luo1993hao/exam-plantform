package exam.blankquizcontext.application;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlankQuizCreateCommand {
    private String teacherId;
    private int score;
    private String answer;
}

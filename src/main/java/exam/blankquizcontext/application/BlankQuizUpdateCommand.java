package exam.blankquizcontext.application;

import exam.blankquizcontext.domain.model.blankquiz.BlankQuizId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlankQuizUpdateCommand {
    private String teacherId;
    private int score;
    private String answer;
    private BlankQuizId blankQuizId;
}

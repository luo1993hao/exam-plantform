package exam.blankquizcontext.application;

import exam.blankquizcontext.domain.model.blankquiz.BlankQuizId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlankQuizDeleteCommand {
    private BlankQuizId blankQuizId;
}

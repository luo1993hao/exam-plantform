package exam.blankquizcontext.userinterface;

import exam.blankquizcontext.domain.model.blankquiz.BlankQuizId;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BlankQuizDTO {
    private BlankQuizId blankQuizId;

    public static BlankQuizDTO from(BlankQuizId blankQuizId) {
        return new BlankQuizDTO(blankQuizId);
    }
}

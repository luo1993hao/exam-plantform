package exam.blankquizcontext.domain.model.blankquiz;

import exam.blankquizcontext.application.BlankQuizCreateCommand;
import exam.blankquizcontext.application.BlankQuizUpdateCommand;
import org.springframework.stereotype.Component;

@Component
public class BlankQuizFactory {
    public BlankQuiz create(BlankQuizId blankQuizId, BlankQuizCreateCommand blankQuizCreateCommand) {
        BlankQuiz blankQuiz = new BlankQuiz();
        blankQuiz.setAnswer(blankQuizCreateCommand.getAnswer());
        blankQuiz.setBlankQuizId(blankQuizId);
        blankQuiz.setScore(blankQuizCreateCommand.getScore());
        blankQuiz.setTeacherId(blankQuizCreateCommand.getTeacherId());
        return blankQuiz;
    }

    public BlankQuiz create(BlankQuizUpdateCommand updateCommand) {
        BlankQuiz blankQuiz = new BlankQuiz();
        blankQuiz.setAnswer(updateCommand.getAnswer());
        blankQuiz.setBlankQuizId(updateCommand.getBlankQuizId());
        blankQuiz.setScore(updateCommand.getScore());
        blankQuiz.setTeacherId(updateCommand.getTeacherId());
        return blankQuiz;
    }
}

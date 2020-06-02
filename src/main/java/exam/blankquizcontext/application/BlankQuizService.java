package exam.blankquizcontext.application;

import exam.blankquizcontext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizcontext.domain.model.blankquiz.BlankQuizId;
import exam.blankquizcontext.domain.model.blankquiz.BlankQuizRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlankQuizService {
    @Autowired
    private BlankQuizRespository blankQuizRespository;


    public BlankQuizId create(BlankQuizCreateCommand blankQuizCreateCommand) {
        BlankQuizId blankQuizId = blankQuizRespository.nextId();
        BlankQuiz blankQuiz = BlankQuiz.create(blankQuizId, blankQuizCreateCommand);
        blankQuizRespository.save(blankQuiz);
        return blankQuizId;
    }

    public void update(BlankQuizUpdateCommand blankQuizUpdateCommand) {
        BlankQuiz updateBlankQuiz = BlankQuiz.update(blankQuizUpdateCommand);
        blankQuizRespository.save(updateBlankQuiz);
    }

    public BlankQuiz findById(BlankQuizId blankQuizId) {
        return blankQuizRespository.findById(blankQuizId);
    }

    public void delete(BlankQuizDeleteCommand blankQuizDeleteCommand) {
        blankQuizRespository.delete(blankQuizDeleteCommand.getBlankQuizId());
    }
}

package exam.blankquizcontext.domain.model.blankquiz;

public interface BlankQuizRespository {
    void save(BlankQuiz blankQuiz);

    void delete(BlankQuizId blankQuizId);

    BlankQuizId nextId();

    BlankQuiz findById(BlankQuizId blankQuizId);
}

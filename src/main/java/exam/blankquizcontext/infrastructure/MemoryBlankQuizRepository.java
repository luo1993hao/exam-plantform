package exam.blankquizcontext.infrastructure;

import exam.blankquizcontext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizcontext.domain.model.blankquiz.BlankQuizId;
import exam.blankquizcontext.domain.model.blankquiz.BlankQuizRespository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class MemoryBlankQuizRepository implements BlankQuizRespository {
    private Map<BlankQuizId, BlankQuiz> blankQuizMap = new HashMap<>();

    @Override
    public void save(BlankQuiz blankQuiz) {
        blankQuizMap.put(blankQuiz.getBlankQuizId(), blankQuiz);
    }

    @Override
    public void delete(BlankQuizId blankQuizId) {
        blankQuizMap.remove(blankQuizId);
    }

    @Override
    public BlankQuizId nextId() {
        return new BlankQuizId("blankQuiz-" + UUID.randomUUID().toString());
    }

    @Override
    public BlankQuiz findById(BlankQuizId blankQuizId) {
        return blankQuizMap.get(blankQuizId);

    }
}

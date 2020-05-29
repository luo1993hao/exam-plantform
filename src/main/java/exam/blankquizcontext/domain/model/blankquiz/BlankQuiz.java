package exam.blankquizcontext.domain.model.blankquiz;

import exam.paperContext.domain.shared.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class BlankQuiz implements Entity<BlankQuiz> {
    private BlankQuizId blankQuizId;
    private String teacherId;
    private int score;
    private String answer;

    @Override
    public boolean sameIdentityAs(BlankQuiz other) {
        return this.blankQuizId.equals(other.blankQuizId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlankQuiz blankQuiz = (BlankQuiz) o;
        return Objects.equals(blankQuizId, blankQuiz.blankQuizId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blankQuizId);
    }
}

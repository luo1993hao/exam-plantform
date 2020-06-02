package exam.blankquizcontext.application;

import exam.blankquizcontext.application.BlankQuizCreateCommand;
import exam.blankquizcontext.application.BlankQuizDeleteCommand;
import exam.blankquizcontext.application.BlankQuizService;
import exam.blankquizcontext.application.BlankQuizUpdateCommand;
import exam.blankquizcontext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizcontext.domain.model.blankquiz.BlankQuizId;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlankQuizServiceTest {
    @Autowired
    private BlankQuizService blankQuizService;

    @Test
    public void should_return_blank_quiz_id_when_create_blank_given_legal_blank_quiz_command() {
        //given
        BlankQuizCreateCommand blankQuizCreateCommand = new BlankQuizCreateCommand("teacherId", 10, "answer");
        //when
        BlankQuizId blankQuizId = blankQuizService.create(blankQuizCreateCommand);
        //then
        assertThat(blankQuizId, CoreMatchers.notNullValue());
    }

    @Test
    public void should_update_blank_quiz() {
        //given
        BlankQuizCreateCommand blankQuizCreateCommand = new BlankQuizCreateCommand("teacherId", 10, "answer");
        BlankQuizId blankQuizId = blankQuizService.create(blankQuizCreateCommand);
        BlankQuizUpdateCommand blankQuizUpdateCommand = new BlankQuizUpdateCommand("teacherId", 20, "answer", blankQuizId);
        //when
        blankQuizService.update(blankQuizUpdateCommand);
        //then
        BlankQuiz blankQuiz = blankQuizService.findById(blankQuizId);
        assertThat(blankQuiz.getScore(), CoreMatchers.is(20));
    }

    @Test
    public void should_delete_blank_quiz() {
        //given
        BlankQuizCreateCommand blankQuizCreateCommand = new BlankQuizCreateCommand("teacherId", 10, "answer");
        BlankQuizId blankQuizId = blankQuizService.create(blankQuizCreateCommand);
        //when
        blankQuizService.delete(new BlankQuizDeleteCommand(blankQuizId));
        //then
        BlankQuiz blankQuiz = blankQuizService.findById(blankQuizId);
        assertThat(blankQuiz, CoreMatchers.nullValue());
    }
}

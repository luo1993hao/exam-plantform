package exam.blankquizcontext.domain.model.blankquiz;


import exam.blankquizcontext.application.BlankQuizCreateCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlankQuizTest {
    @Autowired
    private BlankQuizRespository blankQuizRespository;

    @Test
    public void should_create_blank_quiz_success() {
        //given
        final BlankQuizId blankQuizId = blankQuizRespository.nextId();
        final BlankQuizCreateCommand createCommand = new BlankQuizCreateCommand("teacherId", 100, "testAnswer");
        //when
        BlankQuiz blankQuiz = BlankQuiz.create(blankQuizId, createCommand);
        //then
        assertThat(blankQuiz, is(notNullValue()));
        assertThat(blankQuiz.getTeacherId(), is("teacherId"));
        assertThat(blankQuiz.getScore(), is(100));
        assertThat(blankQuiz.getAnswer(), is("testAnswer"));

    }

}

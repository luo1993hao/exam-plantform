package exam.blankquizcontext.userinterface;

import exam.blankquizcontext.application.BlankQuizCreateCommand;
import exam.blankquizcontext.application.BlankQuizDeleteCommand;
import exam.blankquizcontext.application.BlankQuizService;
import exam.blankquizcontext.application.BlankQuizUpdateCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blank-quiz")
public class BlankQuizController {
    private BlankQuizService blankQuizService;

    @Autowired
    public BlankQuizController(BlankQuizService blankQuizService) {
        this.blankQuizService = blankQuizService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlankQuizDTO create(@RequestBody BlankQuizCreateCommand blankQuizCreateCommand) {
        return BlankQuizDTO.from(blankQuizService.create(blankQuizCreateCommand));
    }

    @PutMapping
    public void update(@RequestBody BlankQuizUpdateCommand blankQuizUpdateCommand) {
        blankQuizService.update(blankQuizUpdateCommand);
    }

    @DeleteMapping
    public void delete(@RequestBody BlankQuizDeleteCommand blankQuizDeleteCommand) {
        blankQuizService.delete(blankQuizDeleteCommand);
    }
}

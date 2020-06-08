package guru.springframework.joke.jokeapp.controller;

import guru.springframework.joke.jokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/chuck",""})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        return"chucknorris";
    }
}

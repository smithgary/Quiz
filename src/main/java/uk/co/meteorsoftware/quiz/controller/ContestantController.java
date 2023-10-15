package uk.co.meteorsoftware.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContestantController {
    @GetMapping("/")
    public String welcome(Model modelAndView) {
        modelAndView.addAttribute("workshopName", "Rotary");
        return "welcome";
    }

    @GetMapping("/login")
    public String login(Model modelAndView) {
        modelAndView.addAttribute("workshopName", "Rotary");
        return "login";
    }

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        return "dashboard";
    }

    @GetMapping("/test_ajax")
    public String sendHtml(Model model) {
        return "testajax";
    }

    @PostMapping("/test_ajax_frag")
    public String sendHtmlFragment(Model model) {
        return "testajaxfragment";
        //return "testajaxfragment :: test_frag";
    }

    @PostMapping("load_user_admin")
    public String getQuizUserAdmin(Model model) {
        // Todo - load actual
        return "quizUserAdmin";
    }

    @PostMapping("load_quiz_admin")
    public String getQuizAdmin(Model model) {
        // Todo - load actual
        return "quizAdmin";
    }

    @PostMapping("load_quiz_results")
    public String getQuizResults(Model model) {
        // Todo - load actual
        return "quizResults";
    }

    @PostMapping("load_quiz_questions_editable")
    public String getQuizQuestionsEditable(Model model) {
        // Todo - load actual
        return "quizQuestions";
    }

    @GetMapping("/quizmaster")
    public String getQuizMasterView(Model model) {
        return "quizmaster";
    }
}

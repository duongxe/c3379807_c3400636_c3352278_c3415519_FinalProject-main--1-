package com.uon.itportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewIssueSuccessController {

    @GetMapping("/new-issue-success")
    public String newIssueSuccessMessage(Model model) {
        // Add a success message to the model
        model.addAttribute("message", "Issue successfully reported.");
        return "new_issue_success";
    }
}

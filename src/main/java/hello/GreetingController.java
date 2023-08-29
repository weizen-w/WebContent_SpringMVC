package hello;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

  @RequestMapping("/greeting")
  public String greeting(
      @RequestParam(value = "name", required = false, defaultValue = "World") String name,
      @RequestParam(value = "group", required = false, defaultValue = "noGroup") String group,
      @RequestParam(value = "description", required = false, defaultValue = "noDescription")
          String description,
      @NotNull Model model) {
    model.addAttribute("name", name);
    model.addAttribute("group", group);
    model.addAttribute("description", description);
    return "greeting";
  }
}

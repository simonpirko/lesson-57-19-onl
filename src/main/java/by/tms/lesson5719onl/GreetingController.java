package by.tms.lesson5719onl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon Pirko on 26.07.23
 */

@RestController
//@RequestMapping("/")
public class GreetingController {

  @GetMapping("/{name}")
  public String greeting(@PathVariable String name) {
    System.out.println()
    return String.format("Hello %s!", name);
  }
}

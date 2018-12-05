package hello;

import hello.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    private NameService nameService;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello") //e.g. http://localhost:8080/hello?id=1
    public String hello(@RequestParam Long id) {
        String name = nameService.getName(id);
        String message = "Hello, " + name;
        return getDiagnostics() + message;
    }

    @RequestMapping("/hello2/{id}") //e.g. http://localhost:8080/hello2/1
    public String hello2(@PathVariable Long id) {
        String name = nameService.getName(id);
        String message = "Hello2, " + name;
        return getDiagnostics() + message;
    }

    private String getDiagnostics() {
        String diagnostics = "(nameservice=" + nameService.getClass().getCanonicalName() + ") ";
        return diagnostics;
    }
}

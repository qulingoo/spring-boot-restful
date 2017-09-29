package hello;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/users/{username}",method = RequestMethod.GET,consumes="application/json")
    public String getUser(@PathVariable String username, @RequestParam String pwd){
        return "Welcome,"+username;
    }}
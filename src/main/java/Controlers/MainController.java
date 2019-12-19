package Controlers;


import repository.UserRepository;
import Classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody User addNewUser (User user) {

      return  userRepository.save(user);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}

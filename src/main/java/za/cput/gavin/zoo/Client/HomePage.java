package za.cput.gavin.zoo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavin.ackerman on 2016-08-20.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage
{
    @Autowired
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String Index()
    {
        return "Welcome to the home page of the Zoo tracking App";
    }
}

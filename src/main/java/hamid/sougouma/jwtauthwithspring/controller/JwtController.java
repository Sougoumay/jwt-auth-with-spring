package hamid.sougouma.jwtauthwithspring.controller;

import hamid.sougouma.jwtauthwithspring.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class JwtController {

    @Autowired
    private JwtService jwtService;

    public void createJwtToken()
    {

    }
}

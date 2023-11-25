/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis01.SRP_MovieDB.MovieController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author digis
 */
@Controller
public class ControllerMovie {
    
    @GetMapping ("/peliculas")
    public String VistaPelicula (){
    
        return "vista";
    
    }
     @GetMapping ("/logpeliculas")
    public String loginPelicula (){
    
        return "login";
    
    }

 @GetMapping ("/airingtv")
    public String vistaTv (){
    
        return "vistaTv";
    
    }
}


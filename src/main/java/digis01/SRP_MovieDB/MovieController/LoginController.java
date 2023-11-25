/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis01.SRP_MovieDB.MovieController;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author digis
 */
@Controller
public class LoginController {
    
    @GetMapping
    public String Login() {
        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("https://api.themoviedb.org/3/authentication/token/validate_with_login?api_key=a1de99b16689ad2a51b4423b2a934f9b", responseType);
//        JSONObject requestToken = new JSONObject(result);
//        if (requestToken.getBoolean("succec")) {
//            String rerequestBody = "{\"username\":\"Sheyla Rivera\", \"password\": \"Welcome01$$$@\"}";
//            HttpEntity<String> entityRequestToken = new HttpEntity<>(rerequestBody);
//            String jsonResponseRT = restTemplate.postForObject("https://api.themoviedb.org/3/authentication/token/validate_with_login?api_key=a1de99b16689ad2a51b4423b2a934f9b", result, responseType);
//            JSONObject responseTokenValidate = new JSONObject(jsonResponseRT);
//            
//            if (responseTokenValidate.getBoolean("succes")) {
//                String sessionId = "{\request_token\"}: \"" + responseTokenValidate.getString("request_token"); 
//                String jsonResponseSI=restTemplate.postForObject("https://api.themoviedb.org/3/authentication/token/new?api_key=a1de99b16689ad2a51b4423b2a934f9b", result, responseType);
//            }
//        }
        return "inicio";
        
    }
    
}

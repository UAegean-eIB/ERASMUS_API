package gr.aegean.aasConnector.controllers;

import gr.aegean.aasConnector.model.AasUser;
import gr.aegean.aasConnector.model.UserApplication;
import gr.aegean.aasConnector.repo.UserApplicationRepo;
import gr.aegean.aasConnector.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

@RestController
@RequestMapping("applications")
@Slf4j
public class restControllers {

    @Autowired
    UserApplicationRepo applicationRepo;

    @Autowired
    UserRepo userRepo;

    @GetMapping("/getUserStatus")
    public @ResponseBody boolean getUserStatus(@RequestParam String eid){
       AtomicBoolean result = new AtomicBoolean(false);
       Optional<AasUser> requestedUser = userRepo.findByLogin(eid);
       if(requestedUser.isPresent()){
            Optional<UserApplication> matcingApplicaiton = applicationRepo.findByUserId(requestedUser.get().getId());
           matcingApplicaiton.ifPresent(userApplication ->
                   result.set(userApplication.getSubmissionStatus().equals("APPROVED")));
       }


        return result.get();
    }
}

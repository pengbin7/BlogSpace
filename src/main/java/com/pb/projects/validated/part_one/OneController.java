package com.pb.projects.validated.part_one;

import com.pb.projects.validated.part_one.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author pengbin
 * @date 2020/7/20 16:28
 */
@RestController
public class OneController {


    @PostMapping("/one")
    public String post(@Valid @RequestBody User user, BindingResult errors){
        if(errors.hasErrors()){
            return "post error";
        }
        return "post success";
    }

    @GetMapping("/one")
    public String get(@Validated @RequestBody User user){
        return "get success";
    }

    @PutMapping("/one")
    public String put(@Validated @RequestBody User user){
        return "put success";
    }

    @DeleteMapping("/one")
    public String del(@Validated @RequestBody User user){
        return "del success";
    }

}

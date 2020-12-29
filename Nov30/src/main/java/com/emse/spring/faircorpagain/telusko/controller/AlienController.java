package com.emse.spring.faircorpagain.telusko.controller;

import com.emse.spring.faircorpagain.telusko.Maulik;
import com.emse.spring.faircorpagain.telusko.dao.AlienRepo;
import com.emse.spring.faircorpagain.telusko.dao.AlienRepoJpaCrud;
import com.emse.spring.faircorpagain.telusko.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class AlienController {

    @RequestMapping("/home")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/anindaHtml")
    public String html(){
        return "index.html";
    }

    @RequestMapping("/ResponseBodyIntroduced")
    @ResponseBody
    public String ResponseBodyIntroduced(){
        return "ResponseBodyIntroduced";
    }
    @RequestMapping("/manualPageServingConfigurationJsp")
    public String manualPageServingConfigurationJsp(){
        return "manualPageServingConfigurationJsp";
    }

    @RequestMapping("/manualPageServingConfigurationHtml")
    public String manualPageServingConfigurationHtml(){
        return "manualPageServingConfigurationHtml";
    }

   @RequestMapping("/learningMV")
    public ModelAndView learningMV(@RequestParam("name") String myName){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",myName);

        mv.setViewName("learningMV");
        return mv;

    }

    @RequestMapping("/learningMV4Multiple")
    public ModelAndView learningMV4Multiple(Maulik maulik){
        ModelAndView mv=new ModelAndView();
        mv.addObject("maulikObject",maulik);

        mv.setViewName("learningMV4Multiple");
        return mv;

    }

    @RequestMapping("/learningDatabase")
    public String learningDatabase(){
        return "learningH2.jsp";
    }

    @Autowired
    AlienRepo alienRepo;

    @RequestMapping("/addAlien")
    public String addingAlien(Alien alien){

        alienRepo.save(alien);

        return "learningH2.jsp";
    }

    @RequestMapping("/getAlien")
    public ModelAndView gettingAlien(@RequestParam int aid){

        ModelAndView mv=new ModelAndView("showAlien.jsp");

        Alien alien=alienRepo.findById(aid).orElse(new Alien());

        System.out.println(alienRepo.findByTech("Java"));
        System.out.println(alienRepo.findByTech("Python and Java"));
        System.out.println(alienRepo.findByTech("Java and Python"));
        System.out.println(alienRepo.findByTech("Parasytology"));

        System.out.println(alienRepo.findByAidGreaterThan(102));

        System.out.println(alienRepo.findByTechSorted("Java"));


        mv.addObject(alien);

        return mv;
    }
    @RequestMapping("/getAlien/{aid}")
    @ResponseBody
    public String gettingAlienFromREST(@PathVariable("aid") int aid){

        return alienRepo.findById(aid).toString();
    }

    @RequestMapping("/getAliens")
    @ResponseBody
    public String gettingAllAliensFromREST(){

        return alienRepo.findAll().toString();
    }

    @Autowired
    AlienRepoJpaCrud alienRepoJpaCrud;



    @RequestMapping("/getAlienJpa/{aid}")
    @ResponseBody
    public Optional<Alien> gettingAlienFromRESTJpaRepo(@PathVariable("aid") int aid){

        return alienRepoJpaCrud.findById(aid);
    }

    @RequestMapping(path="/getAliensJpa",produces = {"application/xml"})
    @ResponseBody
    public List<Alien> gettingAllAliensFromRESTJpaRepo(){

        return alienRepoJpaCrud.findAll();
    }

    @PostMapping("/getAliensJpa")
    @ResponseBody
    public Alien postingAllAliensFromRESTJpaRepo(Alien alien){

        alienRepo.save(alien);

        return alien;
    }

    @PostMapping("/getAliensJpaNotParamsButRAW")
    @ResponseBody
    public Alien postingAllAliensFromRESTJpaRepoNotParamsButRAW(@RequestBody Alien alien){

        alienRepo.save(alien);

        return alien;
    }

    @DeleteMapping("/getAliensJpaNotParamsButRAW/{aid}")
    @ResponseBody
    public String deletingAlienFromRESTJpaRepoNotParamsButRAW(@PathVariable("aid") int aid){

        Alien a=alienRepoJpaCrud.getOne(aid);

        alienRepoJpaCrud.delete(a);

        return "deleted";
    }

    @PutMapping("/getAliensJpaNotParamsButRAW")
    @ResponseBody
    public Alien putAliensFromRESTJpaRepoNotParamsButRAW(@RequestBody Alien alien){

        alienRepo.save(alien);

        return alien;
    }

}

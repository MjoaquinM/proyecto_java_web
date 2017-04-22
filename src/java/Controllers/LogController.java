/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Data;
import Models.DataModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author martin
 */
@Controller
public class LogController {
    
    @RequestMapping(value = "showTransaction", method=RequestMethod.GET)
    public ModelAndView showTransaction(@RequestParam(value="id") int id) 
    {
        ModelAndView mav=new ModelAndView();
        mav.setViewName("log/showTransaction");
        DataModel model = new DataModel();
        Data dtx = new Data();
        
        System.out.println("EL ID QUE LLEGO COMO PARAMATRO ES: " + id);
        
        dtx = model.getDtx(id);
        System.out.println("EL ID DE LA TX ES: "+dtx);
        
        mav.addObject("dtx", dtx);
        
        return mav;
    }
    
}
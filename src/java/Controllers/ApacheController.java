/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author martin
 */
@Controller
public class ApacheController {
    
    @RequestMapping(value = "stopApache.htm")
    public ModelAndView stopApache() throws InterruptedException, IOException
    {
        String cmd = "pkexec sudo /etc/init.d/apache2 stop";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        pr.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "startApache.htm")
    public ModelAndView startApache() throws InterruptedException, IOException
    {
        String cmd = "pkexec sudo /etc/init.d/apache2 start";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        pr.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "reloadApache.htm")
    public ModelAndView reloadApache() throws InterruptedException, IOException
    {
        String cmd = "pkexec sudo /etc/init.d/apache2 reload";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        pr.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
        return new ModelAndView("redirect:/index.htm");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
public class AdminController {

    @RequestMapping(value = "adminModSecurity", method = RequestMethod.GET)
    public ModelAndView AdminModSecurity() throws IOException {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin/adminModSecurity");
        return mav;
    }

    @RequestMapping(value = "setVariables", method = RequestMethod.GET)
    public ModelAndView setVariables(@RequestParam(value = "SecRuleEngine") String SecRuleEngine) throws FileNotFoundException, IOException, InterruptedException {

        String cadena, arch = "";
        FileReader fr = new FileReader("/etc/modsecurity/modsecurity.conf");
        BufferedReader br = new BufferedReader(fr);

        File f;
        f = new File("/home/martin/Desktop/modsecurity.conf");

        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);

            while ((cadena = br.readLine()) != null) { 
                if (!cadena.isEmpty()) {
                    if (cadena.charAt(0) != '#') {
                        if (cadena.contains("SecRuleEngine")) {
                            cadena = "SecRuleEngine " + SecRuleEngine;
                        }
                    }
                }
                wr.append(cadena + "\n");
                arch = arch + cadena + "<br/>";
            }
            wr.close();
            bw.close();

        } catch (IOException e) {
        };
        br.close();
//        
        
        String cmd = "pkexec --user root /home/martin/Desktop/script.sh";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        pr.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line = buf.readLine()) != null) {
            System.out.println(line);
        }
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin/adminModSecurity");
        mav.addObject("msc", arch);
        mav.addObject("sel", SecRuleEngine);
        return mav;
    }

}

package com.example.data1700_oblig3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class KinoController {

    //Array hvor billettene skal lagres
    private  final List<Billett> liste=new ArrayList<>();
    @GetMapping("/hentFilmer")
    public List<Film> hentefilm(){
        List<Film> listMedFilmer=new ArrayList<>();
        listMedFilmer.add(new Film("Barbie"));
        listMedFilmer.add(new Film("Black panther"));
        listMedFilmer.add(new Film("the rookie"));
        return listMedFilmer;
    }

    @PostMapping("/lagre")
    public void lagre(Billett biletter1){
        liste.add(biletter1);
    };



    @GetMapping("/hentalle")
    public List<Billett> hentAlle(){
        return liste;
    }

    @GetMapping("/slettAlle")
    public void selttAlle(){
        liste.clear();
    }


}

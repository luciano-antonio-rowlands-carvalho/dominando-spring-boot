package test.outside;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v0")
public class Exercise01GetMappingV0 {

    AnimesV0 animes = new AnimesV0();

    @GetMapping("animes")
    public List<String> getAnimes(){
        ArrayList<String> animeList = animes.getAnimes();
        return animeList;
    }

}


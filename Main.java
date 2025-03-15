package Intro.odevhafta4;


import Intro.odevhafta4.entity.ProgrammingLanguage;
import Intro.odevhafta4.entity.Technology;
import Intro.odevhafta4.repository.concrete.inmemory.InMemoryPLRepository;
import Intro.odevhafta4.repository.concrete.inmemory.InMemoryTechnologyRepository;
import Intro.odevhafta4.service.concrete.ProgramingLanguageImpl;
import Intro.odevhafta4.service.concrete.TechnologyImpl;

public class Main {
    public static void main(String[] args) {

        InMemoryPLRepository programmingLanguageRepository = new InMemoryPLRepository();
        InMemoryTechnologyRepository technologyRepository = new InMemoryTechnologyRepository();


        ProgramingLanguageImpl programmingLanguageService = new ProgramingLanguageImpl(programmingLanguageRepository);
        TechnologyImpl technologyService = new TechnologyImpl(technologyRepository);


        ProgrammingLanguage java = new ProgrammingLanguage(1, "Java");
        programmingLanguageService.add(java);


        Technology spring = new Technology(1, "Spring", java);
        technologyService.add(spring);

        System.out.println("All Programming Languages:");
        for (ProgrammingLanguage pl : programmingLanguageService.getAll()) {
            System.out.println(pl.getName());
        }


        System.out.println("All Technologies Names:");
        for (Technology tech : technologyService.getAll()) {
            System.out.println(tech.getName());
        }
    }
}
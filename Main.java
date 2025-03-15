package Intro.odevhafta4;


import Intro.odevhafta4.entity.ProgrammingLanguage;
import Intro.odevhafta4.entity.Technology;
import Intro.odevhafta4.repository.concrete.inmemory.InMemoryPLRepository;
import Intro.odevhafta4.repository.concrete.inmemory.InMemoryTechnologyRepository;
import Intro.odevhafta4.service.concrete.ProgramingLanguageImpl;
import Intro.odevhafta4.service.concrete.TechnologyImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InMemoryPLRepository programmingLanguageRepository = new InMemoryPLRepository();
        InMemoryTechnologyRepository technologyRepository = new InMemoryTechnologyRepository();


        ProgramingLanguageImpl programmingLanguageService = new ProgramingLanguageImpl(programmingLanguageRepository);
        TechnologyImpl technologyService = new TechnologyImpl(technologyRepository);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a programming language name:");
        String languageName = scanner.nextLine();
        System.out.println("Please enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Programimng Language: " + languageName + " Id: " + id);
        System.out.println("Please enter a technology name:");
        String technologyName = scanner.nextLine();
        System.out.println("Please enter id: ");
        int id2 = scanner.nextInt();
        System.out.println("Technology: " + technologyName + " Id: " + id2);

        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(id, languageName);
        programmingLanguageService.add(programmingLanguage);
        Technology technology = new Technology(id2, technologyName, programmingLanguage);
        technologyService.add(technology);


        System.out.println("All Programming Languages:");
        for (ProgrammingLanguage pl : programmingLanguageService.getAll()) {
            System.out.println(pl.getName() + " Id: " + pl.getId());
        }


        System.out.println("All Technologies Names:");
        for (Technology tech : technologyService.getAll()) {
            System.out.println(tech.getName() + " Id: " + tech.getId() + " Programming Language: " + tech.getProgrammingLanguage().getName());
        }
    }
}
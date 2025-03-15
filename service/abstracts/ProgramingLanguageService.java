package Intro.odevhafta4.service.abstracts;

import Intro.odevhafta4.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    List<ProgrammingLanguage> getLanguages();

    void add(ProgrammingLanguage programmingLanguage);
    void update(int index , ProgrammingLanguage programmingLanguage);
    void delete(int id);
    ProgrammingLanguage getById(int id);
    List<ProgrammingLanguage> getAll();
}

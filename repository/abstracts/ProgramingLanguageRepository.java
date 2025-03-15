package Intro.odevhafta4.repository.abstracts;

import Intro.odevhafta4.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgramingLanguageRepository {

    void add(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    void delete(int programmingLanguage);
    void update(int index , ProgrammingLanguage programmingLanguage);
    void getById(int id);
}

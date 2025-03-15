package Intro.odevhafta4.service.concrete;

import Intro.odevhafta4.entity.ProgrammingLanguage;
import Intro.odevhafta4.repository.abstracts.ProgramingLanguageRepository;
import Intro.odevhafta4.service.abstracts.ProgramingLanguageService;

import java.util.List;

public class ProgramingLanguageImpl implements ProgramingLanguageService {

    private ProgramingLanguageRepository programingLanguageRepository;

    public ProgramingLanguageImpl(ProgramingLanguageRepository programingLanguageRepository){
        this.programingLanguageRepository = programingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getLanguages() {
        return programingLanguageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programingLanguageRepository.add(programmingLanguage);

    }

    @Override
    public void update( int index , ProgrammingLanguage programmingLanguage) {
        programingLanguageRepository.update(index,programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programingLanguageRepository.delete(id);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        System.out.println("Getting element by id.");
        for (ProgrammingLanguage item: programingLanguageRepository.getAll()){
            if(item.getId()==id){
                System.out.println(item);
                return item;
            }
        }
        return  null;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programingLanguageRepository.getAll();
    }
}

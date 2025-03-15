package Intro.odevhafta4.repository.concrete.inmemory;

import Intro.odevhafta4.entity.ProgrammingLanguage;
import Intro.odevhafta4.entity.Technology;
import Intro.odevhafta4.repository.abstracts.TechnologyRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTechnologyRepository implements TechnologyRepository {
    private List<Technology> technologies;

    public InMemoryTechnologyRepository(){
        technologies = new ArrayList<>();
        //Seed Data
        //technologies.add(new Technology(2,"Java Spring",new ProgrammingLanguage(2,"Java")));
    }

    @Override
    public void add(Technology technology) {
        System.out.println("Adding technology to in-memory.");
        technologies.add(technology);
    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }

    @Override
    public void delete(int technology) {
        technologies.remove(technology);
    }

    @Override
    public void update(int index, Technology technology) {
        technologies.set(index,technology);

    }

    @Override
    public void getById(int id) {System.out.println("Getting element by id.");
        for (Technology item: technologies){
            if(item.getId()==id){
                System.out.println(item);
                return;
            }
        }
    }
}

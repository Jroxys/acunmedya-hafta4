package Intro.odevhafta4.service.concrete;

import Intro.odevhafta4.entity.Technology;
import Intro.odevhafta4.repository.abstracts.TechnologyRepository;
import Intro.odevhafta4.service.abstracts.TechnologyService;

import java.util.List;

public class TechnologyImpl implements TechnologyService {

    private TechnologyRepository technologyRepository;

    public TechnologyImpl(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public void add(Technology technology) {
        technologyRepository.add(technology);
    }

    @Override
    public void update(int index, Technology technology) {
        technologyRepository.update(index,technology);
    }

    @Override
    public void delete(int id) {
        technologyRepository.delete(id);
    }

    @Override
    public Technology getById(int id) {
        System.out.println("Getting element by id.");
        for (Technology item : technologyRepository.getAll()) {
            if (item.getId() == id) {
                System.out.println(item);
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Technology> getAll() {
        return technologyRepository.getAll();
    }
}
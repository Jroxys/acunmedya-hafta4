package Intro.odevhafta4.service.abstracts;

import Intro.odevhafta4.entity.Technology;

import java.util.List;

public interface TechnologyService {
    void add(Technology technology);
    void update(int index, Technology technology);
    void delete(int id);
    Technology getById(int id);
    List<Technology> getAll();
}

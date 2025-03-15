    package Intro.odevhafta4.repository.concrete.inmemory;

    import Intro.odevhafta4.entity.ProgrammingLanguage;
    import Intro.odevhafta4.repository.abstracts.ProgramingLanguageRepository;

    import java.util.ArrayList;
    import java.util.List;

    public class InMemoryPLRepository implements ProgramingLanguageRepository {
        private List<ProgrammingLanguage> programmingLanguages;

        public InMemoryPLRepository(){
            programmingLanguages = new ArrayList<>();
            //Seed Data
            //programmingLanguages.add(new ProgrammingLanguage(5,"Java"));
        }
        @Override
        public void add(ProgrammingLanguage programmingLanguage){
            System.out.println("Adding language to in-memory.");
            programmingLanguages.add(programmingLanguage);
        }
        @Override
        public List<ProgrammingLanguage> getAll(){
            System.out.println("Getting all languages from memory.");
            return programmingLanguages;
        }
        @Override
        public void delete(int programmingLanguage){
            System.out.println("Deleting language from memory.");
            programmingLanguages.remove(programmingLanguage);
        }
        @Override
        public void update(int index ,ProgrammingLanguage programmingLanguage){
            System.out.println("Updating language from memory");
            programmingLanguages.set(index,programmingLanguage);
        }
        @Override
        public void getById(int id){
            System.out.println("Getting element by id.");
            for (ProgrammingLanguage item: programmingLanguages){
                if(item.getId()==id){
                    System.out.println(item);
                    return;
                }
            }
        }
    }

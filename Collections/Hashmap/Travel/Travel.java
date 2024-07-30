package Collections.Hashmap.Travel;

import java.util.HashMap;
import java.util.Map;

public class Travel{
    private Map<String, Person> personMap;

    public Travel(){
        personMap = new HashMap<>();
    }
    public void addPackage(Person per){
        personMap.put(per.getPersonID(),per);
    }
    public Person retrievePerson(String personId){
        return personMap.get(personId);
    }
    public Person removePackage(String personId){
        return personMap.remove(personId);
    }

}

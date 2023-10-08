package Övn9bLive_demo2022_distans;


import java.util.ArrayList;
import java.util.List;

public class FilterUtil {
    public boolean findTallPeople(Person p) {
        return (p.getLength() >= 200);

    }

    public List<Person> getTallPeopleList(List<Person> personList) {
        List<Person> res = new ArrayList<>();
        for (Person p : personList){
            if (findTallPeople(p)){
                res.add(p);
            }
        }
        return res;
    }
}

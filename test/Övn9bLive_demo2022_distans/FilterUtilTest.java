package Övn9bLive_demo2022_distans;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilterUtilTest {

    FilterUtil fu = new FilterUtil();
    Person kortis = new Person("Kalle", "Xvägen", "12345 Ystad", 25, 80, 175);
    Person långis = new Person("Nisse", "Xvägen", "12345 Ystad", 25, 80, 275);

    List<Person> personList = List.of(kortis, långis);


    @Test
    public void findTallPeopleTest(){
        assert(!fu.findTallPeople(kortis));
        assert(fu.findTallPeople(långis));
    }

    @Test
    public void getTallPeopleListTest(){
        assert(fu.getTallPeopleList(personList).size() == 1);
        assert(fu.getTallPeopleList(personList).get(0).getName().equals("Nisse"));
        assert(fu.getTallPeopleList(personList).get(0).getLength()== 275);
    }


  //  Gå igenom lista
  //  Hitta långa männsiskor
  //  List<Person> getTallPeople(List<Person> alla)



}

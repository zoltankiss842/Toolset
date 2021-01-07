package data;

import java.util.Comparator;

public class PersonComparator implements Comparator<Object> {

    @Override
    public int compare(Object o, Object t1) {
        if(o instanceof Person && t1 instanceof Person){

            Person person = (Person) o;
            Person person2 = (Person) t1;

            if(person.getFirstName().compareTo(person2.getFirstName()) > 0){
                return 1;
            }
            else if(person.getFirstName().compareTo(person2.getFirstName()) < 0){
                return -1;
            }
            else{
                if(person.getLastName().compareTo(person2.getLastName()) > 0){
                    return 1;
                }
                else if(person.getLastName().compareTo(person2.getLastName()) < 0){
                    return -1;
                }
                else{
                    if(person.getAge() > person2.getAge()){
                        return 1;
                    }
                    else if(person.getAge() < person2.getAge()){
                        return -1;
                    }
                }
            }

            return 0;
        }

        return 0;
    }
}

package pasiranjestringova;
 
 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
 
public class PasiranjeStringova {
     public static void main(String[] args) {
     List<person> retVal = new ArrayList<person>();
 
                String persons = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
 
                String[] personsSplit = persons.split(" ");
                for (int i = 0; i < personsSplit.length; i++) {
                        String[] personData = personsSplit[i].split("/");
                        String[] firstLastName = personData[0].split("\\.");
 
                        person newPerson = new person(firstLastName[0], firstLastName[1],
                                        personData[2], personData[1]);
                        retVal.add(newPerson);
                }
 
                for (int i = 0; i < retVal.size(); i++) {
                        String outputString = "Person " + i + ": "
                                        + retVal.get(i).getName() + " "
                                        + retVal.get(i).getLastName() + ", "
                                        + retVal.get(i).getDateBirth() + ", "
                                        + retVal.get(i).getPlace() + ";";
                       
                        System.out.println(outputString);
                }
       
  }
   
}

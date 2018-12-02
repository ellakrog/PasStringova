/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasiranjestringova;

/**
 *
 * @author MULTINORM-USR-78
 */
public class person {
   private String name;
        private String lastName;
        private String place;
        private String dateBirth;
 
        person(String name, String lastName, String place, String dateBirth) {
                this.name = name;
                this.lastName = lastName;
                this.place = place;
                this.dateBirth = dateBirth;
 
        }
 
        public String getName() {
                return name;
        }
 
        public void setName(String name) {
                this.name = name;
        }
 
        public String getLastName() {
                return lastName;
        }
 
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
 
        public String getPlace() {
                return place;
        }
 
        public void setPlace(String place) {
                this.place = place;
        }
 
        public String getDateBirth() {
                return dateBirth;
        }
 
        public void setDateBirth(String dateBirth) {
                this.dateBirth = dateBirth;
        }
}

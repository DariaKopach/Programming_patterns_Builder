/*
 *
 * Classname: Student
 *
 * @version 13.06.2020
 *
 * @author Kopach Daria
 *
 * Description:Programming patterns. Builder
 *
 *
 */

package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String otherNames;
    private LocalDate birthday;
    private Gender gender;
    private String passportNumber;
    private String taxIdNumber;
    private String registrationAddress;
    private String email;
    private String phoneNumber;
    private String numberInCaseOfEmergency;
    private boolean privilege;
    private boolean contract;
    private boolean isUkrainian;
    private boolean fullTime;
    private boolean isMilitary;
    private Faculty faculty;
    private Speciality speciality;
    private String groupNumber;
    private String NameOfGroupLeader;
    private String lastNameOfGroupLeader;
    private String phoneNumberOfGroupLeader;
    private SportsClubs sportsClubs;
    private boolean scienceWork;
    private boolean inUniversityBoard;
    private boolean isDriverLicense;
    private boolean liveInDorm;


    /**
     * Class constructor without parameters
     */

    public Student() {
    }

    /**
     * Constructor for Student object
     *
     * @param firstName                String type. Student's first name
     * @param lastName                 String type. Student's last name
     * @param otherNames               String type. Student's other names
     * @param birthday                 LocalDate type. Student's birthday
     * @param gender                   Gender enum object type. Student's gender
     * @param passportNumber           String type. Student's passport data
     * @param taxIdNumber              String type. Student's tax id number
     * @param registrationAddress      String type.
     *                                 Student's registration address
     * @param email                    String type. Student's email
     * @param phoneNumber              String type. Student's phone number
     * @param numberInCaseOfEmergency  String type. Number in case of emergency
     * @param privilege                boolean type. Does privilege or not
     * @param contract                 boolean type. Contract / budget
     * @param isUkrainian              boolean type. Nationality
     * @param fullTime                 boolean type. full / part time job
     * @param isMilitary               boolean type. Military / or not
     * @param faculty                  Faculty enum object type.
     *                                 Student's faculty
     * @param speciality               Speciality enum object type.
     *                                 Student's speciality
     * @param groupNumber              String type. Student's groupNumber
     * @param nameOfGroupLeader        String type. Name Of Group Leader
     * @param lastNameOfGroupLeader    String type. Last Name Of Group Leader
     * @param phoneNumberOfGroupLeader String type. PhoneNumberOfGroupLeader
     * @param sportsClubs              SportsClubs enum object type.
     *                                 Student's sports Clubs
     * @param scienceWork              boolean type. Science Work or not
     * @param inUniversityBoard        boolean type. In University Board or not
     * @param isDriverLicense          boolean type. Is Driver License or not
     * @param liveInDorm               boolean type. live In Dorm or not
     */

    public Student(String firstName,
                   String lastName,
                   String otherNames,
                   LocalDate birthday,
                   Gender gender,
                   String passportNumber,
                   String taxIdNumber,
                   String registrationAddress,
                   String email, String phoneNumber,
                   String numberInCaseOfEmergency,
                   boolean privilege,
                   boolean contract,
                   boolean isUkrainian,
                   boolean fullTime,
                   boolean isMilitary,
                   Faculty faculty,
                   Speciality speciality,
                   String groupNumber,
                   String nameOfGroupLeader,
                   String lastNameOfGroupLeader,
                   String phoneNumberOfGroupLeader,
                   SportsClubs sportsClubs,
                   boolean scienceWork,
                   boolean inUniversityBoard,
                   boolean isDriverLicense,
                   boolean liveInDorm) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.otherNames = otherNames;
        this.birthday = birthday;
        this.gender = gender;
        this.passportNumber = passportNumber;
        this.taxIdNumber = taxIdNumber;
        this.registrationAddress = registrationAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.numberInCaseOfEmergency = numberInCaseOfEmergency;
        this.privilege = privilege;
        this.contract = contract;
        this.isUkrainian = isUkrainian;
        this.fullTime = fullTime;
        this.isMilitary = isMilitary;
        this.faculty = faculty;
        this.speciality = speciality;
        this.groupNumber = groupNumber;
        NameOfGroupLeader = nameOfGroupLeader;
        this.lastNameOfGroupLeader = lastNameOfGroupLeader;
        this.phoneNumberOfGroupLeader = phoneNumberOfGroupLeader;
        this.sportsClubs = sportsClubs;
        this.scienceWork = scienceWork;
        this.inUniversityBoard = inUniversityBoard;
        this.isDriverLicense = isDriverLicense;
        this.liveInDorm = liveInDorm;
    }

    // 2. Generate getters/setters for all parameters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberInCaseOfEmergency() {
        return numberInCaseOfEmergency;
    }

    public void setNumberInCaseOfEmergency(String numberInCaseOfEmergency) {
        this.numberInCaseOfEmergency = numberInCaseOfEmergency;
    }

    public boolean isPrivilege() {
        return privilege;
    }

    public void setPrivilege(boolean privilege) {
        this.privilege = privilege;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    public boolean isUkrainian() {
        return isUkrainian;
    }

    public void setUkrainian(boolean ukrainian) {
        isUkrainian = ukrainian;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getNameOfGroupLeader() {
        return NameOfGroupLeader;
    }

    public void setNameOfGroupLeader(String nameOfGroupLeader) {
        NameOfGroupLeader = nameOfGroupLeader;
    }

    public String getLastNameOfGroupLeader() {
        return lastNameOfGroupLeader;
    }

    public void setLastNameOfGroupLeader(String lastNameOfGroupLeader) {
        this.lastNameOfGroupLeader = lastNameOfGroupLeader;
    }

    public String getPhoneNumberOfGroupLeader() {
        return phoneNumberOfGroupLeader;
    }

    public void setPhoneNumberOfGroupLeader(String phoneNumberOfGroupLeader) {
        this.phoneNumberOfGroupLeader = phoneNumberOfGroupLeader;
    }

    public SportsClubs getSportsClubs() {
        return sportsClubs;
    }

    public void setSportsClubs(SportsClubs sportsClubs) {
        this.sportsClubs = sportsClubs;
    }

    public boolean isScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(boolean scienceWork) {
        this.scienceWork = scienceWork;
    }

    public boolean isInUniversityBoard() {
        return inUniversityBoard;
    }

    public void setInUniversityBoard(boolean inUniversityBoard) {
        this.inUniversityBoard = inUniversityBoard;
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public boolean isLiveInDorm() {
        return liveInDorm;
    }

    public void setLiveInDorm(boolean liveInDorm) {
        this.liveInDorm = liveInDorm;
    }


    /**
     * Method to get formatted Student
     *
     * @return Returns info about Student
     */

    @Override
    public String toString() {
        return "Student {" +
                "firstName = '" + firstName +
                ", \n lastName = '" + lastName +
                ", \n otherNames = '" + otherNames +
                ", \n birthday = " + birthday +
                ", \n gender = " + gender +
                ", \n passportNumber = '" + passportNumber +
                ", \n taxIdNumber = '" + taxIdNumber +
                ", \n registrationAddress = '" + registrationAddress +
                ", \n email = '" + email +
                ", \n phoneNumber = '" + phoneNumber +
                ", \n numberInCaseOfEmergency = '" + numberInCaseOfEmergency +
                ", \n privilege = " + privilege +
                ", \n contract = " + contract +
                ", \n isUkrainian = " + isUkrainian +
                ", \n fullTime = " + fullTime +
                ", \n isMilitary = " + isMilitary +
                ", \n faculty = " + faculty +
                ", \n speciality = " + speciality +
                ", \n groupNumber = '" + groupNumber +
                ", \n NameOfGroupLeader = '" + NameOfGroupLeader +
                ", \n lastNameOfGroupLeader = '" + lastNameOfGroupLeader +
                ", \n phoneNumberOfGroupLeader = '" + phoneNumberOfGroupLeader +
                ", \n sportsClubs = " + sportsClubs +
                ", \n scienceWork = " + scienceWork +
                ", \n inUniversityBoard = " + inUniversityBoard +
                ", \n isDriverLicense = " + isDriverLicense +
                ", \n liveInDorm = " + liveInDorm +
                '}';
    }

    /**
     * Method to check whether object equals by value
     *
     * @param o Object as parameter
     * @return Return boolean value as a result
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return privilege == student.privilege &&
                contract == student.contract &&
                isUkrainian == student.isUkrainian &&
                fullTime == student.fullTime &&
                isMilitary == student.isMilitary &&
                scienceWork == student.scienceWork &&
                inUniversityBoard == student.inUniversityBoard &&
                isDriverLicense == student.isDriverLicense &&
                liveInDorm == student.liveInDorm &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(otherNames, student.otherNames) &&
                Objects.equals(birthday, student.birthday) &&
                gender == student.gender &&
                Objects.equals(passportNumber, student.passportNumber) &&
                Objects.equals(taxIdNumber, student.taxIdNumber) &&
                Objects.equals(registrationAddress,
                        student.registrationAddress) &&
                Objects.equals(email, student.email) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(numberInCaseOfEmergency,
                        student.numberInCaseOfEmergency) &&
                faculty == student.faculty &&
                speciality == student.speciality &&
                Objects.equals(groupNumber, student.groupNumber) &&
                Objects.equals(NameOfGroupLeader, student.NameOfGroupLeader) &&
                Objects.equals(lastNameOfGroupLeader,
                        student.lastNameOfGroupLeader) &&
                Objects.equals(phoneNumberOfGroupLeader,
                        student.phoneNumberOfGroupLeader) &&
                sportsClubs == student.sportsClubs;
    }

    /**
     * Method to get object hash
     *
     * @return hash of Student
     */

    @Override
    public int hashCode() {
        return Objects.hash(firstName,
                lastName,
                otherNames,
                birthday,
                gender,
                passportNumber,
                taxIdNumber,
                registrationAddress,
                email,
                phoneNumber,
                numberInCaseOfEmergency,
                privilege,
                contract,
                isUkrainian,
                fullTime,
                isMilitary,
                faculty,
                speciality,
                groupNumber,
                NameOfGroupLeader,
                lastNameOfGroupLeader,
                phoneNumberOfGroupLeader,
                sportsClubs,
                scienceWork,
                inUniversityBoard,
                isDriverLicense,
                liveInDorm);
    }

    /**
     * Pattern Builder take basic Student
     * with all setters for StudentToBuild
     */

    public static class Builder {
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        /**
         * Method setSimilarTo complements new object example
         *
         * @param student is an object from which all parameters are taken
         */

        public Builder setSimilarTo(Student student) {

            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.otherNames = student.otherNames;
            this.studentToBuild.birthday = student.birthday;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.passportNumber = student.passportNumber;
            this.studentToBuild.taxIdNumber = student.taxIdNumber;
            this.studentToBuild.registrationAddress =
                    student.registrationAddress;
            this.studentToBuild.email = student.email;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.numberInCaseOfEmergency =
                    student.numberInCaseOfEmergency;
            this.studentToBuild.privilege = student.privilege;
            this.studentToBuild.contract = student.contract;
            this.studentToBuild.isUkrainian = student.isUkrainian;
            this.studentToBuild.fullTime = student.fullTime;
            this.studentToBuild.isMilitary = student.isMilitary;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.groupNumber = student.groupNumber;
            this.studentToBuild.NameOfGroupLeader = student.NameOfGroupLeader;
            this.studentToBuild.lastNameOfGroupLeader =
                    student.lastNameOfGroupLeader;
            this.studentToBuild.phoneNumberOfGroupLeader =
                    student.phoneNumberOfGroupLeader;
            this.studentToBuild.sportsClubs = student.sportsClubs;
            this.studentToBuild.scienceWork = student.scienceWork;
            this.studentToBuild.inUniversityBoard = student.inUniversityBoard;
            this.studentToBuild.isDriverLicense = student.isDriverLicense;
            this.studentToBuild.liveInDorm = student.liveInDorm;
            return this;
        }

        /**
         * Setter for StudentToBuild of Student object firstName field
         *
         * with all parameters Sets first name of StudentToBuild object
         * @return Return objects of Builder class
         */

        public Builder setFirstName(String firstName) {
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setOtherNames(String otherNames) {
            studentToBuild.setOtherNames(otherNames);
            return this;
        }

        public Builder setBirthday(LocalDate birthday) {
            studentToBuild.setBirthday(birthday);
            return this;
        }


        public Builder setGender(Gender gender) {
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setPassportNumber(String passportNumber) {
            studentToBuild.setPassportNumber(passportNumber);
            return this;
        }

        public Builder setTaxIdNumber(String taxIdNumber) {
            studentToBuild.setTaxIdNumber(taxIdNumber);
            return this;
        }

        public Builder setRegistrationAddress(String registrationAddress) {
            studentToBuild.setRegistrationAddress(registrationAddress);
            return this;
        }

        public Builder setEmail(String email) {
            studentToBuild.setEmail(email);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }

        public Builder setNumberInCaseOfEmergency
                (String numberInCaseOfEmergency) {
            studentToBuild.setNumberInCaseOfEmergency(numberInCaseOfEmergency);
            return this;
        }

        public Builder setPrivilege(boolean privilege) {
            studentToBuild.setPrivilege(privilege);
            return this;
        }

        public Builder setContract(boolean contract) {
            studentToBuild.setContract(contract);
            return this;
        }

        public Builder setIsUkrainian(boolean isUkrainian) {
            studentToBuild.setUkrainian(isUkrainian);
            return this;
        }

        public Builder setFullTime(boolean fullTime) {
            studentToBuild.setFullTime(fullTime);
            return this;
        }

        public Builder setMilitary(boolean military) {
            studentToBuild.setMilitary(military);
            return this;
        }

        public Builder setFaculty(Faculty faculty) {
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setSpeciality(Speciality speciality) {
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setGroupNumber(String groupNumber) {
            studentToBuild.setGroupNumber(groupNumber);
            return this;
        }

        public Builder setNameOfGroupLeader(String nameOfGroupLeader) {
            studentToBuild.setNameOfGroupLeader(nameOfGroupLeader);
            return this;
        }

        public Builder setLastNameOfGroupLeader(String lastNameOfGroupLeader) {
            studentToBuild.setLastNameOfGroupLeader(lastNameOfGroupLeader);
            return this;
        }

        public Builder setPhoneNumberOfGroupLeader
                (String phoneNumberOfGroupLeader) {
            studentToBuild.setPhoneNumberOfGroupLeader
                    (phoneNumberOfGroupLeader);
            return this;
        }

        public Builder setSportsClubs(SportsClubs sportsClubs) {
            studentToBuild.setSportsClubs(sportsClubs);
            return this;
        }

        public Builder setScienceWork(boolean scienceWork) {
            studentToBuild.setScienceWork(scienceWork);
            return this;
        }

        public Builder setInUniversityBoard(boolean inUniversityBoard) {
            studentToBuild.setInUniversityBoard(inUniversityBoard);
            return this;
        }

        public Builder setDriverLicense(boolean driverLicense) {
            studentToBuild.setDriverLicense(driverLicense);
            return this;
        }

        public Builder setLiveInDorm(boolean liveInDorm) {
            studentToBuild.setLiveInDorm(liveInDorm);
            return this;
        }

        /**
         * Method returns a built Student object with all parameters
         *
         * @return studentToBuild as a Student object
         */

        public Student build() {
            return studentToBuild;
        }
    }

}

/*
 *
 * Classname: Main
 *
 * @version 13.06.2020
 *
 * @author Kopach Daria
 *
 * Description:Programming patterns. Builder
 *
 *
 * 3.Create a class Student  - 25 fields.
 *
 * 4.Create a builder for the class Student
 *
 */

package com.company;

import java.time.LocalDate;

public class Main {

    /**
     * Method that is default entry point of a program.
     *
     * @param args Default argument for main method.
     */

    public static void main(String[] args) {


            // Create one student using simple constructor
            Student firstStudent = new Student(
                    "Kopach",
                    "Daria",
                    "Arkadiivna",
                    LocalDate.of(1998,07,29),
                    Gender.FEMALE,
                    "AC345432",
                    "342365465311",
                    "Kyiv, Miliutenka, 6",
                    "dariyakopach@gmail.com",
                    "0986109374",
                    "0969718460",
                    false,
                    false,
                    true,
                    false,
                    false,
                    Faculty.FIT,
                    Speciality.DIGITAL_ECONOMIC,
                    "1",
                    "Kurachenko",
                    "Anna",
                    "0987654323",
                    SportsClubs.YOGA,
                    true,
                    false,
                    false,
                    true);

            System.out.println("\n" + firstStudent);

        // Create a student via Builder methods

        Student anna = new Student.Builder()
                .setFirstName("Anna")
                .setLastName("Kurachenko")
                .setOtherNames("Yuriivna")
                .setBirthday(LocalDate.of(1998,03,05))
                .setGender(Gender.FEMALE)
                .setPassportNumber("TT543223")
                .setTaxIdNumber("3532453679")
                .setRegistrationAddress("Kyiv, Knmelnitskoho, 6")
                .setEmail("annakurachenko@gmail.com")
                .setPhoneNumber("0988765431")
                .setNumberInCaseOfEmergency("09876543411")
                .setPrivilege(false)
                .setContract(false)
                .setIsUkrainian(true)
                .setFullTime(true)
                .setMilitary(false)
                .setFaculty(Faculty.FIT)
                .setSpeciality(Speciality.DIGITAL_ECONOMIC)
                .setGroupNumber("1")
                .setNameOfGroupLeader("Andriy")
                .setLastNameOfGroupLeader("Roskladka")
                .setPhoneNumberOfGroupLeader("09876443543")
                .setSportsClubs(SportsClubs.YOGA)
                .setScienceWork(true)
                .setInUniversityBoard(false)
                .setDriverLicense(true)
                .setLiveInDorm(true)
                .build();

        System.out.println("\n" + anna);

        // Create a student using Builder similar to method

        Student svetlana = new Student.Builder()
                .setSimilarTo(anna)
                .setFirstName("Svetlana")
                .setLastName("Allo")
                .build();

        System.out.println(svetlana);

    }

}

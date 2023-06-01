package tests;

import com.github.javafaker.Faker;

public class JavaFaker {

    public static void main(String[] args) {

        System.out.println("Naber Kanka");

        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.chuckNorris().fact());



    }
}

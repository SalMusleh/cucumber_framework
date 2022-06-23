package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Test;

public class RandomSteps {
    @Test
    public void getRandomDate(){
        Faker faker = new Faker();

        System.out.println(faker.artist());

    }
}

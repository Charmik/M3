import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.List;

public class Lesson8 {

    public static void main(String[] args) {
        final Airport airport = Airport.getInstance();
        final List<Aircraft> aircrafts = airport.getAllAircrafts();
        System.out.println(aircrafts.size());
    }
}

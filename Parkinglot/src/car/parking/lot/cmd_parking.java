package car.parking.lot;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class cmd_parking {
      
    public Map<String, Method> commandsMap;

    public cmd_parking() {
        commandsMap = new HashMap<String, Method>();
        try {
            populateCommandsHashMap();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    private void populateCommandsHashMap() throws NoSuchMethodException {
commandsMap.put("create_parking_lot", parkinglot.class.getMethod("createParkingLot", String.class));
commandsMap.put("park", parkinglot.class.getMethod("park", String.class, String.class));
commandsMap.put("leave", parkinglot.class.getMethod("leave", String.class));
commandsMap.put("status", parkinglot.class.getMethod("status"));
commandsMap.put("registration_numbers_for_cars_with_colour", parkinglot.class.getMethod("getRegistrationNumbersFromColor", String.class));
commandsMap.put("slot_numbers_for_cars_with_colour", parkinglot.class.getMethod("getSlotNumbersFromColor", String.class));
commandsMap.put("slot_number_for_registration_number", parkinglot.class.getMethod("getSlotNumberFromRegNo", String.class));
}
}

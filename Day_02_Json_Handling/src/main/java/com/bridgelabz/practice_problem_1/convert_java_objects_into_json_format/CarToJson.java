package com.bridgelabz.practice_problem_1.convert_java_objects_into_json_format;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {

    public static void convertingObjectToJson(){
        try {
            Car car = new Car("Chevrolet", "Sail", 2023);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(car);

            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        convertingObjectToJson();
    }
}

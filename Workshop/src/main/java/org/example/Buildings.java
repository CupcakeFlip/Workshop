package org.example;
import java.util.*;

public class Buildings {
String Name;
UUID Id;
List<Sensors>Sensors;
List<Actuator>actuators;

public Buildings(String name , UUID id){
Name=name;
Id=id;
Sensors = new ArrayList<Sensors>();
actuators= new ArrayList<Actuator>();
}

public void getSensors(){
for (int i = 0; i < Sensors.size(); i++) {
    System.out.println("Sensor"+i+Sensors.get(i).getValue());
}
}

public void getActuators(){
for (int i = 0; i < actuators.size(); i++) {
    System.out.println("actuators"+i+actuators.get(i).getValue());
}}


public void addTemperatureSensor(UUID sens){
Sensors.add(new Sensors());
}

public void addCo2Sensor(UUID sens){
Sensors.add(new Sensors());
}
public void RemoveSensor(){

}
public void addVentActuator(){

}

public void RemoveActuator(){

}
}

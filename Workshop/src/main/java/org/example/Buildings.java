package org.example;
import java.util.*;

import java.util.ArrayList;

public class Buildings extends Unit {
String Name;
UUID Id;
List<Sensors>sensors;
List<Actuator>actuators;

public Buildings(String name , UUID id){
Name=name;
Id=id;
sensors = new ArrayList<Sensors>();
actuators= new ArrayList<Actuator>();
}

public void getSensors(){
for (int i = 0; i < sensors.size(); i++) {
    System.out.println("Sensor"+i+sensors.get(i).getValue());
}
}

public void getActuators(){
for (int i = 0; i < actuators.size(); i++) {
    System.out.println("actuators"+i+actuators.get(i).getValue());
}}


public void addTemperatureSensor(UUID sens){
sensors.add(new Sensors());
}

public void addCo2Sensor(UUID sens){
sensors.add(new Sensors());
}
public void RemoveSensor(){

}
public void addVentActuator(UUID Id){
actuators.add(new Actuator(Id));
}

public void RemoveActuator(UUID Id){
for (int i = 0; i < actuators.size(); i++) {
    if (actuators.get(i).getId()==Id) {
        
    }
}
}
}

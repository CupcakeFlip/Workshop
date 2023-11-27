package org.example;
import java.util.*;

import java.util.ArrayList;

public class Buildings extends Unit {
String Name;
int Id;
List<Sensors>Sensors;
List<Actuator>actuators;

public Buildings(String name , int id){
Name=name;
Id=id;
Sensors = new ArrayList<Sensors>();
actuators= new ArrayList<Actuator>();
}

}

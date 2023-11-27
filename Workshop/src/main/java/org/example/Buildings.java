package org.example;
import java.util.*;

import java.util.ArrayList;

public class Buildings {
String Name;
int Id;
List<Sensors>sensors;
List<Actuator>actuators;

public Buildings(String name , int id){
Name=name;
Id=id;
sensors = new ArrayList<Sensors>();
actuators= new ArrayList<Actuator>();
}

}

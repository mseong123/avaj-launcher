# avaj-launcher | 42KL


![UML](https://github.com/mseong123/avaj-launcher/blob/main/uml_diagram.png)

*UML class diagram of aircraft simulator


![Simulation](https://github.com/mseong123/avaj-launcher/blob/main/simulation.png)

*Example simulation results


This project's objective is to create an aircraft simulation program that predicts an aircraft (Baloon, Jetplane, Helicopter)'s status (latitude, longitude and height) based on weather conditions (RAIN, FOG, SUN, SNOW). When the height reaches zero, the aircraft will land and deregister itself from the Tower. The program is coded in Java and has to follow EXPLICITLY the UML class diagram provided and incorporating OOP design patterns such as Factory, Singleton, Observer patterns. Program's input parameters are included in simulation.txt where:
1) First line shows how many times the simulation is run
2) Thereafter each line will show Aircraft type, name, longitude, latitude and height

Erorr handling is built in. *simulation.txt can be changed to stress-test different outcomes.


### To compile program (Unix)

Repo root folder:
```
find * -name "*.java" > sources.txt
$javac @sources.txt
```

### To run program (Unix)

```
java com.simulator.simulator simulation.txt
```

Project results: 125/100

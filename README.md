# Builder Pattern Car Automation

![builderMain.png](https://github.com/AhmetEminSaglik/BuilderPattern_CarAutomationProject/blob/master/image/builderMain.png)

You can select car by its path name. So you do not have to add if else for every new car. As you can see the picture above, from main class,
if you want to change car to build a different one you may just change MclarenFactory like CarTypeFactory. So that car's factory will build 
a that type car. 
<br>

![BuilderDesign.png](https://github.com/AhmetEminSaglik/BuilderPattern_CarAutomationProject/blob/master/image/BuilderDesign.png)

And at the second photo  you can see a concrete class. My car class has 5 different classes: Model, Brand, Ceiling, Gear, and Seat. the last 3 of these
 are united in Body(in car class). And These items may change as entered PartSupplyFactory parameters which are actually consist of interfaceses.




# dynamic-inventory-management

Dynamic Inventory management

Overview

Inventory allows the the enterprise to have information about it resources and to know which action to do on which. It can be performed periodically or permanently . Holding higher stock level secures the company from the rupture of the the activities but can leads to higher stock-holding-cost for the company. Holding very small level of the materials does not protect the company from risk of the rupture. Optimal would be the stock level, which with minimal holding and maintaining cost. How to have this? The availability of the most actual informations about the product all time is very important to achieve this goal. In some companies the Materials – and product database are not directly updated and this is due to the delay in the transcription of the collected informations from the paperwork of the different production lines. With this web application the delay in the update of the database of the material can be avoided and the risk transcription false informations can be reduced or avoided. This web application is intended to give every partners involved in the management of the materials or production to have very accurate information about every material and product and so to plan the material supply(internally and externally) , plan the production correctly and be able to schedule easily the delivery.
Features
-User login/autentification: the user of this applications are  the ifferente proctions Units or divisions in the company. THe can login from the productions' places to send or to cancel their order to the warehouse 

-Material:
    Add new material to the database: receiving new material 
    Place allocation: Locate the material position in the warehouse so that the access or picking can be easier, because the material's location is known. Here we have to allocate to all category of material a specific place_id so that the picker can know where to take the ordered material. 
    update location and locations list: The place allocated for some material can change according to the mateialflow(change in the quantity of some materials), create a new locations, relocate materials in the warehouse.
    Order: The production units in the company would be able to send order of the material via the application to the warehouse.
    Store: the production unit can reach the staplers to came and take the finished product

    For more information about the planing of thr application, please see the wireframe on the link: https://app.moqups.com/hadelesko/dcyYeE2eiw/view
    
Technologies

Java, Spring Boot,MySQL,Thymeleaf, Bootstrap Javascript. 
What I'll Have to Learn?

 it will be important to learn something in the JavaScript(D3) to make some representations or overview of the material flow or of the production and also hibernate to manage the database of the materials, orders,...

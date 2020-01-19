# CodeAssignment

Code Test



## Model A : The Basics 

- How did you unit test it?
  - You can either use jUnit to perform assert or if the code is simple enough it can also be done by jsut simple main as it highlighted in the PDF
- How did you optimize the code for maintainability?
  - Deisgn pattern is helpful in making the code reusabiity and avoid redundancy, Factory Pattern is used in my case. 
- Duck and Chicken
  - Created a two seperated class inheriting the original Animal and Bird interface 
  - by instantiating the individual class you can reuse the same interface object and call the sound method.
  - Rhooster can extend chicken to relate with chicken 
  - Parrots sound is handled using case and individual animal classes instantiation. if the parrot is with dogs, then dogs class can instantiate and provide the dogs sounds.
    - this can also help in code reusability and avoid redundancy.
  
## Model B : Model Fish

- Abstract class created as SeaCreature which inherits the Animal and that is extended by fish class
 - this is done to use Abstract Factory Pattern, reusabiity of the same method such as sound,size ,eat etc.
- As Dolphin cannot be inherited by fish, we used Bird interface and impleneted swim meethod, becuase that was already defined in Bird interface 


 ## Model C : ButterFly
 - Due to time constraints Butterfly is implemented similar as other Bird by just making little modificaiton of making the sound ,fly boolean mehtods. 
 
 ## Beautification of the code.
 - before going to the last model, code beautification is done, such as
  - using fucntional interface by implementing the method in interface. helps avoid implmenting each mehtod in subclasses
  - making the method boolean to help in count 
  - redundant code and formating is performed.
  
 ## Model D : Count Animals
 - by using the same Solutoon class as the test iitiation, Animal Array is created.
 - with Stream and filter help count to each animal of their behavour can be counted. 
     `long countWalk = Stream.of(animals).filter(animal -> animal.walk()).count();`

## Note: 
- Used only single execution main class for all the test cases.
- however this can also be achieved by indiidual jUnit which is missed due to time constraints.  
      
      

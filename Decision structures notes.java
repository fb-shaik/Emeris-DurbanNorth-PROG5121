Chapter Five - Decisions /Selection Structure
LU 3 


Define: Control the flow of execution based on a condition/Selection

1. If - Statement (Single selection)
 - Executes a block of code only if the condition is true
 - Syntax:

 if (condition){
  //code block (Yes/True Path)
 } 

 int age = 18;
 if (age >=18){
    System.out.println("You are an adult");
 }   

 2. If-Else Statement (Dual-Selection)
  - Provides an alternative block if the condition is false
  - Syntax:
    if (condition){
        //code block (Yes/True Path)
    } else {
        //code block (No/False Path)
    }

int age = 16;
if (age >=18){ 
    System.out.println("You are an adult");
 }else{
     System.out.println("You are an minor")
 }

Relational Operators
>
<
>=
<=
==
!=

Logical Operators
AND && (condition1 AND condition2)
- both conditions have to be TRUE for the entire statement to return true
-if (age >= 18 AND hasID = true)

OR  || (shift + black-slash key) 
 - either condition needs to be true for the entire statement to retun TRUE
 - if (age >=12 || height = 150)

NOT !
 - reverse (negates) the truth value of a condition
 !true - false
 !false - true
 if (!(user.isLoggedIn)){
    //user is NOT logged in
 }

 3. Nested If (If statement inside of another if Statement)
- Syntax:
 if (condition 1) {
        if(condition 2)
        {
            inner block
        }
 }
 int age = 20;
 boolean hasID = true;
 if (age>=18){
    if (hasID)
    {
        System.println("Entry Allowed!")
    }
 }

 4. Switch-Case / Switch Statement 
 - Used for selecting one of the many options based on a variable
 -Syntax:
    switch (expression/variable){
        case value1:
            //code / instruction for this case
        break; //end of this choice
        case value2:
            //code / instruction for this case
        break;
        case value3:
            //code / instruction for this case
        break;
        case value4:
            //code / instruction for this case
        break;
        default:
            //default code
    }
 
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
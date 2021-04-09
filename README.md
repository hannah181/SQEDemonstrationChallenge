## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


#### Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1.  Test 1
Check system behavior when valid values are entered. 

 2. Test 2
Check system behavior when invalid values are entered.

 3.Test 3
Check system behavior when values are left blank.

 4.Test 4
Check system behavior when pizza selection is not chosen and all other values are valid.

 5.Test 5
Check system behavior when ‘small 6 slices - no toppings’ is selected and toppings are chosen.

 6.Test 6 
 Check behavior of Topping 1 drop down menu
 
 7.Test 7 
 Check behavior of Topping 2 drop down menu
 
 8.Test 8 
 Check system behavior when valid data is entered and email box is left blank
 
 9.Test 9 
 Check system behavior when valid options are selected with name and phone boxes left blank
 
 10.Test 10 
 Check system behavior when the following is entered into the quantity box: -2, 0, 1, 500, 99999, 200000
 
 11.Test 11 
 check system behavior when the following is entered into the phone box: 8, 2147874324, 78576587569385
 
 12.Test 12 
 Check system behavior when the following is entered into the name box: j, Jillian, (100 Characters) abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrs, (Over 100 characters) Hdidjbdkendgjdkebdjjvejxkejhfuekdhjrixjebdjxjenbcudojrgcufirguwow n dhjdkddndjdorjdhfhdjdbxhjdjfikebdjdoebhxidhdkdnrjdiekdbdilehfjiddhdjodjdhfheksnchdjke b bxhke b dhdjidjdhfhfjwjdbdjkdkdhjd, 55
 
 13. Test 13 
 Enter valid information and reset the form to check reset behavior.
 
 14. Test 14 
 Check system behavior with valid info and CCPayment radio button selected.
 
 15. Test 15 
 Check system behavior with valid info and CashPayment radio button selected.
 
 
 Defects
 
 1. Radio buttons allow user to select both options. Only one should be allowed.
 2. Negative quantities of pizza and the quantity '0' is accepted by the ordering system. Valid inputs should be 1 to 99999.
 3. When selecting a pizza with multiple toppings the order is accepted even when no toppings have been selected by the user.
 4. When '1 topping pizza' has been selected the user is still able to chose 2 toppings.
 5. When no pizza has been chosen the order is still accepted with a name and phone number.
 6. The phone number accepts invalid phone numbers (numbers less than and more than 10 digits).
 7. There is no space between 'Toppings' and '2'
 8. Reset button does not reset either toppings drop down menus.
 9. 'Choose a Toppings 1' should be 'Choose Topping 1' and 'Choose a Toppings 2' should be 'Choose Topping 2'. *Depending on the clients requirements this may not be a defect.
 10. The quantity box allows for letters to be entered and the order to be accepted. Only numeric values should be accepted by the user.
 11. Tax is not applied to the total cost of the order.


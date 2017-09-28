                                               Restaurant Management System
Application Name:Rubi Restaurant
In My Application execution starts from Home Page.This Home Page Consists of  Below options 
1)Menu
2)Contact
3)Sign Up Option For Customers
4)Login
If "Menu" is selected,the page will be redirected to menu page which will display all the items list with prices.
If "contact" is selected,it will show a dialogue window which consists of phone no and email id of RUbi Restaurant.
If "SignUp" option is selected,the page will be Redirected to Customer Registration Page.In Customer Registration Page user has to register by giving all valid details.if details were not correct or invalid the customer cannot register.after clicking Register user can be redirected to login page .in this login page user has to login with the details they used to regiter.After CLicking Login the Page will be Redirected to another page which conists of options to order food,reserve table,view oredered food details,view data about table reserved.
when order food option is clicked,the page will be redirected to menu page whcih consits of items list along with their prices.here prices can be selected by giving quantity in text fields provied.after giving quantity for wanted items total can be calculated by clicking total button and order can be confirmed by clicking checkout button. 
If "ordered food details " is selected, it will be redirected to the page that contains details of ordered food . customer I'd helps to check whether  the food is ordered or not.
If "Reserve Table" is selected ,it will be redirected to the page which is used to reserve table. in this page first we have to select the select the category (break  fast ,lunch, dinner) and we have to select table. if table is available ,the table will be reserved. if table is not available you need to select another table .
If " Tables reserved option " is selected ,it will be redirected to the page which consists of data about tables which are reserved.
//The above whole process can be done by logging in as customer
Host:
If host option is selected at the time of login ,the page will be redirected to the page which consists of reserve table option and details of reserved tables. here host will reserve table for customers and allots table for by checking out available tables.
Manager :
If manager is selected at the time of login, the page will be redirected to the page in which manager can take order and place order by clicking take order button.
Chef:
If Chef is selected at the time of login, the page will be redirected to the page which consists of normal orders data and take away orders data. by clicking load button the chef can view latest data of ordered food and prepares the food.
Server:
If server option is selected at the time of login, it will be redirected to the page which consists of  data about food ordered and by viewing the data the server will serves food to the particular table.
Execution Plan:
To execute my application ,I am providing a executable jar file and also code.
One way to execute is download the jar file which I have provided and execute all sql commands in MySQL .these commands were provided in commands.txt file. after that click on jar file and execute  it. at the of login give the values for each role as given below to login
Customer:
Email: sreddy@gmail.com
password: s
Host:
User name: host
Pwd:host123
Manager:
User name: manager
Pwd:12345
Chef:
User name: chef
pwd:12345
Server:
User name: server
Pwd:12345
Another way to execute is to download the code and run in eclipse by adding external jar i.e, MySQL connector jar. before starting execution run all the sql commands which were in commands.txt file and login action for each role can be performed by using above data.


//thank you  for giving opportunity

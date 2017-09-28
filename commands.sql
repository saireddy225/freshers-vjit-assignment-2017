

CREATE TABLE  breakfasttable (
  customer_id  int(11) DEFAULT NULL,
  breakfast  varchar(20) DEFAULT NULL
);
INSERT INTO  breakfasttable (customer_id, breakfast) VALUES
(143, 'Table2'),
(144, 'Table4'),
(145, ''),
(345, 'Table5'),
(123, 'Table6'),
(23, 'Table1');

CREATE TABLE  cheflogin  (
  UserName  varchar(20) NOT NULL,
  Password  varchar(20)  NOT NULL
);
INSERT INTO  cheflogin (UserName, Password) VALUES
('chef', '12345');

CREATE TABLE  customer (
  customer_id  int(11) NOT NULL,
  Name  varchar(20) NOT NULL,
  Email  varchar(20) NOT NULL,
  Password  varchar(20) NOT NULL,
  ConfirmPassword   varchar(20) NOT NULL,
  Phone_Number int(20) NOT NULL
);
INSERT INTO customer (customer_id, Name, Email, Password, ConfirmPassword, Phone_Number) VALUES
(143, 's', 's@gmail.com', 's', 's', 5),
(144, 's', 'sreddy@gmail.com', 's', 's', 67);




CREATE TABLE  dinnertable  (
  customer_id  int(11) NOT NULL,
  reservedtable  varchar(20) NOT NULL
);
INSERT INTO dinnertable (`customer_id`, `reservedtable`) VALUES
(345, 'Table5');


CREATE TABLE `foodordered` (
  `customer_id` int(11) DEFAULT NULL,
  `gobimanchurian` int(11) DEFAULT NULL,
  `mushroommanchurian` int(11) DEFAULT NULL,
  `panneermanchurian` int(11) DEFAULT NULL,
  `gobi65` int(11) DEFAULT NULL,
  `chickenmanchurian` int(11) DEFAULT NULL,
  `chickenbiryani` int(11) DEFAULT NULL,
  `muttonbiryani` int(11) DEFAULT NULL,
  `chickennoodles` int(11) DEFAULT NULL
)  ;

INSERT INTO `foodordered` (`customer_id`, `gobimanchurian`, `mushroommanchurian`, `panneermanchurian`, `gobi65`, `chickenmanchurian`, `chickenbiryani`, `muttonbiryani`, `chickennoodles`) VALUES
(143, 5, 2, 1, 6, 4, 6, 91, 10),
(143, 5, 2, 1, 3, 8, 9, 0, 11),
(2, 3, 5, 6, 8, 9, 10, 11, 12),
(2, 3, 2, 15, 2, 2, 2, 3, 5),
(3, 15, 3, 2, 8, 9, 10, 10, 12),
(3, 1, 1, 1, 1, 2, 1, 3, 5),
(3, 3, 3, 3, 3, 3, 3, 3, 3),
(4, 0, 0, 8, 0, 7, 0, 5, 0),
(3, 23, 12, 24, 11, 45, 12, 14, 10);
CREATE TABLE `hostlogin` (
  `Username` varchar(11) NOT NULL,
  `password` varchar(11) NOT NULL
);
INSERT INTO `hostlogin` (`Username`, `password`) VALUES
('host', 'host123');

CREATE TABLE `lunchtable` (
  `customer_id` int(10) NOT NULL,
  `tablesreserved` varchar(20) NOT NULL
) ;

INSERT INTO `lunchtable` (`customer_id`, `tablesreserved`) VALUES
(577, 'Table2'),
(345, 'Table3');




CREATE TABLE `manager` (
  `manger_name` varchar(20) NOT NULL,
  `table_no` int(4) NOT NULL,
  `food_ordered` varchar(100) NOT NULL,
  `table_count` int(4) NOT NULL
) ;
CREATE TABLE `mnglogin` (
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ;

INSERT INTO `mnglogin` (`UserName`, `Password`) VALUES
('manager', '12345');


CREATE TABLE `mngorder` (
  `tableno` double DEFAULT NULL,
  `gobimanchurian` double DEFAULT NULL,
  `mushroommanchurian` double DEFAULT NULL,
  `panneermanchurian` double DEFAULT NULL,
  `gobi65` double NOT NULL,
  `chickenmanchurian` double DEFAULT NULL,
  `chickenbiryani` double DEFAULT NULL,
  `muttonbiryani` double DEFAULT NULL,
  `chickennoodles` double DEFAULT NULL
) ;

INSERT INTO `mngorder` (`tableno`, `gobimanchurian`, `mushroommanchurian`, `panneermanchurian`, `gobi65`, `chickenmanchurian`, `chickenbiryani`, `muttonbiryani`, `chickennoodles`) VALUES
(5, 5, 13, 3, 9, 2, 4, 3, 6);

 


CREATE TABLE `serlogin` (
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ;
INSERT INTO `serlogin` (`UserName`, `Password`) VALUES
('host', '12345'),
('server', '12345');

ALTER TABLE `breakfasttable`
     ADD UNIQUE KEY `breakfast` (`breakfast`);
ALTER TABLE  `breakfasttable`    ADD UNIQUE KEY `breakfast_2` (`breakfast`);

ALTER TABLE   `breakfasttable`  ADD UNIQUE KEY `breakfast_3` (`breakfast`);

 ALTER TABLE  `breakfasttable`   ADD UNIQUE KEY `breakfast_4` (`breakfast`);
 ALTER TABLE  `breakfasttable`  ADD UNIQUE KEY `breakfast_5` (`breakfast`);
 ALTER TABLE  `breakfasttable`   ADD UNIQUE KEY `breakfast_6` (`breakfast`); 
 ALTER TABLE  `breakfasttable`  ADD UNIQUE KEY `breakfast_7` (`breakfast`);

 ALTER TABLE  `breakfasttable`  ADD UNIQUE KEY `breakfast_8` (`breakfast`);
 ALTER TABLE  `breakfasttable`  ADD UNIQUE KEY `breakfast_9` (`breakfast`);

 ALTER TABLE  `breakfasttable`   ADD UNIQUE KEY `breakfast_10` (`breakfast`);
 ALTER TABLE  `breakfasttable` ADD UNIQUE KEY `breakfast_11` (`breakfast`);
 ALTER TABLE  `breakfasttable`  ADD UNIQUE KEY `breakfast_12` (`breakfast`);



ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);
ALTER TABLE `customer`  ADD UNIQUE KEY `Email` (`Email`); 
ALTER TABLE `customer`  ADD UNIQUE KEY `Phone Number` (`Phone_Number`);

ALTER TABLE `dinnertable`
  ADD UNIQUE KEY `reservedtable` (`reservedtable`);
ALTER TABLE `dinnertable`
 ADD UNIQUE KEY `reservedtable_2` (`reservedtable`);
ALTER TABLE `dinnertable`
   ADD UNIQUE KEY `reservedtable_3` (`reservedtable`);
ALTER TABLE `dinnertable`
  ADD UNIQUE KEY `reservedtable_4` (`reservedtable`);
ALTER TABLE `dinnertable`
  ADD UNIQUE KEY `reservedtable_5` (`reservedtable`);
ALTER TABLE `dinnertable`
   ADD UNIQUE KEY `reservedtable_6` (`reservedtable`);

ALTER TABLE `lunchtable`
  ADD UNIQUE KEY `tablesreserved` (`tablesreserved`);
ALTER TABLE `lunchtable` ADD UNIQUE KEY `tablesreserved_2` (`tablesreserved`);
ALTER TABLE `lunchtable` ADD UNIQUE KEY `tablesreserved_3` (`tablesreserved`);
ALTER TABLE `lunchtable`  ADD UNIQUE KEY `tablesreserved_4` (`tablesreserved`);
ALTER TABLE `lunchtable`  ADD UNIQUE KEY `tablesreserved_5` (`tablesreserved`);

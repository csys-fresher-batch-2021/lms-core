# Project Title : Leave Management System


### Module-1 (Leaves)


#### .Employee Overall Details Table
```sql
CREATE TABLE LMS_EMPLOYEES_DET(EMPLOYEE_CODE VARCHAR2(150) Not null, 
    EMPLOYEE_NAME VARCHAR2(150) not null, 
    DATE_OF_BIRTH DATE, 
    GENDER VARCHAR2(150) , 
    DEPARTMENT VARCHAR2(150), 
    POSITION VARCHAR2(150), 
    HIRE_DATE DATE, 
    PLACE VARCHAR2(150), 
    MANAGER_CODE VARCHAR2(150), 
    EMPLOYEE_TYPE VARCHAR2(150),
    CONSTRAINT Employee_pk PRIMARY KEY (EMPLOYEE_CODE)
  );
```

##### .Insert Employee Details
```sql
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1001','ARUN','18-12-1997','M','ORACLE','CONSULTANT','23-02-2015','CHENNAI','E1005','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1002','DEEPA','06-08-1998','F','ORACLE-APPS','TRAINEE','24-02-2015','CHENNAI','E1005','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1003','ELUMALAI','13-09-1999','M','HUMAN RESOURCES','HR','25-02-2015','TRICHY','E1010','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1004','HEMA','21-10-1997','F','FUSION','PROGRAMMER','26-02-2015','SALEM','E1005','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1005','KARTHI','19-07-1998','M','FUSION','MANAGER','27-02-2015','MADURAI','E1010','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1006','MUTHUKUMAR','26-09-1999','M','ORACLE','CONSULTANT','28-02-2015','DELHI','E1005','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1007','PARTHIBAN','09-12-1996','M','FUSION','PROGRAMMER','01-03-2015','DELHI','E1005','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1008','REKA','28-06-1999','F','HUMAN RESOURCES','HR','02-03-2015','TRICHY','E1010','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1009','SAKIL','09-09-1999','M','HUMAN RESOURCES','TRAINEE','03-03-2015','MADURAI','E1010','EMPLOYEE');
Insert into LMS_EMPLOYEES_DET (EMPLOYEE_CODE,EMPLOYEE_NAME,DATE_OF_BIRTH,GENDER,DEPARTMENT,POSITION,HIRE_DATE,PLACE,MANAGER_CODE,EMPLOYEE_TYPE) values ('E1010','SUDHARSAN','10-12-1996','M','HUMAN RESOURCES','MANAGER','04-03-2015','KOVAI','E1011','EMPLOYEE');

```
##### .Select All Data
```sql
select *
from LMS_EMPLOYEES_DET;
```
 Employee Code | Employee Name | Date of Birth | Gender | Department | Position | Hire Date | Place | Manager Code | Employee Type |
 |:------- |:----------|:-------|:------------------|:--------------------|:-------------|:----------------|:---------------------------|:----------------|:---------------------------|
| E1001 | ARUN | 18-12-1997 | M | ORACLE | CONSULTANT | 23-02-2015 | CHENNAI | E1005 | EMPLOYEE | 
| E1002 | DEEPA | 06-08-1998 | F | ORACLE-APPS | TRAINEE | 24-02-2015 | CHENNAI | E1005 | EMPLOYEE | 
| E1003 | ELUMALAI | 13-09-1999 | M | HUMAN RESOURCES | HR | 25-02-2015 | TRICHY | E1010 | EMPLOYEE | 
| E1004 | HEMA | 21-10-1997 | F | FUSION | PROGRAMMER | 26-02-2015 | SALEM | E1005 | EMPLOYEE | 
| E1005 | KARTHI | 19-07-1998 | M | FUSION | MANAGER | 27-02-2015 | MADURAI | E1010 | EMPLOYEE | 
| E1006 | MUTHUKUMAR| 26-09-1999 | M | ORACLE | CONSULTANT | 28-02-2015 | DELHI | E1005 | EMPLOYEE | 
| E1007 | PARTHIBAN | 09-12-1996 | M | FUSION | PROGRAMMER | 01-03-2015 | DELHI | E1005 | EMPLOYEE | 
| E1008 | REKA | 28-06-1999 | F | HUMAN RESOURCES | HR | 02-03-2015 | TRICHY | E1010 | EMPLOYEE | 
| E1009 | SAKIL | 09-09-1999 | M | HUMAN RESOURCES | TRAINEE | 03-03-2015 | MADURAI | E1010 | EMPLOYEE | 
| E1010 | SUDHARSAN | 10-12-1996 | M | HUMAN RESOURCES | MANAGER | 04-03-2015 | KOVAI | E1011 | EMPLOYEE | 



#### .Employee Leave Details Table
```sql
CREATE TABLE LMS_EMPLOYEES_LEAVE_DET 
  ( LEAVE_ID NUMBER,
    EMPLOYEE_CODE VARCHAR2(100) not null, 
    MANAGER_CODE VARCHAR2(100), 
    LEAVE_TYPE VARCHAR2(100), 
    LEAVE_REASON VARCHAR2(100), 
    LEAVE_START_DATE DATE, 
    LEAVE_END_DATE DATE, 
    NO_OF_DAYS NUMBER, 
    TOTAL_LEAVE NUMBER, 
    LEAVE_BALANCE NUMBER, 
    STATUS VARCHAR2(100),
    CONSTRAINT Leave_Emp_pk PRIMARY KEY (LEAVE_ID),
    CONSTRAINT fk_employee
    FOREIGN KEY (EMPLOYEE_CODE)
    REFERENCES LMS_EMPLOYEES_DET (EMPLOYEE_CODE)
   );

```
##### .Insert Employee Leave Details
```sql
Insert into LMS_EMPLOYEES_LEAVE_DET  (LEAVE_ID,EMPLOYEE_CODE,MANAGER_CODE,LEAVE_TYPE,LEAVE_REASON,LEAVE_START_DATE,LEAVE_END_DATE,STATUS) values (100,'E1001','E1005','CASUAL_LEAVE','FUNCTION','07-01-2021','08-01-2021','APPLIED');
Insert into LMS_EMPLOYEES_LEAVE_DET  (LEAVE_ID,EMPLOYEE_CODE,MANAGER_CODE,LEAVE_TYPE,LEAVE_REASON,LEAVE_START_DATE,LEAVE_END_DATE,STATUS) values (101,'E1002','E1006','CASUAL_LEAVE','FUNCTION','07-02-2021','08-02-2021','APPLIED');

```
##### .Select All Data
```sql
select *
from LMS_EMPLOYEES_LEAVE_DET
```
 Leave Id | Employee Code | Manager Code | Leave type | Leave Reason | Leave Start Date | Leave End Date | Status |
 |:------- |:----------|:-------|:------------------|:--------------------|:-------------|:----------------|:---------------------------|
 | 100 | E1001 | E1005 | CASUAL_LEAVE | FUNCTION | 07-01-2021 | 08-01-2021 | APPLIED |
 | 101 | E1002 | E1006 | CASUAL_LEAVE | FUNCTION | 07-02-2021 | 08-02-2021 | APPLIED |

#### .Employee Leave Request Pending Table
```sql
CREATE TABLE LMS_EMPLOYEE_LEAVE_REQ_PEND_DET 
  ( LEAVE_ID NUMBER,
    LEAVE_REQUEST_PENDING VARCHAR2(100), 
    STATUS VARCHAR2(100), 
    REQUEST_FROM VARCHAR2(100) not null, 
    REQUEST_TO VARCHAR2(100), 
    REQUESTED_DATE DATE,
    CONSTRAINT fk_leave_emp
    FOREIGN KEY (LEAVE_ID)
    REFERENCES LMS_EMPLOYEES_LEAVE_DET(LEAVE_ID)
   );

```
##### .Insert Employee Leave Request Pending
```sql
Insert into LMS_EMPLOYEE_LEAVE_REQ_PEND_DET (LEAVE_ID,LEAVE_REQUEST_PENDING,STATUS,REQUEST_FROM,REQUEST_TO,REQUESTED_DATE) values (100,'CL','PENDING','E1001','E1003','07-01-2021');
Insert into LMS_EMPLOYEE_LEAVE_REQ_PEND_DET (LEAVE_ID,LEAVE_REQUEST_PENDING,STATUS,REQUEST_FROM,REQUEST_TO,REQUESTED_DATE) values (101,'CL','PENDING','E1001','E1003','07-02-2021');

```
##### .Select All Data
```sql
select *
from LMS_EMPLOYEE_LEAVE_REQ_PEND_DET
```
Leave Id | Leave Request Pending | Status | Request From | Request To | Request Date |
 |:------- |:----------|:-------|:------------------|:--------------------|:-------------|
 | 101 | CL | PENDING | E1001 | E1003 | 07-01-2021 |
 | 102 | CL | PENDING | E1001 | E1003 | 07-02-2021 | 

#### .Employee Leave Approve/Reject Table
```sql
CREATE TABLE LMS_EMPLOYEES_LEAVE_APPROVE_REJECT_DET 
  ( LEAVE_ID NUMBER,
    LEAVE_APPROVE VARCHAR2(100), 
    STATUS VARCHAR2(100), 
    REQUEST_FROM VARCHAR2(100), 
    APPROVED_BY VARCHAR2(100), 
    APPROVED_DATE DATE,
    CONSTRAINT fk_leave_R FOREIGN KEY (LEAVE_ID)
    REFERENCES LMS_EMPLOYEES_LEAVE_DET(LEAVE_ID)
   );
```
##### .Insert Employee Leave  Approve/Reject
```sql
Insert into LMS_EMPLOYEES_LEAVE_APPROVE_REJECT_DET (LEAVE_ID,LEAVE_APPROVE,STATUS,REQUEST_FROM,APPROVED_BY,APPROVED_DATE) values (101,'CL','APPROVED','E1001','E1003','07-02-2021');

```
##### .Select All Data
```sql
select *
from LMS_EMPLOYEES_LEAVE_APPROVE_REJECT_DET
```
Leave Id | Leave Approve | Status | Request From | Approved By | Approved Date |
 |:------- |:----------|:-------|:------------------|:--------------------|:-------------|
 | 101 | CL | APPROVED | E1001 | E1003 | 07-01-2021 |

#### .Employee Leave Cancel Table
```sql
CREATE TABLE LMS_EMPLOYEES_LEAVE_CANCEL_DET 
  ( LEAVE_ID NUMBER,
    LEAVE_CANCEL VARCHAR2(100), 
    STATUS VARCHAR2(100), 
    REQUEST_FROM VARCHAR2(100), 
    CANCEL_BY VARCHAR2(100), 
    CANCELLED_DATE DATE,
    CONSTRAINT fk_leave_cancel FOREIGN KEY (LEAVE_ID)
    REFERENCES LMS_EMPLOYEES_LEAVE_DET(LEAVE_ID)
   );

```
##### .Insert Employee Leave Cancel 
```sql
Insert into LMS_EMPLOYEES_LEAVE_CANCEL_DET (LEAVE_ID,LEAVE_CANCEL,STATUS,REQUEST_FROM,CANCEL_BY,CANCELLED_DATE) values (101,'CL','CANCELLED','E1001','E1003','07-02-2021');

```
##### .Select All Data
```sql
select *
from LMS_EMPLOYEES_LEAVE_CANCEL_DET

```
Leave Id | Leave Cancel | Status | Request From | Cancel By | Cancelled Date |
 |:------- |:----------|:-------|:------------------|:--------------------|:-------------|
 | 101 | CL | CANCELLED | E1001 | E1003 | 07-01-2021 |

#### .Leave Status Table
```sql
 CREATE TABLE LMS_STATUS_CODE 
   (STATUS_CODE VARCHAR2(50), 
    STATUS_NAME VARCHAR2(50)
   );

```
##### .Insert Leave Status Table
```sql
Insert into LMS_STATUS_CODE (STATUS_CODE,STATUS_NAME) values ('C','CANCELLED');
Insert into LMS_STATUS_CODE (STATUS_CODE,STATUS_NAME) values ('R','REJECTED');
Insert into LMS_STATUS_CODE (STATUS_CODE,STATUS_NAME) values ('A','APPROVED');


```
##### .Select All Data
```sql
select *
from LMS_STATUS_CODE
```
Status Code |Status Name |
 |:------- |:----------|
 | A | APPROVED |
 | R | REJECTED | 
 | C | CANCELLED |  

##### .List employee leaves - feature-1
```sql
SELECT *
FROM LMS_EMPLOYEES_LEAVE_DET
WHERE EMPLOYEE_CODE = 'E1001'
```
##### .apply leave - feature-2
```sql
insert into LMS_EMPLOYEES_LEAVE_DET (LEAVE_ID,EMPLOYEE_CODE,MANAGER_CODE,LEAVE_TYPE,LEAVE_REASON,LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_ANNUAL_LEAVE,STATUS)
                                   values (101,'E1002','E1006','CASUAL_LEAVE','FUNCTION','07-02-2021','07-02-2021',21,'APLLIED');
```
##### .Cancel employee leave - feature-3
```sql
delete from LMS_EMPLOYEES_LEAVE_DET
where EMPLOYEE_CODE = 'E1001'
and Leave_id = 100;
```
##### .Reject and Approve leave using Procedure - feature-4
```sql
set serveroutput on;

create or replace procedure LMS_EMP_LEAVE_STATUS_PROC (P_req_id varchar2,P_leave_code varchar2,P_Status_code varchar2,P_Leave_id number)
as

l_emp_id varchar2(50);
l_req_id varchar2(50);
l_leave_code varchar2(50);
l_status_3 varchar2(50);
l_status varchar2(50);
l_status_1 varchar2(50);
l_status_2 varchar2(50);
l_Lev_status varchar2(50);
--l_Lev_status_1 varchar2(50);
l_Lev_status_2 varchar2(50);
l_Lev_status_3  varchar2(50);
L_status_code  varchar2(50);
L_status_code_2  varchar2(50);
L_status_code_3  varchar2(50);
begin

l_Lev_status:= 'APPROVED';
--l_Lev_status_1:= 'CANCELLED';
l_Lev_status_2:= 'REJECTED';
l_Lev_status_3:= 'Null';

select max(REQUEST_FROM)
into l_req_id
from LMS_EMPLOYEE_LEAVE_REQ_PEND_DET
where l_req_id = P_req_id
and LEAVE_REQUEST_PENDING = P_leave_code
and STATUS is not null;

select employee_code,Status
into l_emp_id,l_status_3
from LMS_EMPLOYEES_LEAVE_DET
where employee_code = P_req_id
and LEAVE_ID = P_Leave_id ;

select Max(status_code)
into L_status_code
from LMS_STATUS_CODE
where status_code = P_Status_code;

if (l_status_code = 'A') then
update LMS_EMPLOYEES_LEAVE_DET
set Status = l_Lev_status
where employee_code = P_req_id
and LEAVE_ID = P_Leave_id ;
dbms_output. put_line('Updated');

elsif (l_status_code = 'R') then
update LMS_EMPLOYEES_LEAVE_DET
set Status = l_Lev_status_2
where employee_code = P_req_id
and LEAVE_ID = P_Leave_id ;
dbms_output. put_line('Updated');

else
update LMS_EMPLOYEES_LEAVE_DET
set status = l_Lev_status_3
where employee_code = P_req_id
and LEAVE_ID = P_Leave_id ;
end if;

Exception
 when NO_DATA_FOUND then 
 dbms_output.put_line('Error');
end;
```
#### .Execution Procedure
```sql
exec LMS_LEAVE_STATUS_PROC ('E1002','CL','R',102);
```
#### .Check data
```sql
select *
from LMS_EMPLOYEES_LEAVE_DET;
```
##### .List all employee Leaves - feature-5
```sql
select leave.EMPLOYEE_CODE,EMP.EMPLOYEE_NAME,leave.MANAGER_CODE,leave.LEAVE_TYPE,leave.LEAVE_REASON,leave.LEAVE_START_DATE,
       leave.LEAVE_END_DATE,leave.NO_OF_DAYS,leave.TOTAL_LEAVE,leave.LEAVE_BALANCE,leave.STATUS,leave.LEAVE_ID
from LMS_EMPLOYEES_LEAVE_DET Leave,
     LMS_EMPLOYEES_DET EMP
where leave.EMPLOYEE_CODE = EMP.EMPLOYEE_CODE
order by 1 asc;
```
##### .View Employee Leave balance - feature-6
```sql
select leave.EMPLOYEE_CODE,EMP.EMPLOYEE_NAME,leave.LEAVE_TYPE,leave.LEAVE_START_DATE,
       leave.LEAVE_END_DATE,abs(sum(leave.LEAVE_START_DATE - leave.LEAVE_END_DATE)) as No_of_days,
       leave.TOTAL_ANNUAL_LEAVE,TOTAL_ANNUAL_LEAVE - abs(sum(leave.LEAVE_START_DATE - leave.LEAVE_END_DATE))as Leave_Balance
from LMS_EMPLOYEES_LEAVE_DET Leave,
     LMS_EMPLOYEES_DET EMP
where leave.EMPLOYEE_CODE = EMP.EMPLOYEE_CODE
group by leave.EMPLOYEE_CODE,EMP.EMPLOYEE_NAME,leave.LEAVE_TYPE,leave.LEAVE_START_DATE,leave.LEAVE_END_DATE,leave.TOTAL_ANNUAL_LEAVE
having leave.EMPLOYEE_CODE = 'E1002';
```
##  Module -2 (User) 

#### .Employee/Admin Login query feature-1

```sql
CREATE TABLE LMS_ADMIN_LOGIN_DET 
           ( USER_ID VARCHAR2(150) unique not null, 
            USER_TYPE VARCHAR2(150), 
            USERNAME VARCHAR2(150),
            PASSWORD VARCHAR2(150)
           );

```

```sql
Insert into LMS_ADMIN_LOGIN_DET (USER_ID,USER_TYPE,USERNAME,PASSWORD) values ('E1011','Admin','ARUN','Welcome@123');
Insert into LMS_ADMIN_LOGIN_DET (USER_ID,USER_TYPE,USERNAME,PASSWORD) values ('E1013','Admin','NARESH','System@123');
Insert into LMS_ADMIN_LOGIN_DET (USER_ID,USER_TYPE,USERNAME,PASSWORD) values ('E1010','Admin','SUDHARSAN','User@123');

```

```
select *
from LMS_ADMIN_LOGIN_DET

```
User Id | User Type | Username | Password |
 |:------- |:----------|:-------|:------------------|
 | E1011 | ADMIN | ARUN | Welcome@123 |
 | E1013 | ADMIN | NARESH | System@123 |
 | E1010 | ADMIN | SUDHARSAN | User@123 |

```sql
CREATE TABLE LMS_EMP_LOGIN_DET 
           ( USER_ID VARCHAR2(150), 
            USER_TYPE VARCHAR2(150), 
            PASSWORD VARCHAR2(150), 
            USERNAME VARCHAR2(150)
           );
```

```sql
Insert into LMS_EMP_LOGIN_DET (USER_ID,USER_TYPE,USERNAME,PASSWORD) values ('E1012','Employee','GANESH','Emp123');
Insert into LMS_EMP_LOGIN_DET (USER_ID,USER_TYPE,USERNAME,PASSWORD) values ('E1005','Employee','KARTHI','Sys@123');
```

```
select *
from LMS_EMP_LOGIN_DET
```
User Id | User Type | Username | Password |
 |:------- |:----------|:-------|:------------------|
 | E1012 | EMPLOYEE | GANESH | Emp@123 |
 | E1005 | EMPLOYEE | KARTHI | Sys@123 |

```sql
select username,password from LMS_EMP_LOGIN_DET
where username = 'Employee' and password = 'Emp123';

select username,password from LMS_EMP_LOGIN_DET
where username = 'Admin' and password = 'User@123';
```

#### .List employee Details query feature-2

```sql
select EMP.EMPLOYEE_CODE,EMP.EMPLOYEE_NAME,EMP.date_of_birth,EMP.hire_date,
       decode(EMP.Gender,'M','Male','F','Female',EMP.Gender) Gender,EMP.department,EMP.position,
       EMP.place,EMP.employee_type,EMP.manager_code,MGR.EMPLOYEE_NAME Manager_name
from LMS_EMPLOYEES_DET EMP,
     LMS_EMPLOYEES_DET MGR
where EMP.MANAGER_CODE = MGR.EMPLOYEE_CODE
order by 1 asc;
```

#### .Add New employee (Admin) query Using Procedure feature-3

```sql
CREATE OR REPLACE PROCEDURE LMS_ADMIN_INSERT_EMP_PROC(
       p_userid IN LMS_EMP_LOGIN_DET.USER_ID%TYPE,
       p_username IN LMS_EMP_LOGIN_DET.USERNAME%TYPE,
       p_user_type IN LMS_EMP_LOGIN_DET.USER_TYPE%TYPE,
       p_Pass IN LMS_EMP_LOGIN_DET.PASSWORD%TYPE)
       
IS
l_User_type varchar2(150);
BEGIN
select max(user_type)
into l_User_type
from LMS_ADMIN_LOGIN_DET;

if (l_User_type = 'Admin') then
  INSERT INTO LMS_EMP_LOGIN_DET (USER_ID,USERNAME,USER_TYPE,PASSWORD) 
  VALUES (p_userid, p_username,p_user_type,p_pass);
ELSE
dbms_output.put_line('You Cannot have a permission to add new employee');
end if;
COMMIT;  
END;
```
```sql
exec LMS_ADMIN_INSERT_EMP_PROC ('E1003','HEMA','Employee','Welcome@123');
```
#####  .Remove on employee (Admin) query Using Procedure feature-4

```sql
CREATE OR REPLACE PROCEDURE LMS_ADMIN_REMOVE_EMP_PROC(p_userid varchar2)
       
IS
l_User_type varchar2(150);
BEGIN
select max(user_type)
into l_User_type
from LMS_ADMIN_LOGIN_DET;

if (l_User_type = 'Admin') then
 delete from LMS_EMP_LOGIN_DET
 where user_id = p_userid;
ELSE
dbms_output.put_line('You Cannot have a permission to delete');
end if;
COMMIT;  
END;
```
```sql
exec LMS_ADMIN_REMOVE_EMP_PROC ('E1003');
```

#### .Update Employee Details query feature-5

```sql
update LMS_EMPLOYEES_DET
set EMP.EMPLOYEE_CODE = 'E1020',
    EMP.EMPLOYEE_NAME = 'Raj',
    EMP.date_of_birth = '01-08-1990',
    EMP.hire_date = '07-04-2021',
    EMP.Gender = 'M',
    EMP.department = 'Oracle',
    EMP.position = 'Oracle Apps',
    EMP.place = 'Chennai',
    EMP.employee_type = 'Employee',
    EMP.manager_code = 'E1010'
where EMP.EMPLOYEE_CODE = 'E1005'
```



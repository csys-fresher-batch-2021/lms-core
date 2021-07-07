# Project Features
/*Project Title : Leave Management System  --- Module -2 (Leaves) */
--------------------------------------------------------------------------------------------

/*Employee Leave overall Details table*/

CREATE TABLE XX_EMP_LEAVE_DET (EMPLOYEE_ID NUMBER NOT NULL,EMPLOYEE_NAME VARCHAR2(150),DEPARTMENT_NAME VARCHAR2(150),
                               LEAVE_NAME VARCHAR2(150),LEAVE_CODE VARCHAR2(150) NOT NULL, LEAVE_START_DATE DATE,
                               LEAVE_END_DATE DATE,TOTAL_LEAVE NUMBER,LEAVE_REASON VARCHAR2(150),
                               CONSTRAINTS PK_EMP_LEAVE PRIMARY KEY (EMPLOYEE_ID,LEAVE_CODE));
---------------------------------------------------------------------------------------------
/*Insert data of Employee Leave Details*/

INSERT INTO XX_EMP_LEAVE_DET (EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
                              LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,LEAVE_REASON)
                              VALUES('E1001','ARUN','ORACLE','CASUAL LEAVE','CL','01-JAN-2002','05-JAN-2002',4,'FUNCTION')

                               
INSERT INTO XX_EMP_LEAVE_DET (EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
                              LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,LEAVE_REASON)
                              VALUES('E1002','SUDHARSAN','ORACLE APPS LOAD','MARRIAGE LEAVE','MGL','21-AUG-2021','21-SEP-2021',30,'MY MARRIAGE')
                              
INSERT INTO XX_EMP_LEAVE_DET (EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
                              LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,LEAVE_REASON)
                              VALUES('E1003','REKA','ORACLE FUSION TECH','MEDICAL LEAVE','MDL','15-JULY-2021','18-JULY-2021',2,'CORONA AFFECTED')

INSERT INTO XX_EMP_LEAVE_DET (EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
                              LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,LEAVE_REASON)
                              VALUES('E1004','KARTHI','ORACLE FUSION TECH CONSALTANT','VACATION LEAVE','VL','19-JULY-2021','20-JULY-2021',2,'TOUR')

INSERT INTO XX_EMP_LEAVE_DET (EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
                              LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,LEAVE_REASON)
                              VALUES('E1005','HEMALATHA','ORACLE FUNCTION CONSALTANT','ANNUAL LEAVE','AL','27-OCT-2021','29-OCT-2021',3,'TOUR')
---------------------------------------------------------------------------------------------
/*List all employee leaves*/
SELECT EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
      LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,TOTAL_ANNUAL_LEAVE,
      LEAVE_REASON,TOTAL_ANNUAL_LEAVE - TOTAL_LEAVE BALANCE_LEAVE
FROM XX_EMP_LEAVE_DET
ORDER BY 1 ASC;

/*List employee leaves*/
SELECT EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,LEAVE_CODE, 
      LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,TOTAL_ANNUAL_LEAVE,
      LEAVE_REASON,TOTAL_ANNUAL_LEAVE - TOTAL_LEAVE BALANCE_LEAVE
FROM XX_EMP_LEAVE_DET
WHERE EMPLOYEE_NAME = 'REKA'
ORDER BY 1 ASC;
---------------------------------------------------------------------------------------------
/* Apply Leave using Procedure*/
CREATE OR REPLACE PROCEDURE XX_EMP_APPLY_LEAVE_PROC (P_EMP_ID VARCHAR2,P_LEAVE_NAME VARCHAR2,P_START_DATE DATE,
                                                     P_END_DATE DATE,P_REASON VARCHAR2)  
AS
L_EMPLOYEE_ID VARCHAR2(150);
L_EMPLOYEE_ID_1 VARCHAR2(150);
L_EMPLOYEE_NAME  VARCHAR2(150);
L_DEPARTMENT_NAME VARCHAR2(150);
L_LEAVE_NAME  VARCHAR2(150);
L_LEAVE_CODE  VARCHAR2(150);
L_LEAVE_START_DATE DATE;
L_LEAVE_END_DATE DATE;
L_TOTAL_LEAVE NUMBER;
L_TOTAL_ANNUAL_LEAVE NUMBER;
L_LEAVE_REASON  VARCHAR2(500);
L_BALANCE_LEAVE NUMBER;
BEGIN
SELECT MAX(EMPLOYEE_ID)
INTO L_EMPLOYEE_ID_1
FROM XX_EMP_LEAVE_DET_V2
WHERE EMPLOYEE_ID = P_EMP_ID;

SELECT EMPLOYEE_ID,EMPLOYEE_NAME,DEPARTMENT_NAME,LEAVE_NAME,
       decode(LEAVE_CODE,'CL','CASUAL LEAVE','MGL','MARRIAGE LEAVE','MDL','MEDICAL LEAVE','VL','VACATION LEAVE','AL','ANNUAL LEAVE',LEAVE_CODE),
       LEAVE_START_DATE,LEAVE_END_DATE,LEAVE_START_DATE - LEAVE_END_DATE,TOTAL_ANNUAL_LEAVE,LEAVE_REASON,TOTAL_ANNUAL_LEAVE - TOTAL_LEAVE
      INTO L_EMPLOYEE_ID,L_EMPLOYEE_NAME,L_DEPARTMENT_NAME,L_LEAVE_NAME,L_LEAVE_CODE,L_LEAVE_START_DATE,
      L_LEAVE_END_DATE,L_TOTAL_LEAVE,L_TOTAL_ANNUAL_LEAVE,L_LEAVE_REASON,L_BALANCE_LEAVE 
FROM XX_EMP_LEAVE_DET
WHERE EMPLOYEE_ID = P_EMP_ID
AND LEAVE_NAME = P_LEAVE_NAME
AND LEAVE_START_DATE = P_START_DATE
AND LEAVE_END_DATE = P_END_DATE
AND LEAVE_REASON = P_REASON;
IF L_EMPLOYEE_ID IS NOT NULL THEN
UPDATE  XX_EMP_LEAVE_DET_V2
SET EMPLOYEE_ID = P_EMP_ID,
    EMPLOYEE_NAME = L_EMPLOYEE_NAME,
    DEPARTMENT_NAME = L_DEPARTMENT_NAME,
    LEAVE_NAME = P_LEAVE_NAME,
    LEAVE_CODE = L_LEAVE_CODE,
    LEAVE_START_DATE = P_START_DATE,
    LEAVE_END_DATE =P_END_DATE,
    TOTAL_LEAVE = L_TOTAL_LEAVE,
    TOTAL_ANNUAL_LEAVE = L_TOTAL_ANNUAL_LEAVE,
    LEAVE_REASON = P_REASON ,
    BALANCE_LEAVE = L_BALANCE_LEAVE
WHERE EMPLOYEE_ID = L_EMPLOYEE_ID;
else
dbms_output.put_line('error');
end if;
END;
/* Execusion Procedure*/
exec XX_EMP_APPLY_LEAVE_PROC ('E1003','VACATION_LEAVE','21-JULY-2021','24-JULY-2021','TOUR');
/* Check new apply leave in table*/
select *
from XX_EMP_LEAVE_DET_V2
---------------------------------------------------------------------------------------------
/* VIEW Employee Leave Balance*/
SELECT EMPLOYEE_ID,EMPLOYEE_NAME,TO_CHAR(to_date(LEAVE_START_DATE,'DD-MM-YY'),'DD-Mon-YYYY') LEAVE_START_DATE,
       TO_CHAR(to_date(LEAVE_END_DATE,'DD-MM-YY'),'DD-Mon-YYYY') LEAVE_END_DATE,TOTAL_LEAVE,TOTAL_ANNUAL_LEAVE,
       sum(TOTAL_ANNUAL_LEAVE - TOTAL_LEAVE) BALANCE_LEAVE
FROM XX_EMP_LEAVE_DET
where 1=1
group by EMPLOYEE_ID,EMPLOYEE_NAME,LEAVE_START_DATE,LEAVE_END_DATE,TOTAL_LEAVE,TOTAL_ANNUAL_LEAVE
order by 1 asc
---------------------------------------------------------------------------------------------
/* Leave Types Details table */
create table XX_LEV_TYPES(Emp_id varchar2(150),Leave_code varchar2(150),Leave_name varchar2(150),Leave_Status varchar2(150));
---------------------------------------------------------------------------------------------
/* Insert Leave Types Details */
insert into XX_LEV_TYPES (EMP_ID,LEAVE_CODE,LEAVE_NAME,LEAVE_STATUS) values ('E1001','CL','CASUAL LEAVE','CANCEL LEAVE');
insert into XX_LEV_TYPES (EMP_ID,LEAVE_CODE,LEAVE_NAME,LEAVE_STATUS) values ('E1002','MGL','MARRIAGE LEAVE','APPROVE');
insert into XX_LEV_TYPES (EMP_ID,LEAVE_CODE,LEAVE_NAME,LEAVE_STATUS) values ('E1003','MDL','MEDICAL LEAVE','REJECT LEAVE');
insert into XX_LEV_TYPES (EMP_ID,LEAVE_CODE,LEAVE_NAME,LEAVE_STATUS) values ('E1004','VL','VACATION LEAVE','APPROVE');
insert into XX_LEV_TYPES (EMP_ID,LEAVE_CODE,LEAVE_NAME,LEAVE_STATUS) values ('E1005','AL','ANNUAL LEAVE','CANCEL LEAVE');

select *
from XX_LEV_TYPES
---------------------------------------------------------------------------------------------
/* Cancel Leave of employee Query */
SELECT EMP.EMPLOYEE_ID,EMP.EMPLOYEE_NAME,EMP.DEPARTMENT_NAME,EMP.LEAVE_NAME,EMP.LEAVE_CODE, 
      EMP.LEAVE_START_DATE,EMP.LEAVE_END_DATE,EMP.TOTAL_LEAVE,EMP.TOTAL_ANNUAL_LEAVE,
      EMP.LEAVE_REASON,EMP.TOTAL_ANNUAL_LEAVE - EMP.TOTAL_LEAVE BALANCE_LEAVE,Leave_types.leave_status
FROM XX_EMP_LEAVE_DET EMP,
     XX_LEV_TYPES Leave_types
where EMP.EMPLOYEE_ID = Leave_types.EMP_ID
and Leave_types.leave_status = 'CANCEL LEAVE'
---------------------------------------------------------------------------------------------
/* Approve and Reject Leave of employee Query */
SELECT EMP.EMPLOYEE_ID,EMP.EMPLOYEE_NAME,EMP.DEPARTMENT_NAME,EMP.LEAVE_NAME,EMP.LEAVE_CODE, 
      EMP.LEAVE_START_DATE,EMP.LEAVE_END_DATE,EMP.TOTAL_LEAVE,EMP.TOTAL_ANNUAL_LEAVE,
      EMP.LEAVE_REASON,EMP.TOTAL_ANNUAL_LEAVE - EMP.TOTAL_LEAVE BALANCE_LEAVE,Leave_types.leave_status
FROM XX_EMP_LEAVE_DET EMP,
     XX_LEV_TYPES Leave_types
where EMP.EMPLOYEE_ID = Leave_types.EMP_ID
and Leave_types.leave_status in ('APPROVE','REJECT LEAVE')
order by 1 asc;
---------------------------------------------------------------------------------------------
/* Module -3 (User) */

/* Employee/Admin Login query*/
create table XX_LOGIN_DET (Employee_id varchar2(150), username varchar2(150),password varchar2(150));

insert into XX_LOGIN_DET values('E1001','Admin','Welcome@123');
insert into XX_LOGIN_DET values('E1002','Employee','Emp123');
insert into XX_LOGIN_DET values('E1003','Admin','System@123');
insert into XX_LOGIN_DET values('E1004','Employee','Sys@123');
insert into XX_LOGIN_DET values('E1005','Admin','User@123');

select *
from XX_LOGIN_DET
---------------------------------------------------------------------------------------------
/* List employee Details query*/
SELECT EMP.EMPLOYEE_ID,EMP.EMPLOYEE_NAME,EMP.DEPARTMENT_NAME,LOGIN.USERNAME
FROM XX_EMP_LEAVE_DET EMP,
     XX_LOGIN_DET LOGIN
where EMP.EMPLOYEE_ID = LOGIN.EMPLOYEE_ID
and LOGIN.USERNAME = 'Employee'
order by 1 asc;
---------------------------------------------------------------------------------------------
/* Add New employee (Admin) query*/
insert into XX_LOGIN_DET values('E1006','Admin','Amdin@123');
----------------------------------------------------------------------------------------------
/* Remove on employee (Admin) query*/
delete from XX_LOGIN_DET
where LOGIN.USERNAME = 'Admin'
-----------------------------------------------------------------------------------------------
/* Update Employee Details query*/
Update XX_LOGIN_DET Login
set login.EMPLOYEE_NAME = (select EMPLOYEE_NAME
                     from XX_EMP_LEAVE_DET
                     where Employee_id = login.employee_id)

select *
from XX_LEV_TYPES
-------------------------------------------------------------------------------------------------

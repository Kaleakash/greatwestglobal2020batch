--PL SQL or SQL Comments 
-- First Program 
set serveroutput on;
begin 
dbms_output.put_line('Welcome to Pl SQL');
end;
/



create table product(pd int, pname varchar(10), price float);

select * from product;


--Insert query using Pl SQL 
set serveroutput on;
begin 
insert into product values(4,'TV',55000);
insert into product values(5,'Computer',45000);
insert into product values(6,'Laptop',85000);
dbms_output.put_line('Record inserted successfully');
end;
/

--Delete query using Pl SQL 
set serveroutput on;
begin 
delete from product where pid =4;
dbms_output.put_line('Record deleted successfully');
end;
/

--Update query using Pl SQL 
set serveroutput on;
begin 
update product set price= price+2000 wheere pid=5;
dbms_output.put_line('Record update successfully');
end;
/

-- Pl SQL Selecdt query 
set serveroutput on
begin 
select * from employees;
dbms_output.put_line('Select query');
end;


-- PL SQL Variable 
set serveroutput on
declare 
a number;
begin 
dbms_output.put_line(a);
end;

-- PL SQL Variable with initialization
set serveroutput on
declare 
a number :=100;
begin 
dbms_output.put_line(a);
dbms_output.put_line('The value of a is '||a);
end;

-- dispaly your id, name, salary, desg ,doj     No SQL Code 



-- Addition of two number 
set SERVEROUTPUT ON; 
DECLARE A NUMBER :=100; 
B NUMBER :=20; 
S NUMBER :=A+B; 
BEGIN 
DBMS_OUTPUT.PUT_LINE(S); 
END; 


-- Not null varaible in Pl SQL 
set SERVEROUTPUT ON; 
DECLARE 
A NUMBER not null:=100; 
B NUMBER not null:=20; 
add number;
BEGIN
add := A+B;
DBMS_OUTPUT.PUT_LINE('Sum of two number is '|| add); 
END; 

-- constant variable 
set SERVEROUTPUT ON; 
DECLARE 
num constant number(10):=100;
begin 
dbms_output.put_line('Value is '||num);
--num :=200;
dbms_output.put_line('Value is '||num);
end;


-- Pl SQL Select Query with varaible concept 
set SERVEROUTPUT ON; 
declare 
v_salary NUMBER(10);
begin 
select salary into v_salary from employees where employee_id=101;
dbms_output.put_line('Salary is '|| v_salary);
end;


-- Display first_name,salary  from employees table using employee_id 

--Display first_name, department_name 
set serveroutput on;
declare 
v_employee_id number(10):=&id;
v_first_name varchar2(10);
v_dept_id number(10);
v_dept_name varchar2(20);
begin 
select first_name,department_id into v_first_name,v_dept_id from employees where employee_id=v_employee_id;
select department_name into v_dept_name from departments where department_id = v_dept_id;
dbms_output.put_line('Employee id is '|| v_employee_id);
dbms_output.put_line('Employee first_name '|| v_first_name);
dbms_output.put_line('Departmenet name '||v_dept_name);
end;
/


--Display first_name,department_name, city using Join take value runtime using &


select emp.first_name,dept_department_name,loc.city into v_first_name,v_dept_name,v_city from employees emp, departments dept, locations, loc 
where emp.department_id= dept.department_id and dept.location_id=loc.location.id and emp.employee_id=100;


-- Declare the variable using variable anchor 
set serveroutput on;
declare 
v_name employees.first_name%type;   -- load the data type as well as number of character. 
v_sal employees.salary%type;
begin 
select first_name,salary into v_name,v_sal from employees where employee_id=100;
dbms_output.put_line(v_name||' '||v_sal);
end;




-- if statmenet 

set serveroutput on;
declare 
n1 number(4):=100;
n2 number(4):=50;
begin 
if n1 > n2 then 
dbms_output.put_line('Yes');
end if;
end;

-- if else 
set serveroutput on;
declare 
n1 number(4):=100;
n2 number(4):=50;
begin 
if n1 > n2 then 
dbms_output.put_line('n1 is largest');
else 
dbms_output.put_line('n2 is largest');
end if;
end;

-- if else if or if ladder 
set serveroutput on;
declare 
per_marks number(5):=34;
begin 
if per_marks > 90 then 
dbms_output.put_line('D');
elsif per_marks > 80 then 
dbms_output.put_line('F');
elsif per_marks > 60 then 
dbms_output.put_line('S');
elsif per_marks > 45 then 
dbms_output.put_line('P');
else 
dbms_output.put_line('Fail');
end if;
end;

-- Simple loop 
set serveroutput on;
declare 
i number(4):=1;
n number(4):=10;
begin 

  loop 
    dbms_output.put_line(i);
    i := i + 1;  -- i++;
    exit when i >= n;
  end loop;

end;

-- while loop 
set serveroutput on;
declare 
i number(4):=1;
n number(4):=10;
begin 
  while i <= n 
  loop 
    dbms_output.put_line(i);
    i := i + 1;  -- i++;
  end loop;
end;

-- for loop 

set serveroutput on;
begin 
 for i IN 1..10 
  loop 
    dbms_output.put_line(i);
  end loop;
end;

-- Retrieve all records using loop from table 
set serveroutput on;
declare 
v_first_name employees.first_name%type;
v_salary employees.salary%type;
begin 
  for i in 100..110
  loop 
  select first_name,salary into v_first_name, v_salary from employees where employee_id=i;
  dbms_output.put_line('First Name is '||v_first_name);
  dbms_output.put_line('Salary is '||v_salary);
  end loop;
end;

-- retrive more than one records using loop with if conditions 
set serveroutput on;
declare 
v_first_name employees.first_name%type;
v_salary employees.salary%type;
flag number(10);
begin 
  select count(*) into flag from employees where salary > 9000;
  dbms_output.put_line('number of emp are '||flag);
  for i in 100..110
  loop 
  select first_name,salary into v_first_name, v_salary from employees where employee_id=i;
  if v_salary > 6000 then 
    dbms_output.put_line('First Name is '||v_first_name);
    dbms_output.put_line('Salary is '||v_salary);
  end if;
  end loop;
end;


--VArray Example 
set serveroutput on;
declare 
type numberDetails is varray(5) of number(10);
num numberDetails;
begin 
num := numberDetails(100,200,300,400,500);
dbms_output.put_line('First number is '||num(1));
dbms_output.put_line('Second number is '||num(2));
dbms_output.put_line('Third number is '||num(3));
dbms_output.put_line('Fourth number is '||num(4));
dbms_output.put_line('Fifth number is '||num(5));
end;

--VArray Example assign the value later on  
set serveroutput on;
declare 
type numberDetails is varray(5) of number(10);
num numberDetails;
flag number(10):=1111;
begin 
num := numberDetails(0,0,0,0,0);  
num(1) :=100;
dbms_output.put_line('First number is '||num(1));
dbms_output.put_line('Size of array is '||num.count);
for i in 1..5
      loop 
        num(i) := flag;
        flag := flag +10;
      end loop;
      dbms_output.put_line(num(3));
end;

-- Display 5 records with details as first_name, department_name using VArray 1st to load the data using join and 2nd to display the data. 

-- Using nested table 
set serveroutput on;
declare 
type names is table of varchar2(10);
v_name names;
begin 
v_name := names('Raj','Ravi','Ramesh','Rajesh');
dbms_output.put_line(v_name(1));
dbms_output.put_line(v_name(2));
dbms_output.put_line(v_name(3));
dbms_output.put_line(v_name(4));
end;

-- Using nested table 
set serveroutput on;
declare 
type names is table of varchar2(10);
v_name names;
begin 
v_name := names(null,null,null,null,null);
v_name(1):='Ajay';
v_name(2):='Vijay';
v_name(3):='Ramesh';
v_name(4):='Dinesh';
dbms_output.put_line(v_name(1));
dbms_output.put_line(v_name(2));
dbms_output.put_line(v_name(3));
dbms_output.put_line(v_name(4));
end;

-- From table 

set serveroutput on;
declare 
--type names is table of varchar2(10);
type names is table of employees.first_name%type;
v_name names;
flag number(10):=100;
begin 
v_name := names(null);
for i in 1..5
loop 
select first_name into v_name(i) from employees where employee_id=flag;
v_name.extend();
flag := flag+1;
end loop;
dbms_output.put_line('3rd employee name is '|| v_name(3));
end;


-- Record Simple Example 
set serveroutput on;
declare 
type recordEmployee is record(r_id number(10), r_name varchar2(10), r_salary number(10,2));
emp_rec_var recordEmployee;
begin 
select employee_id,first_name,salary into emp_rec_var.r_id,emp_rec_var.r_name,emp_rec_var.r_salary from employees where employee_id=100;
dbms_output.put_line('Id is '|| emp_rec_var.r_id);
dbms_output.put_line('Salary is '|| emp_rec_var.r_name);
dbms_output.put_line('Name is '|| emp_rec_var.r_salary);
end;


-- Record Simple Example without table 
set serveroutput on;
declare 
type recordEmployee is record(r_id number(10), r_name varchar2(10), r_salary number(10,2));
emp_rec_var recordEmployee;
begin 
emp_rec_var.r_id :=111;
emp_rec_var.r_name:='Ajay';
emp_rec_var.r_salary:=34000;
dbms_output.put_line('Id is '|| emp_rec_var.r_id);
dbms_output.put_line('Salary is '|| emp_rec_var.r_name);
dbms_output.put_line('Name is '|| emp_rec_var.r_salary);
end;

-- Record Simple Example -- Variable anchor 
set serveroutput on;
declare 
type recordEmployee is record(r_id employees.employee_id%type, 
r_name employees.first_name%type, 
r_salary employees.salary%type);
emp_rec_var recordEmployee;
begin 
select employee_id,first_name,salary into emp_rec_var.r_id,emp_rec_var.r_name,emp_rec_var.r_salary from employees where employee_id=100;
dbms_output.put_line('Id is '|| emp_rec_var.r_id);
dbms_output.put_line('Salary is '|| emp_rec_var.r_name);
dbms_output.put_line('Name is '|| emp_rec_var.r_salary);
end;

--FirstName,DeparName,City using Records with anchor type data type concept. 

set serveroutput on;
declare 
emp_rec employees%rowtype;
dept_rec departments%rowtype;
city_rec locations%rowtype;
begin 
select first_name,salary into emp_rec.first_name, emp_rec.salary FROM employees where employee_id=100;
dbms_output.put_line('First name is '|| emp_rec.first_name);
dbms_output.put_line('Salary is '|| emp_rec.salary);
end;

--FirstName,DeparName,City using Records with rowtype 




-- First Exception example 
set serveroutput on;
declare 
a number(2):=10;
result number(2);
begin 
result := a/0;
dbms_output.put_line('Result is '||result);
exception 
  when others then 
  dbms_output.put_line('Exception generated');
end;


-- Second Exception example withe error code and message 
set serveroutput on;
declare 
a number(2):=10;
result number(2);
begin 
result := a/0;
dbms_output.put_line('Result is '||result);
exception 
  when others then 
  dbms_output.put_line('Exception generated');
  dbms_output.put_line(SQLCODE);
  dbms_output.put_line(SQLERRM);
end;

-- Zero_divide exception 

set serveroutput on;
declare 
a number(2):=10;
result number(2);
v_name varchar2(10);
begin 
result := a/1;
dbms_output.put_line('Result is '||result);
select first_name into v_name from employees where employee_id=1111;
dbms_output.put_line('First name is '||v_name);
--insert into product values(100,'Abc',10000,21);
--dbms_output.put_line('Record inserted');
exception 
  when zero_divide then 
  dbms_output.put_line('Divided by zero');
  when too_many_rows then 
  dbms_output.put_line('to many recods found');
  when no_data_found then 
  dbms_output.put_line('no data present');
  when others then 
  dbms_output.put_line('to many recods found');
  dbms_output.put_line(SQLCODE);
  dbms_output.put_line(SQLERRM);
end;

-- Pre-defined error but user-defined name
set serveroutput on;
declare 
dup_rec exception; -- created the variable of type exception 
foreign_key_exception exception;
pragma exception_init(dup_rec,-1); -- register that exception using pre-defined procedure 
pragma exception_init(foreign_key_exception,-02291);
begin
  --insert into trainer values(1,'Ravi','Java');
  --dbms_output.put_line('REcord inserted');
  insert into student values(1,'Seeta',21,2);
  dbms_output.put_line('Record inserted successfully');
exception 
  when dup_rec then 
  dbms_output.put_line('Primay key exception - record already present');
  when foreign_key_exception then 
  dbms_output.put_line('foreign key exception - record must present in primary - trainer table');
  when others then 
  dbms_output.put_line('Generic Exception');
  dbms_output.put_line(SQLCODE);
end;

--Foreign key error code and create user-defined name for FK Exception 

select * from trainer;
select * from student;
insert into student values(1,'Seeta',21,2);




-- user-defined or custom exception 
set serveroutput on;
declare 
a number(2):=10;
b number(2):=50;
my_exc exception;
pragma exception_init(my_exc,-20001);
begin 
  if a >b then 
  raise my_exc;
  else 
--  dbms_output.put_line('No Exception');
   raise_application_error(-20002,' value of b is > a'); -- call pre-defined procedure to throw the exception depending upon the conditions. 
  end if;
exception 
  when my_exc then 
  dbms_output.put_line('User defined exception generated');
    dbms_output.put_line(SQLCODE);
  when others then 
  dbms_output.put_line('Generic');
    dbms_output.put_line(SQLCODE);
end;

-- user-defined or custom exception 
set serveroutput on;
declare 
a number(2):=10;
b number(2):=50;
begin 
  if a >b then 
  dbms_output.put_line('Yes');
  else 
   raise_application_error(-20002,' value of b is > a'); -- call pre-defined procedure to throw the exception depending upon the conditions. 
  end if;
end;

set serveroutput on;
begin 
delete from employees where employee_id=12345;
  if sql%found then
    dbms_output.put_line('Record deleted successfully');
  else 
    dbms_output.put_line('Record not deleted');
  end if;
end;


-- try with user-defined with sql%found, sql%notfound and sql%rowcount (number)

--Explicit or user-defined cursor example 
set serveroutput on;
declare 
cursor emp_cur is select * from employees;
begin 
dbms_output.put_line('Cursor Example');
  open emp_cur;
 if emp_cur%isopen then
 dbms_output.put_line('Cursor open');
 else 
 dbms_output.put_line('Cursor not open');
 end if;
end;


--Explicit or user-defined cursor example 
set serveroutput on;
declare 
cursor emp_cur is select * from employees;
emp_rec employees%rowtype;    -- please check this code while working on 2nd question create the record with help of cursorName with rowtype
begin 
dbms_output.put_line('Cursor Example');
  open emp_cur;
 fetch emp_cur into emp_rec;
 dbms_output.put_line('Employee id is '||emp_rec.employee_id||' employee name is ' || emp_rec.first_name || ' Employee salary is ' ||emp_rec.salary);
  fetch emp_cur into emp_rec;
 dbms_output.put_line('Employee id is '||emp_rec.employee_id||' employee name is ' || emp_rec.first_name || ' Employee salary is ' ||emp_rec.salary);
 close emp_cur;
end;


-- try to display all records using cursor using loop till end 


-- try to display first_name,department_name, city using cursor 

set serveroutput on;
declare 
cursor emp_dept_cur is select emp.first_name,dept.department_name from employees emp, departments dept where emp.department_id=dept.department_id;
emp_dept_rec emp_dept_cur%rowtype;    -- please check this code while working on 2nd question create the record with help of cursorName with rowtype
begin 
dbms_output.put_line('Cursor Example');
  open emp_dept_cur;
    fetch emp_dept_cur into emp_dept_rec;
 dbms_output.put_line('First name is '|| emp_dept_rec.first_name||'Department Name is '|| emp_dept_rec.department_name);
 close emp_dept_cur;
end;

select emp.first_name,dept.department_name from employees emp, departments dept where emp.department_id=dept.department_id;


-- passig two parameter in in mode 

create or replace procedure p1(n1 in number,n2 in number) 
as 
add number(10);
begin 
add := n1+n2;
dbms_output.put_line('Sum is '||add);
end p1;

drop procedure p1;

--call the procedure from another block 
begin 
p1(10,20);   -- calling the procedure 
end;

exec p1();    --calling the procedure 

-- Create one procedure to store records in project or any table id,name,salary or pid,pname,price etc 

create or replace procedure addNumber(a in number, b in number, add out number)   -- procedure can return more than value using out parameter 
as 
begin 
add := a+b;
end addNumber;

declare 
result number(10);
begin 
addNumber(100,200,result);
dbms_output.put_line('Sum of two number is '||result);
end;

--- Pass Employee id as in get City Name as out  


create or replace procedure changeValue(a in out number) 
as 
begin 
a := a+100;
end changeValue;

set serveroutput on;
declare 
num number(3):=100;
begin 
dbms_output.put_line(num);
changeValue(num);
dbms_output.put_line(num);
end;


create or replace function sayHello(name in varchar) 
return VARCHAR
as 
msg varchar(50);
begin 
msg:='welcome '||name;
return msg;
end sayHello;


select sayHello('Ravi') from dual;

select sayHello(first_name) from employees;

create table empinfo(empid int primary key,name varchar(10), salary float);


create table empinfo_track(trackId int primary key,dateinfo date);

--create sequence track_seq

create or replace trigger product_history 
before 
insert 
on 
empinfo
for each row 
begin 

insert into empinfo_track values(track_seq.nextval,sysdate);
end product_history;

select * from empinfo;

insert into empinfo values(1,'Raj',12000);
insert into empinfo values(2,'Ravi',14000);
insert into empinfo values(3,'Ramesh',16000);
insert into empinfo values(4,'Rajesh',18000);

select * from empinfo_track;

select to_char(dateinfo,'HH:MI:SS') from empinfo_track;




drop table product;

create table product(pid int primary key,pname varchar2(10), price float);

create table product_transaction_details(pid int, pname varchar2(10), oldPrice float, newPrice float);


create or replace trigger product_transaction 
after
update 
on 
product 
for each row 
begin 

insert into product_transaction_details values(:old.pid,:old.pname,:old.price,:new.price);

end product_transaction;


insert into product values(1,'TV',110000);
insert into product values(2,'Laptop',160000);
insert into product values(3,'Mobile',95000);

select * from product_transaction_details;
select * from product;

update product set price = price - 30000 where pid=1;
update product set price = price - 15000 where pid=2;
update product set price = price + 2000 where pid=3;
update product set price = price - 30000 where pid=1;

-- declaration part 
create or replace package mypack 
as 
procedure p1(n1 in number);
procedure p2(n1 in number, n2 in number); 
end mypack;

--implementation part 
create or replace package body mypack 
as 
procedure p1(n1 in number)
as 
begin 
  dbms_output.put_line('This is 1 parameter procedure');
end p1;

procedure p2(n1 in number, n2 in number) 
as 
begin 
   dbms_output.put_line('This is 2 parameter procedure');
end p2;

end mypack;

set serveroutput on;
begin 
mypack.p1(100);
mypack.p2(1,2);
end;
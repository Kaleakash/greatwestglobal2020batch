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


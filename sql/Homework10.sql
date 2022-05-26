--문제1
select first_name || ' ' || last_name as name, job_title, department_name, hire_date, salary, 
    case when salary>10000 then 'S' when salary>8000 then 'A'
            when salary>6000 then 'B' when salary>4000 then 'C' else 'D' end as salary_grade
    from employees emp, departments dept, jobs
    where emp.department_id=dept.department_id and emp.job_id=jobs.job_id;
    
--문제2
select employee_id, first_name || ' ' || last_name as name, (select job_title from jobs where emp.job_id=jobs.job_id) as job_title, hire_date,
    (select city from locations loc, departments dept 
     where emp.department_id = dept.department_id and dept.location_id = loc.location_id) as city
    from employees emp
    where (select city from locations loc, departments dept where emp.department_id = dept.department_id and dept.location_id = loc.location_id) 
                = (select city from locations where city like 'O%');

--문제3
select employee_id, first_name || ' ' || last_name as name, salary, round(salary*1.123,0) as increase_salary
    from employees
    where department_id = 60;
# OfficeSports

Use Case: **Registering a team for a sport** 

A sport has 
* a maximum limit for number of teams participating. 
* a team_size 

Therefore, when a team is being registered, against a sport 
1. Check teams_max (max limit for no. of teams) for the sport from the *Sports* table 
2. Check ``count(team_id)`` for the sport from the *Event* table 
3. Check team_size (size of the team required) for the sport from the *Sports* table 
4. Check ``count(emp_id)`` for the team to find the size of the team from the *Team* table 
5. If 
  * number of teams for registered for the sport is less that max allowed limit, and 
  * number of employees in the team is equal or greater than required team size for the sport, 
  then register the team in the *Event* table 
  
New Use Case: **Adding an employee to a team** 

An employee can participate in maximum 3 events

Therefore, when an employee is being added to a team 
Check ``count(event_id)`` for the employee from the *EmployeeEvent* table 
If number of events the employee is registered is less than 3, then add the employee to a team in the *Team* table.

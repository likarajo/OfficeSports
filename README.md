# OfficeSports
Database and REST CRUD operations for Office Sports event

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

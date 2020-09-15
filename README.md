# Job-Search-Platfomr
This project is for student to do a job search for their interesting companies, position and etc, and also create a interface for employer to have a check or reply to the students.

We have three member in our group, in this assignment, my job is creating the user interfaace, providing the data taken from user input to SQL. The file named "logingui" and "employeeUI", also part of "User_ui"are done by me, most of the SQL part is done by my teammate.

For the user who wants to use this application, the project.sql file should be added to the local database.
If the user's local port is not 3306, or username is not equal to root, or password is not equal to root please change in the db.properties file.
If the user sees the error java.sql.SQLNonTransientConnectionException: No operations allowed after connection closed which is due to the default wait_time setting.
This error can be resolved by re-run or set the wait_timeout longer in my.cnf file.


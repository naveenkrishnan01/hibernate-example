# Hibernate Example

In this example the code shows how using Java annotations we can use Hibernate framework to psush data to a Database , in this case MYSQL

Following steps to set up Hibernate
  - Install MySQl workbench and create a database with a table
  - A program to ensure that JDBC connection between the database and the program
  - Hibernate config file to setup access to the db
  
# Process and Output  
  - Java class entity program to map the Java variable fields to the table fields in the DB which also contain the getter/setter methods for these fields
  - Main program which has the one time creation of the session-factory. Use the session to create objects, start transaction, save and commit transaction.
  - Verify the output in the database which would have inserted the record in the table

### Additional Comments
Here the sample code is demonstrated using Java annotation for Hiberante.

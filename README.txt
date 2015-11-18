1. Entire source code is in the folder ‘EBMS_SourceCode’.

2. Inspection-code-TechFreak.docx has the code for the core functionalities in our project ‘Electricity bill management system’.

3. Download ‘EBMS_SourceCode’ folder from GIT repository.

4. Automated JUnit test cases are located at SETechFreak\test\cseb

5. All compiled .class files are located at SETechFreak\CSEB\classes\cseb\build

6. Folder CSEB is the master project folder where all source code, compiled codes and JAR files are located. It will be required to load the entire folder in Net beans to run the project.

7. SETechFreak\Deliverable III.docx is the deliverable 3 doc file. All the detailed steps about how to run the project are included here.

************Steps to execute project******************
Download and install MySQL installer and NetBeans IDE 8.1 and setup java environment.

Create a database with name 'cseb' and corresponding database tables by using "cseb.sql" file.

Add new System DSN for MySQL database with name 'cseb'.

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "CSEB.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, none of the
classpath elements are copied to the lib folder. In such a case,
you need to copy the classpath elements to the lib folder manually after the build.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
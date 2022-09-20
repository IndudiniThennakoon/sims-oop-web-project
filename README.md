# **🏫 SIMS -  School Information Management System**

#### 🔖 Object Oriented Programming with Java + JSP & Servlets Web Application.
  In this assignment, we are developing a web application using Java web-based technologies. 
 
      ✅ Java (Web Dynamic Application)   
      ✅ JSP - Java Server Pages   
      ✅ Servlets    
      ✅ MySql


### 🏷️ Prerequisites

- Have **JDK** installed
- Have **Apache Tomcat Server** installed (or **XAMPP**)
- Have **MySQL** installed (or **XAMPP**) 
- Have **Eclipse** installed

#### 🔛 This Developed On: 
       ☑️ JDK 15 / Dynamic Web Module 3.1
       ☑️ XAMPP-8.1.6-0-VS16 + Apache Tomcat/8.5.78
       ☑️ XAMPP-8.1.6-0-VS16 + Mysql Ver 15.1
       ☑️ Eclipse IDE 2022‑06


### 🏷️ Installation

1.  Fork, Clone or Download this Repository.
2.  Add Project Folder to Your Local PC `eclipse-workspace`. ( or Clone to directly to it)
3.  Open Project in `Eclipse IDE`.
4.  In IDE Go to `Window -> Show View -> Servers`.
5.  Click `Create a New Server Link`.
6.  Then Select Tomcat Server Version in `Apache` dir and Click Next. (Recommend to use: `Tomcat v8.5 Server`)
    
      > Before that, you have to Identify what is your installed Tomcat version. If you are using XAMPP then you can check that by `XAMPP C-Panel`.  Start `Tomcat` -> Go to <a href="http://localhost:8080/">http://localhost:8080/</a>
    
7.  Then Browse Tomcat Installation Dir and Click Next then Finish.
    
      > The previously selected version should be already installed. If you are using XAMPP then you can select this directory ` C:\xampp\tomcat `

8.  Then Create `lib` Folder in ` src\main\webapp\WEB-INF ` dir. (if `lib` dir is there not)
9.  Then Copy JAR Files From ` sims-oop-web-project\external-libraries ` dir to `lib` dir. 

      > <a href="https://jar-download.com/?search_box=mysql-connector-java-8.0.30" target="_blank">mysql-connector-java-8.0.30.jar</a>
      
      > <a href="https://jar-download.com/?search_box=javax.servlet-api-4.0.1" target="_blank">javax.servlet-api-4.0.1.jar</a>
      
      > <a href="https://jar-download.com/?search_box=servlet-api-4.0.0" target="_blank">servlet-api-4.0.0.jar</a>
      
      > <a href="https://jar-download.com/?search_box=jstl-1.2" target="_blank">jstl-1.2.jar</a>
      
      > <a href="https://jar-download.com/?search_box=jstl-api-1.2-rev-1" target="_blank">jstl-api-1.2-rev-1.jar</a>

10. Add Libraries to Project

        Go to Project Properties 
        -> Java Build Path -> Libraries -> Classpath 
            If the Classpath have already JAR files, select all JARs and remove those from classpath
        -> Add JARs -> Select JARs from src\main\webapp\WEB-INF\lib 
        -> Ok and Apply

11. Then Set Environment Variables in `env.properties`. (If they're not correct values or not set critical values)

12. Go to ` com.sims.project.db_environment_initializer ` Package dir. (See in Project -> Java Resource/src/main/java)
13. Run Java Application Files. (Right click `.java file -> Run As -> 2 Java Application`)
        
        1. CreateDatabase.java
        2. MigrateTables.java
        3. InsertDefaultEntries.java (If you want)
        
14. Change Host URL Path. 

        Go to IDE Project Explorer 
        -> Servers -> Tomcat -> server.xml 
        -> Find project root name (sims-oop-web-project) in server file 
            if can't find <Context> element, project `Run on Server` one time 
        -> Change path attribute to ` path="/" ` on Context element 
        -> Save 

15. **Run** Web Project. 

         > Right click Project main root `Run As -> 1 Run on Server`
         > Choose Server `localhost -> Tomcat Server`
         > Check `Always use this server ....`
         > Click Next and Finish

_____________________

### 🔖 Project Group Details

* Project Group ID: SE/OOP_MLB_WD_2022_S2_104
* Batch No: Y2.S1.WD.IT.3.1
* Topic: Online School Information Management System
* Module: Object-Oriented Programming
* Project link: 
* Project Github link: 

## Online School Information Management System

| Registration Number | Name | Email | Contribution |
| :---: | :---: | :---: | :---: |
| <b>IT21169908</b> | <b>Prashantha K.G.M</b> | <b>it21169908@my.sliit.lk</b> |  |
| IT21156410 | Fonseka M.M.N.H | it21156410@my.sliit.lk |  |
| IT21156038 | N.K.N.Nawanjala | it21156038@my.sliit.lk |  |
| IT21170966 | Thennakoon T.M.I.C | it21170966@my.sliit.lk |  |

______________

![java+jsp+servlets-150](https://user-images.githubusercontent.com/99706983/191255194-30daa1eb-09e7-4dd8-801b-2ce67c8ed9cb.png)

<sub><sup>📌documented by @Prashantha K.G.M 2022</sup></sub>



# Java-Bootcamp-Day-33--Exercise-Repository-

2025-08-05T12:23:08.716-08:00  INFO 27816 --- [Users management] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: drop table if exists user
Hibernate: create table user (age integer not null, id integer not null auto_increment, email varchar(255) not null, name varchar(255) not null, password varchar(255) not null, role varchar(255) not null, username varchar(255) not null, primary key (id)) engine=InnoDB
Hibernate: alter table user add constraint UKob8kqyqqgmefl0aco34akdtpe unique (email)
Hibernate: alter table user add constraint UKsb8bbouer5wak8vyiiy4pf2bx unique (username)
2025-08-05T12:23:09.460-08:00  INFO 27816 --- [Users management] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-08-05T12:23:09.824-08:00  INFO 27816 --- [Users management] [           main] o.s.d.j.r.query.QueryEnhancerFactory     : Hibernate is in classpath; If applicable, HQL parser will be used.
2025-08-05T12:23:10.642-08:00  WARN 27816 --- [Users management] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-08-05T12:23:11.120-08:00  INFO 27816 --- [Users management] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-08-05T12:23:11.134-08:00  INFO 27816 --- [Users management] [           main] c.e.u.UsersManagementApplication         : Started UsersManagementApplication in 7.5 seconds (process running for 8.566)
2025-08-05T12:23:32.311-08:00  INFO 27816 --- [Users management] [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-08-05T12:23:32.312-08:00  INFO 27816 --- [Users management] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2025-08-05T12:23:32.315-08:00  INFO 27816 --- [Users management] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: insert into user (age,email,name,password,role,username) values (?,?,?,?,?,?)
Hibernate: select u1_0.id,u1_0.age,u1_0.email,u1_0.name,u1_0.password,u1_0.role,u1_0.username from user u1_0
Hibernate: select u1_0.id,u1_0.age,u1_0.email,u1_0.name,u1_0.password,u1_0.role,u1_0.username from user u1_0 where u1_0.username=?
Hibernate: select u1_0.id,u1_0.age,u1_0.email,u1_0.name,u1_0.password,u1_0.role,u1_0.username from user u1_0 where u1_0.email=?
Hibernate: select u1_0.id,u1_0.age,u1_0.email,u1_0.name,u1_0.password,u1_0.role,u1_0.username from user u1_0 where u1_0.role=?
Hibernate: select u1_0.id,u1_0.age,u1_0.email,u1_0.name,u1_0.password,u1_0.role,u1_0.username from user u1_0 where u1_0.age>=?
Hibernate: select u1_0.id,u1_0.age,u1_0.email,u1_0.name,u1_0.password,u1_0.role,u1_0.username from user u1_0 where u1_0.age>=?


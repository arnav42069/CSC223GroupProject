# CSC223GroupProject
Programming Project that handles classes with Admins, Students and Instructors

MEGA Link: https://mega.nz/fm/VDIlXZ4A
**Overview**

You’ve been asked by a community college to help them develop a prototype of a class
registration system that would allow them to schedule classes online. This system would handle
many tasks. It would allow students to be registered into the system. Once a student is
registered, they should be able to add and drop classes. If a class is full, the student has the
option to join the waitlist for that class. If a spot opens, the first student on the waitlist is moved
from the waitlist to the class.
This system also must manage the faculty members who teach the classes. Every class should
have an instructor assigned to it, but a class can be initially scheduled with no instructor. The
full-time faculty members must teach 15 credits during a semester. There must be enough
classes for the faculty member to teach. If there aren’t enough classes, one of the part-time
faculty classes can be reassigned to teach a class by a full-time faculty member. If there are no
such available courses, the faculty member with the least seniority would lose their job and their
other classes would have to be reassigned to other instructors.
Administrators are the ones who schedule classes and assign faculty members to teach those
classes. They can add or remove courses. A course can also be canceled for low enrollment
which would cause the students to be removed from the course along with the faculty member.
This prototype should try to accomplish as many of these requirements as possible, but since it is
a prototype not everything has to be implemented. To limit the scope of this prototype, the
implementation only has to schedule computer science classes.


**Administrator Role**

The system should allow any administrator to login to the system using a common username and
password. Once the administrator has logged in, they have options reserved for them. They can
add or cancel a class. They can assign a faculty member to teach a specific class. They can also
hire additional part-time faculty or full-time faculty when enrollment is high and more classes
need to be opened. They also let go of part-time faculty and full-time faculty when enrollment
drops unexpectedly, but they should do using a seniority system by removing the most recently
added professors. A class should have a three letter abbreviation (ex. CSC) , three digit number
(223), a section number, and specific time. A faculty member cannot be assigned to teach a
class that conflicts with another class that they are teaching.
**Students’ role**
Students can apply to the college. Once a student applies, they are automatically entered into the
system unless that student is already in the system. The system should check if the student with
same name and same birthdate are already in the system. If they are already in the system,
they’ll be told to login using their existing account. If the student isn’t already in the system,
they are assigned a student id along with storing their name and birthdate. The student will need
to select a username and password.
Once a student has logged in, they will have the option to add or drop courses. They can also
view the courses they are currently enrolled in. A student can’t enroll in the same course twice or
enroll in two different sections of the same course.

**Faculty’s role**

A faculty member can also log in to the system. They should be able to see which classes they
are assigned to teach for the current semester. They should be able to view all the students in the
classes they are assigned to as well as any students on the waiting list for any course they are
teaching. Faculty do not have any control over which students are added to the course.
General Guidelines
This project will be assigned to a group of 3 students. If a group of two students or less were
created then in these circumstances a group of 4 students will be allowed. The students in the
group should attempt to design the system before trying to program it. This step is important
because it will divide the work of this larger project into smaller components which can be
handled by an individual student.
This entire project must be done using object-oriented principles and programming. The use of
interfaces, exception handling, type parameters and type arguments, inheritance, and others
should be used when appropriate. You must also use abstract data types (ADTs) when storing
large amounts of data and use the appropriate implementation depending on the requirements of
the system. Students are encouraged to reuse any files developed in class or as part of homework
assignments. Reusing these files will reduce the amount of work that is required for this project.
It is important to note that some of these files may require modification to work correctly in the
context of this system. You may not use any ADTs that are part of the Java Library.



**Grading**

You do not need to implement every specific requirement of this system to receive full points for
this project. The project grading will be based on whether group was able to put together a
reasonable implementation of the requirements of the project. The professor will be the judge of
what is reasonable in this context. Partial credit can be earned if full points are not earned.
Students have the option to earn extra credit by doing a presentation of their software which
includes a demonstration of their project during the professor’s office hours. This presentation
will require each student in the group to explain the part of the program they worked on. The
extra credit option requires all members of a group to present during the presentation otherwise
the extra credit cannot be earned by any member. Please email me to schedule a time for the
presentation if your group opts for this option. Every student in the same group will receive the
same points for the project.
The presentations must take place the day by the due date. Please check the Syllabus for that
exact date. Regardless of whether students opt for the presentation option, every group must
submit their files on Canvas by the due date listed on Canvas.

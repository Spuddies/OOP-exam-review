# OOP Coding Test — Review and Reflection

## 1. My Original Examination Grade

### Task 1 — /40
**My mark:**
40/40
**Why I awarded this mark:**
To my understanding I completed everything task 1 asked for I was missing setters and getter, but I don't know where to deduct marks for that or if to do so and if they were I would deduct 5-10 marks 


### Task 2 — /40
**My mark:**
5/40

**Why I awarded this mark:**
the registration loop was just in main not in a method that gets called, and it only had partial functionality and was missing validation

### Task 3 — /20
**My mark:**
2/20

**Why I awarded this mark:**
the only thing that worked was displaying the hashset of ids, but I would always have an empty position

**Total self-assessed grade:** /100

47/100

## 2. Corrections and Improvements

Describe two or three important problems you identified
in your original code. Explain what you changed and
why it works now.
problem 1:
ID.add(input.nextLine()); using nextLine mean the first position of my hashset was blank and I couldn't catch a blank input changing it to 

System.out.println("enter student IDs");
String studentID = input.nextLine();

            if (studentID.trim().isEmpty()) {
                System.out.println("Student ID cannot be empty");
                i--;
                continue;
            }
boolean added = ID.add(studentID);

this fixed both problems
## 3. Reflection

**What did you understand during the examination
but struggle to implement?**

hashset validation

I didn't understand how to validate a hashset knowing that when the hashset receives an input it only returns true or false
I somewhat figured how to do a little of it but too late into the exam.

setters and getters

I made a bunch of setters and getters right at the start of the exam and ended up deleting them as they were unused but I should have been calling them from main and not using the variables themselves.

**What was the most important thing you learned
from correcting your code?**

1:
You mentioned that Java was built off of C and that some peoples Java code looks like C I think I am one of those people as im most familiar with C and when I receive a test like this or a lab I figure out a solution as if it was C I need to get rid of this bad habit

2:Time I think even with the knowledge I have now completing this exam perfectly in the allotted time is really difficult as small mistakes can eat up a lot of time and I think group B had a slightly easier exam as they were using arraylists which we were much more familiar with because we used it in our labs compared to hashsets which besides talking about them in a lecture this was the first time using them and most people from what ive gathered used most of their time on the exam trying to implement it also my and many others cheatsheet was set up using arraylists making a good portion of it irrelevant to the exam

**What would you do differently in your next
coding test?**

Not rely on my cheatsheet so much and try and code out more of the program even if things are not working
because getting hung up on small mistakes slows you down a lot and in the exam I said to myself that I would put most of what I had in main into a method and add validation at the end when I was finished
but i never even got close to those parts as I was stuck on the hashset for a long time making it so I couldn't get some of the easier marks going and try and think and code in a more Java oriented mindset rather than C.

---

## Review lab assessment and mark recovery

The **review lab** is graded separately out of 20 marks:

| Review criterion | Maximum marks |
|---|---:|
| Original self-assessment and supporting evidence | 4 |
| Explanation of mistakes and Java concepts | 6 |
| Corrections and improvements | 4 |
| Testing and demonstration | 4 |
| Reflection | 2 |
| **TOTAL** | **20** |

You can recover **up to 30% of the marks you lost** in the original examination. The actual amount depends on your review lab grade. Your lecturer's examination grade, **not your self-awarded mark**, is used in the calculation.

**Marks recovered = (100 − original exam mark) × 0.30 × (review lab mark ÷ 20)**

**Revised exam mark = original exam mark + marks recovered**

For example, an original examination mark of 40/100 and a review lab mark of 16/20 would recover 14.4 marks, giving a revised result of **54.4/100**.

The aim is to show that you understand your mistakes and can explain your improvements. Simply copying a working solution does not demonstrate this understanding.


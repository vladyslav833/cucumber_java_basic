### Structure
#### Same but without Page Object:
* For running tests use [CucumberRunner.java](../master/src/test/java/runners/CucumberRunner.java)
* For step definition use [SampleSteps.java](../master/src/test/java/stepDefinitions/SampleSteps.java)
* Simple scenario example: [Sample1.feature](../master/src/test/resources/features/Sample1.feature)
* Simple scenario with parameters in steps: [Sample2.feature](../master/src/test/resources/features/Sample2.feature)
* Scenario outline example: [Sample3.feature](../master/src/test/resources/features/Sample3.feature)

### Tasks
#### Task 1
In [Task1.feature](../master/src/test/resources/features/Task1.feature) create 1 scenario outline and
1 scenario for page with url:
"https://kristinek.github.io/site/tasks/enter_a_number"
  * Scenario outline for error cases:
      * enter number too small
      * enter number too big
      * enter text instead of the number
  * Scenario for correct number

#### Task 2
In [Task2.feature](../master/src/test/resources/features/Task2.feature) create 1 scenario outline and
create scenario or scenario outlines for page https://kristinek.github.io/site/tasks/list_of_people.html or https://kristinek.github.io/site/tasks/list_of_people_with_jobs.html
in order to test that user can:
  * add a new person
  * edit a person
  * remove a person
  * reset original list after:
     * adding a person
     * editing a person
     * removing a person
  * check that clear button on adding a user works correctly

### Setup 
[see wiki](https://github.com/KristineK/cucumber_java_basic/wiki/Setup)

---
### GIT

[see wiki for Create-a-branch](https://github.com/KristineK/selenium_java_basic/wiki/Create-a-branch)

[see wiki for Git-add-commit-pust](https://github.com/KristineK/cucumber_java_basic/wiki/Git-add-commit-pust)





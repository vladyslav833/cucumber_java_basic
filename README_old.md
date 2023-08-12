### Structure
#### Same but without Page Object:
* For running tests use [CucumberRunner.java](../master/src/test/java/runners/CucumberRunner.java)
* For step definition use [SampleSteps.java](../master/src/test/java/stepDefinitions/SampleSteps.java)
* Simple scenario example: [Sample1.feature](../master/src/test/resources/features/Sample1.feature)
* Simple scenario with parameters in steps: [Sample2.feature](../master/src/test/resources/features/Sample2.feature)
* Scenario outline example: [Sample3.feature](../master/src/test/resources/features/Sample3.feature)
* Scenario tables with 1 column in steps: [Sample4.feature](../master/src/test/resources/features/Sample4.feature)
* Scenario tables with 2 columns in steps and background example: [Sample5.feature](../master/src/test/resources/features/Sample5.feature)

#### Same but with Page Object:
* For step definition use [SamplePOSteps.java](../master/src/test/java/stepDefinitions/SamplePOSteps.java)
* Simple scenario with parameters in steps: [SampleUsingPO2.feature](../master/src/test/resources/features/SampleUsingPO2.feature)
* Scenario outline example [SampleUsingPO3.feature](../master/src/test/resources/features/SampleUsingPO3.feature)

\+ Page Objects:
* [AgePage.java](../master/src/test/java/pages_sample/AgePage.java)
* [AgeSubmittedPage.java](../master/src/test/java/pages_sample/AgeSubmittedPage.java)


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
  * reset original list after
      * adding a person
      * editing a person
      * removing a person
  * check that clear button on adding a user works correctly
  
  ### Get project 
  1. In Idea "File" -> "New" -> "Project from Version Control" -> "Git"
  2. Select add url https://github.com/KristineK/cucumber_java_basic for cloning project
  3. In IDEA check in project structure, that:
     * Project settings:
     ![Alt text](img/project_settings.png?raw=true "Project Settings")
     * Modules settings:
     ![Alt text](img/module_settings.png?raw=true "Module Settings")
  4. Create a branch:
     ![Alt text](img/git_new_branch_1.png?raw=true "git new branch 1 via IDEA")
     ![Alt text](img/git_new_branch_2.png?raw=true "git new branch 2 via IDEA")
     ![Alt text](img/git_new_branch_3.png?raw=true "git new branch 3 via IDEA")
### Pushing changes to git     
*Git add:*
     ![Alt text](img/git_add.png?raw=true "git add via IDEA")
*Git commit:*
     ![Alt text](img/git_commit_1.png?raw=true "git commit 1 via IDEA")
     ![Alt text](img/git_commit_2.png?raw=true "git commit 2 via IDEA")
     ![Alt text](img/git_commit_3.png?raw=true "git commit 3 via IDEA")
*Git push:*
     ![Alt text](img/git_push_1.png?raw=true "git push 1 via IDEA")
     ![Alt text](img/git_push_2.png?raw=true "git push 2 via IDEA")


1. reset  ---- will change the commit history. (use if code is not pushed to remote)
2. revert ---- will not change the commit history. (use if code is pushed to remote)

A ---- B ----- C ---- D ---- E

git reset commithash
git revert 

=============================================

Github  ----------------------------------      www.xyz.com

deployment 

jar file (java archive)

Maven --- it is a build automation tool. xml
gradle ---

source code ---- build --- jar file --- deploy on a server.


CI --- continuous integration 
CD --- Continuous delivery/development


CI --- It is practice of merging the developers code to a shared repo frequently and with each merge will
automatically trigger build and test process.

UNIT TESTING

# What happens on every code push
1. You pushes the code to remote repo
2. CI server automatically detects the push.
3. Code is automatically compiled/build
4. Automated tests run against the new code
5. BUILD PASSED OR FAILED.


method sum in class A  ---- 1 3 4


AAA --- arrange act assert
3A


Delivery ---- requires human intervention to deliver the code to end users/production.
Deployment ---- no human intervention, code goes directly to production after CI.

CICD tools
1. Jenkins
2. Github Actions
3. Gitlab CI/CD
4. Circle CI
5. Harness


Jenkin 

Intellij ---- Github --- Build (Unit test) --- sonarQube (code quality) ---- QA --- UAT ---- Production


Download and install jenkins









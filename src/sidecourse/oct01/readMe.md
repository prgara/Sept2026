VCS --- Version control system

It is a tool which is used to track, manage and control source code.
- see what exactly changes, when and by who.
- go back to any previous version.

problem without VCS
- No undo
- No history
- Team collision

Git --- it is a distributed version control system, runs locally, no internet required.

Github --- website, internet, host repos, enable team collaboration.
GitLab
Bitbucket

Git was invented by Linus torvalds


Download git and install
Create your account on Github.com


git init --- turn your folder in git tracked folder.

git status --- 

git add --- move file from working dir to staging area

git rm --cached fileName --- remove the file from staging area and move to untracked one


working directory --- your project files
staging area --- files you have marked as yes to be included in next commit.
repository --- your permanent saved history


Local repo ------> (add) Staging area -----> (commit) local commit ----> remote repository (Github, Bitbucket, gitlab)

create a new project and then move to that folder and initialize a git repo and check the status.
create 2 files and commit them. 


life of a file in git
 - Untracked ---- file git does not know about yet.
 - Staged --- Added to staging area, ready to commit.
 - Committed --- Saved permanently in local repo
 - pushed --- sent it to remote repository


staging ----       

commit ---- snapshot of the code at given point of time.

git commit -m "fix login validation bug"



git init ---- 
git clone --- copy the remote code to your local first time

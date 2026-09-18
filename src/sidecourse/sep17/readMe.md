Operating system ??

Interface b/w user & hardware 

What OS does ??
- Memory management
- File mgmt
- process mgmt
- Networking


What are diff OS you are aware about
- IOS
- Windows
- Linux
- Android
- MACOS

WHY LINUX ? 
- Open Source
- CLI
- Secure
- Stable
- Reliability
- Developer friendly

UNIX 
LINUX


UNIX base
- MAC OS
- 
or UNIX like
- Linux
- android

KERNEL  ---- Heart of Linux, memory management, task scheduling 
SHELL   ---- Interprets the commands to the kernel.

BASH
SH
ZSH
CSH
FISH
KSH


-- Commands --

- pwd --- print working directory ------- where I am right now
- ls --- list out all the files & folders in the current directory
- ls -a ---- will list hidden files and folders also
- ls -l ---- detailed view

Editors  ----- VIM, NANO, EMACS


vi fileName --- to go editor
i ---- go to insert mode
ESC --- go to normal mode
:wq --- save & close
:w ---- save 
:q ---- quit 
:q! --- quit w/o saving 

cat --- view the content of the file....


echo "Hello world" > fileName ---- write the text directly to the file and overwrite whatever is there
echo "Hello world" >> fileName ---- append the text to the file


head -2 fileName  ---- show first 2 lines
tail -2 fileName  ---- show last 2 lines

~  ---- tilda ---- home directory
/  ----- root directory

mkdir folderName --- create a new folder
cd folderName  ----- navigate to that folder
cd .. ------ one step back
cd ~ ------ go to home dir
cd / ------ go to root directory


cp ---- copy the file
mv ---- move / rename
rm --- delete a file
rmdir --- del a folder
rm -r directoryName --- forcefully del the directory


find . -name "fileName"  ---- search 


Exercise
create a folder bootcamp and then inside this create a folder session2 and then create a file name readme.txt
edit this file to have "Linux is the backbone of the internet" and save the content
exit the editor and view the content on the console.
Append some content --- "I am running Linux on AWS EC2".
view the content again
copy the content of  file to another file
del the initial file readme.txt

kernel & shell
rm -rf
> >>

ls -l

fileType + permission  memory blocks    owner           group owner   size in bytes      Date & time         file or dir name
-rw-r--r--.              1              ec2-user        ec2-user       26               Sep 18 00:56          readme.txt


wildcards
* ---- any number of any char
? ---- exactly one any char

readme.txt
rea?
rea4
reaabc


/ --- root directory
~ --- home directory

absolute path -----  always starts from root directory.
/Users/lovepreet/Downloads/AugBatch/src/sidecourse/sep24/readMe.md
relative path -----  relative to current directory
src/sidecourse/sep24/readMe.md




wc fileName
lines    words       bytes         filename
1         4            26          readme.txt



sort filename
sort -r filename
sort -u filename

head 
tail


grep --Global regular expression print


info INFO INfo inFO


ls | grep "\.txt"

|  ----> pipe send the o/p from one command to other as input


file type      owner         group             others
-                 rw-          r--               r--

r --- read
w --- write
x --- execute

chmod 
0 -- no permission
1 -- execute only
2 -- write only
4 -- read only
5 -- rx
6 -- rw
7 -- rwx


create 3 files: public, private , execute
set public to owner can read & write, group & other can read only
private --- owner can read & write & group, other will not get any permission
exec ---- owner -- get all perimssions , group & others can read & exceute
change private to read only for user and try to edit the file 


lt
gt
eq
ne
ge
le




{\rtf1\ansi\ansicpg1252\cocoartf1504
{\fonttbl\f0\fnil\fcharset204 PTSans-Regular;\f1\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red109\green109\blue109;\red251\green251\blue251;\red72\green72\blue72;
\red108\green108\blue108;\red109\green109\blue109;\red109\green109\blue109;\red39\green39\blue39;}
{\*\expandedcolortbl;\csgray\c100000;\cssrgb\c50196\c50196\c50196\c40000;\cssrgb\c98824\c98824\c98824;\cssrgb\c35294\c35294\c35294;
\cssrgb\c49804\c49804\c49804;\cssrgb\c50196\c50196\c50196\c7451;\cssrgb\c50196\c50196\c50196\c60000;\cssrgb\c20392\c20392\c20392;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl660\partightenfactor0

\f0\fs61\fsmilli30600 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 #
\b \cf4 \strokec4  Learn Swift and Kotlin in Parallel
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \
\cf5 \cb6 \strokec5 !\cf7 \strokec7 [\cf5 \strokec5 alt tag\cf7 \strokec7 ](https://s13.postimg.org/6shufrw87/simple_netwokr_library.png)\cf4 \cb3 \strokec4 \
\
Swift and Kotlin are two great languages for iOS and Android development respectively. They both have very modern features and syntax that can help enormously to build native apps. But, how do they both compare to each other? Are they similar? Can we reuse more code between platforms if we adopt them in our projects? \
In this series, we are going to learn Swift and Kotlin from beginner to advanced in parallel by giving the same examples.\
\
\cf7 \strokec7 -----------------------------------------------------------------------------------------------------\cf4 \strokec4 \
\
\pard\pardeftab720\sl660\partightenfactor0

\fs61\fsmilli30600 \cf2 \strokec2 #
\b \cf4 \strokec4  Getting Started :
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf7 \strokec7  1. \cf4 \strokec4 Basics.\
\cf7 \strokec7  2. \cf4 \strokec4 Functions.\
\cf7 \strokec7  3. \cf4 \strokec4 Classes.\
\cf7 \strokec7  4. \cf4 \strokec4 Implementing Object Oriented Programming.\
\cf7 \strokec7  5. \cf4 \strokec4 Null Safety.\
\cf7 \strokec7  6. \cf4 \strokec4 Casting.\
\cf7 \strokec7  7. \cf4 \strokec4 Get more familiar with Standard Library of Swift and Kotlin.\
\
\pard\pardeftab720\sl660\partightenfactor0

\fs61\fsmilli30600 \cf2 \strokec2 #
\b \cf4 \strokec4  Tools you need :
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf7 \strokec7 1. \cf4 \strokec4 For Testing Swift code : \
	a. \ul https://swift.sandbox.bluemix.net/#/repl\ulnone \
	b. \ul http://rextester.com/l/swift_online_compiler\ulnone \
\cf7 \strokec7 2. \cf4 \strokec4 For Testing Kotlin code :\
	a. \ul https://try.kotlinlang.org/#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt\ulnone  \
	b. \ul http://rextester.com/l/kotlin_online_compiler\ulnone \
\
\
\cf7 \strokec7 -----------------------------------------------------------------------------------------------------\cf4 \strokec4 \
\
\pard\pardeftab720\sl660\partightenfactor0

\fs61\fsmilli30600 \cf2 \strokec2 #
\b \cf4 \strokec4  Contributing :
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \
We want to make this repository very useful and up-to-date. So, if you want to contribute to this learning series and make it better, your help is very welcome. Contributing is also a great way to learn more about social coding on Github, new technologies and and their ecosystems and how to make constructive, helpful bug reports, feature requests and the noblest of all contributions: a good, clean pull request.\
\
\pard\pardeftab720\sl540\partightenfactor0

\fs50\fsmilli25200 \cf2 \strokec2 ##
\b \cf4 \strokec4  How to make a clean pull request
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \
\cf7 \strokec7 - \cf4 \strokec4 Create a personal fork of the project on Github.\
\cf7 \strokec7 - \cf4 \strokec4 Clone the fork on your local machine. Your remote repo on Github is called 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 origin\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4 .\
\cf7 \strokec7 - \cf4 \strokec4 Add the original repository as a remote called 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 upstream\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4 .\
\cf7 \strokec7 - \cf4 \strokec4 If you created your fork a while ago be sure to pull upstream changes into your local repository.\
\cf7 \strokec7 - \cf4 \strokec4 Create a new branch to work on! Branch from 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 develop\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4  if it exists, else from 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 master\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4 .\
\cf7 \strokec7 - \cf4 \strokec4 Add/Implement/Fix your feature, comment your code.\
\cf7 \strokec7 - \cf4 \strokec4 Follow the code style of the project.\
\cf7 \strokec7 - \cf4 \strokec4 Add or change the documentation as needed.\
\cf7 \strokec7 - \cf4 \strokec4 Update/Add the README.md with details of changes you made.\
\cf7 \strokec7 - \cf4 \strokec4 Push your branch to your fork on Github, the remote 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 origin\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4 .\
\cf7 \strokec7 - \cf4 \strokec4 From your fork open a pull request in the correct branch. Target the project's 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 develop\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4  branch if there is one, else go for 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 master\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4 .\
\cf7 \strokec7 - \cf4 \strokec4 Once the pull request is approved and merged you can pull the changes from 
\f1\fs32\fsmilli16200 \cf7 \cb6 \strokec7 `\cf8 \strokec8 upstream\cf7 \strokec7 `
\f0\fs36 \cf4 \cb3 \strokec4  to your local repo and delete\
your extra branch(es).\
\
\cf7 \strokec7 -----------------------------------------------------------------------------------------------------\cf4 \strokec4 \
\
\pard\pardeftab720\sl660\partightenfactor0

\fs61\fsmilli30600 \cf2 \strokec2 #
\b \cf4 \strokec4  References :
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf4 \
This series is built by helping from a lot of people, blogs, and websites.\
\
\pard\pardeftab720\sl460\partightenfactor0

\fs43\fsmilli21600 \cf2 \strokec2 ###
\b \cf4 \strokec4  Kotlin References :
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf7 \strokec7 1. \cf4 \strokec4 Hadi Hariri Talks at Google I/O 2017.\
\cf7 \strokec7 2. \cf4 \strokec4 Intellij Kotlin Reference.\
\pard\pardeftab720\sl460\partightenfactor0

\fs43\fsmilli21600 \cf2 \strokec2 ###
\b \cf4 \strokec4  Swift References :
\b0\fs36 \
\pard\pardeftab720\sl460\partightenfactor0
\cf7 \strokec7 1. \cf4 \strokec4 Language Guide of Developer Apple Website\
\cf7 \strokec7 2. \cf4 \strokec4 Islam Ibrahim and Ahmad Assuity.\
\
}
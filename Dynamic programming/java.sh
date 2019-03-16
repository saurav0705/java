#!/bin/bash/
read -p "Enter Name Of File:  " var
mkdir $var
cd $var
touch "$var.java"
echo "
import java.io.*;
import java.util.*;

class $var{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}
">>$var.java
exit 0; 
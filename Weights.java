

import java.util.*;

import java.lang.*;

import java.io.*;

class Codechef

{

public static void main (String[] args) throws java.lang.Exception

    {

// your code goes here

Scanner sc = new Scanner(System.in);

int t = sc.nextInt();

while(t-- > 0){

int w = sc.nextInt();

int x = sc.nextInt();

int y = sc.nextInt();

int z = sc.nextInt();

if(x==w || y==w || z==w || (x+y)==w || (x+y+z)==w ||(y+z)==w || (z+x)==w){

System.out.println("YES");

    }

else{

System.out.println("NO");

    }

}

    }

}



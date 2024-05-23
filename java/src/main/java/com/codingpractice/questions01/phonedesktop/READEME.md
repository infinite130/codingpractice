# Phone Desktop

Little Rosie has a phone with a desktop (or launcher, as it is also called). <br/>
The desktop can consist of several screens. Each screen is represented as a grid of size 5×3
, i.e., five rows and three columns. <p/>

There are x applications with an icon size of 1×1 cells;  <br/>
such an icon occupies only one cell of the screen.  <br/>
There are also y applications with an icon size of 2×2 cells;  <br/>
such an icon occupies a square of 4 cells on the screen.  <br/>
Each cell of each screen can be occupied by no more than one icon. <p/>

Rosie wants to place the application icons on the minimum number of screens. <br/>
Help her find the minimum number of screens needed.<br/>

## Input
The first line of the input contains t(1≤t≤104
) — the number of test cases.
<br/>

The first and only line of each test case contains two integers x
and y(0≤x,y≤99
) — the number of applications with a 1×1
icon and the number of applications with a 2×2
icon, respectively.

## Output
For each test case, output the minimal number of required screens on a separate line.